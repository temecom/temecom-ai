package net.temecom.ai.model.neuralNetwork;

import java.util.Date;

import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.nd4j.shade.jackson.annotation.JsonIgnore;
import org.nd4j.shade.jackson.annotation.JsonManagedReference;
import org.springframework.data.mongodb.core.mapping.Document;

import net.temecom.ai.model.AIEntity;

@Document
public class Instance extends AIEntity{

	private Date startTime;
	private NetworkConfiguration networkConfiguration; 
	private InstanceStatus instanceStatus;
	@JsonIgnore
	private NeuralNetConfiguration neuralNetwork; 
	

	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public NetworkConfiguration getConfiguration() {
		return networkConfiguration;
	}
	public void setConfiguration(NetworkConfiguration networkConfiguration) {
		this.networkConfiguration = networkConfiguration;
	}
	public InstanceStatus getInstanceStatus() {
		return instanceStatus;
	}
	public void setInstanceStatus(InstanceStatus status) {
		this.instanceStatus = status;
	}
	public NeuralNetConfiguration getNeuralNetwork() {
		return neuralNetwork;
	}
	@JsonIgnore
	public void setNeuralNetwork(NeuralNetConfiguration neuralNetwork) {
		this.neuralNetwork = neuralNetwork;
	}
	@JsonIgnore
	public NetworkConfiguration getNetworkConfiguration() {
		return networkConfiguration;
	}

	public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
		this.networkConfiguration = networkConfiguration;
	}
}
