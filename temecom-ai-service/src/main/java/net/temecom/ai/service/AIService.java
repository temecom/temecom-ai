package net.temecom.ai.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.conf.layers.Layer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.temecom.ai.model.neuralNetwork.NetworkConfiguration;
import net.temecom.ai.model.neuralNetwork.DenseLayerConfiguration;
import net.temecom.ai.model.neuralNetwork.Instance;
import net.temecom.ai.model.neuralNetwork.LayerConfiguration;
import net.temecom.ai.model.neuralNetwork.OutputLayerConfiguration;
import net.temecom.ai.repository.InstanceRepository;

@Service
public class AIService {

	
	Map<String, Instance> activeInstances = new HashMap<>();
	
	@Autowired
	private InstanceRepository repository ;
	
	public Instance activate(String id) {
 
		Instance instance = repository.findOne(id);
		NetworkConfiguration networkConfiguration = instance.getConfiguration();
		NeuralNetConfiguration.Builder builder = new NeuralNetConfiguration.Builder()
	                .seed(networkConfiguration.getSeed())
	                .iterations(networkConfiguration.getIterations())
	                .optimizationAlgo(networkConfiguration.getOptimizationAlgorithm())
	                .learningRate(networkConfiguration.getLearningRate())
	                .updater(networkConfiguration.getUpdater());  
		int index = 0;
		Layer layer = null;
		for (LayerConfiguration layerConfiguration: networkConfiguration.getLayers()) {
			switch (layerConfiguration.getClassName()) {
			case "DenseLayerConfiguration": 
				DenseLayerConfiguration denseLayerConfiguration = (DenseLayerConfiguration) layerConfiguration; 
				layer = new DenseLayer.Builder()
					.nIn(denseLayerConfiguration.getNumberOfInputs())
					.nOut(denseLayerConfiguration.getNumberOfHiddenNodes())
                        .weightInit(layerConfiguration.getWeightInitialization())
                        .activation(layerConfiguration.getActivation())
                        .build(); 
				break;
			case "OutputLayerConfiguration":
				OutputLayerConfiguration outputLayer = (OutputLayerConfiguration) layerConfiguration; 
				layer = new OutputLayer.Builder(outputLayer.getLossFunction())
                .weightInit(outputLayer.getWeightInitialization())
                .activation(outputLayer.getActivation())
                .weightInit(outputLayer.getWeightInitialization())
                .nIn(outputLayer.getNumberOfInputs()).nOut(outputLayer.getNumberOfOutputs())
                .build();
			}
			builder.list().layer(index++, layer);
		}
		builder.list().pretrain(false).backprop(true);
		instance.setNeuralNetwork(builder.build());
		instance.setStartTime(new Date());
		activeInstances.put(instance.getId(), instance);
		return instance;
	}
	
}
