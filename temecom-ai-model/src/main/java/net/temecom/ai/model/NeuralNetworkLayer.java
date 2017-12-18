package net.temecom.ai.model;

import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.weights.WeightInit;
import org.nd4j.linalg.activations.Activation;

public class NeuralNetworkLayer extends AIEntity {
	protected Integer numberOfInputs;
	protected Integer numberOfOutputs;
	protected WeightInit weightInitialization;
	protected Activation activation; 
	protected NeuralNetConfiguration configuration;
	
	public Integer getNumberOfInputs() {
		return numberOfInputs;
	}
	public void setNumberOfInputs(Integer numberOfInputs) {
		this.numberOfInputs = numberOfInputs;
	}
	public Integer getNumberOfOutputs() {
		return numberOfOutputs;
	}
	public void setNumberOfOutputs(Integer numberOfOutputs) {
		this.numberOfOutputs = numberOfOutputs;
	}
	public WeightInit getWeightInitialization() {
		return weightInitialization;
	}
	public void setWeightInitialization(WeightInit weightInitialization) {
		this.weightInitialization = weightInitialization;
	}
	public Activation getActivation() {
		return activation;
	}
	public void setActivation(Activation activation) {
		this.activation = activation;
	}
	public NeuralNetConfiguration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(NeuralNetConfiguration configuration) {
		this.configuration = configuration;
	} 
}
