package net.temecom.ai.model;

import org.deeplearning4j.nn.api.OptimizationAlgorithm;
import org.deeplearning4j.nn.weights.WeightInit;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class NeuralNetworkConfiguration extends AIEntity {

	protected Integer iterations;
	protected WeightInit weightInit;
	protected String activation;
	protected OptimizationAlgorithm optimizationAlgorithm;
	protected Float learningRate;
	protected Boolean backprop;
	protected String name; 
	
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
	public String getActivation() {
		return activation;
	}
	public void setActivation(String activation) {
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
}
