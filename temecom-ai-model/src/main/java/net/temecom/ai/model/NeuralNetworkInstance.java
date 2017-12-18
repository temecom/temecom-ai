package net.temecom.ai.model;

import java.util.Date;

import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class NeuralNetworkInstance extends AIEntity{
	private String name; 
	private Date startTime;
	private NeuralNetworkConfiguration configuration; 
	private NeuralNetworkStatus status;
	private NeuralNetConfiguration neuralNetwork; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public NeuralNetworkConfiguration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(NeuralNetworkConfiguration configuration) {
		this.configuration = configuration;
	}
	public NeuralNetworkStatus getStatus() {
		return status;
	}
	public void setStatus(NeuralNetworkStatus status) {
		this.status = status;
	}
	public NeuralNetConfiguration getNeuralNetwork() {
		return neuralNetwork;
	}
	public void setNeuralNetwork(NeuralNetConfiguration neuralNetwork) {
		this.neuralNetwork = neuralNetwork;
	}
	
}
