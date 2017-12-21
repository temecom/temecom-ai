package net.temecom.ai.model.neuralNetwork;

import java.util.List;

import org.deeplearning4j.nn.api.OptimizationAlgorithm;
import org.deeplearning4j.nn.conf.Updater;
import org.deeplearning4j.nn.weights.WeightInit;
import org.nd4j.linalg.activations.Activation;
import org.springframework.data.mongodb.core.mapping.Document;

import net.temecom.ai.model.AIEntity;

@Document
public class NetworkConfiguration extends AIEntity {

	protected Integer iterations;
	protected WeightInit weightInit;
	protected Activation activation;
	protected OptimizationAlgorithm optimizationAlgorithm;
	protected Float learningRate;
	protected Boolean backprop;
	protected Integer seed;
	protected Updater updater;
	List<LayerConfiguration> layers;
	
	public Integer getIterations() {
		return iterations;
	}
	public void setIterations(Integer iterations) {
		this.iterations = iterations;
	}
	public WeightInit getWeightInit() {
		return weightInit;
	}
	public void setWeightInit(WeightInit weightInit) {
		this.weightInit = weightInit;
	}
	public Activation getActivation() {
		return activation;
	}
	public void setActivation(Activation activation) {
		this.activation = activation;
	}
	public OptimizationAlgorithm getOptimizationAlgorithm() {
		return optimizationAlgorithm;
	}
	public void setOptimizationAlgorithm(OptimizationAlgorithm optimizationAlgorithm) {
		this.optimizationAlgorithm = optimizationAlgorithm;
	}
	public Float getLearningRate() {
		return learningRate;
	}
	public void setLearningRate(Float learningRate) {
		this.learningRate = learningRate;
	}
	public Boolean getBackprop() {
		return backprop;
	}
	public void setBackprop(Boolean backprop) {
		this.backprop = backprop;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSeed() {
		return seed;
	}
	public void setSeed(Integer seed) {
		this.seed = seed;
	}
	public Updater getUpdater() {
		return null;
	}
	public void setUpdater(Updater updater) {
		this.updater = updater;
	}
	public List<LayerConfiguration> getLayers() {
		return layers;
	}
	public void setLayers(List<LayerConfiguration> layers) {
		this.layers = layers;
	}
}
