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

import net.temecom.ai.model.NeuralNetworkConfiguration;
import net.temecom.ai.model.NeuralNetworkDenseLayer;
import net.temecom.ai.model.NeuralNetworkInstance;
import net.temecom.ai.model.NeuralNetworkLayer;
import net.temecom.ai.model.NeuralNetworkOutputLayer;
import net.temecom.ai.repository.InstanceRepository;

@Service
public class AIService {

	
	Map<String, NeuralNetworkInstance> activeInstances = new HashMap<>();
	
	@Autowired
	private InstanceRepository repository ;
	
	public NeuralNetworkInstance activate(String id) {
 
		NeuralNetworkInstance instance = repository.findOne(id);
		NeuralNetworkConfiguration configuration = instance.getConfiguration();
		NeuralNetConfiguration.Builder builder = new NeuralNetConfiguration.Builder()
	                .seed(configuration.getSeed())
	                .iterations(configuration.getIterations())
	                .optimizationAlgo(configuration.getOptimizationAlgorithm())
	                .learningRate(configuration.getLearningRate())
	                .updater(configuration.getUpdater());  
		int index = 0;
		Layer layer = null;
		for (NeuralNetworkLayer layerConfiguration: configuration.getLayers()) {
			switch (layerConfiguration.getClassName()) {
			case "NeuralNetworkDenseLayer": 
				NeuralNetworkDenseLayer denseLayerConfiguration = (NeuralNetworkDenseLayer) layerConfiguration; 
				layer = new DenseLayer.Builder()
					.nIn(denseLayerConfiguration.getNumberOfInputs())
					.nOut(denseLayerConfiguration.getNumberOfHiddenNodes())
                        .weightInit(layerConfiguration.getWeightInitialization())
                        .activation(layerConfiguration.getActivation())
                        .build(); 
				break;
			case "NeuralNetworkOutputLayer":
				NeuralNetworkOutputLayer outputLayer = (NeuralNetworkOutputLayer) layerConfiguration; 
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
