package net.temecom.ai.model;

import java.util.UUID;

import org.nd4j.shade.jackson.annotation.JsonIdentityInfo;
import org.nd4j.shade.jackson.annotation.JsonSubTypes;
import org.nd4j.shade.jackson.annotation.JsonSubTypes.Type;
import org.nd4j.shade.jackson.annotation.JsonTypeInfo;
import org.nd4j.shade.jackson.annotation.ObjectIdGenerators;

import org.springframework.data.annotation.Id;

import net.temecom.ai.model.neuralNetwork.DenseLayerConfiguration;
import net.temecom.ai.model.neuralNetwork.InputLayerConfiguration;
import net.temecom.ai.model.neuralNetwork.Instance;
import net.temecom.ai.model.neuralNetwork.NetworkConfiguration;
import net.temecom.ai.model.neuralNetwork.OutputLayerConfiguration;
import org.neo4j.ogm.annotation.NodeEntity;
@NodeEntity
@JsonTypeInfo(
		  use = JsonTypeInfo.Id.CLASS, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "className")
		@JsonSubTypes({ 
		  @Type(value = Instance.class), 
		  @Type(value = NetworkConfiguration.class),
		  @Type(value=DenseLayerConfiguration.class),
		  @Type(value=OutputLayerConfiguration.class),
		  @Type(value=InputLayerConfiguration.class)
		})

public class AIEntity {
	@Id
	protected UUID id;
	
	protected String className;
	
	protected String name; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String type) {
		this.className = type;
	}
}
