package net.temecom.ai.model;

import org.nd4j.shade.jackson.annotation.JsonIdentityInfo;
import org.nd4j.shade.jackson.annotation.JsonSubTypes;
import org.nd4j.shade.jackson.annotation.JsonSubTypes.Type;
import org.nd4j.shade.jackson.annotation.JsonTypeInfo;
import org.nd4j.shade.jackson.annotation.ObjectIdGenerators;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import net.temecom.ai.model.neuralNetwork.DenseLayerConfiguration;
import net.temecom.ai.model.neuralNetwork.Instance;
import net.temecom.ai.model.neuralNetwork.NetworkConfiguration;
import net.temecom.ai.model.neuralNetwork.OutputLayerConfiguration;

@JsonTypeInfo(
		  use = JsonTypeInfo.Id.CLASS, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "_class")
		@JsonSubTypes({ 
		  @Type(value = Instance.class), 
		  @Type(value = NetworkConfiguration.class),
		  @Type(value=DenseLayerConfiguration.class),
		  @Type(value=OutputLayerConfiguration.class)
		})
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class,
		  property = "id")
public class AIEntity {
	@Id
	protected String id;
	
	@Field("_class")
	protected String className;
	
	protected String name; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String type) {
		this.className = type;
	}
}
