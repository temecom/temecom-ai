package net.temecom.ai.model.neuralNetwork;

import org.nd4j.shade.jackson.databind.JsonNode;
import org.springframework.data.mongodb.core.mapping.Document;

import net.temecom.ai.model.AIEntity;

@Document
public class TrainingSet extends AIEntity {

	private JsonNode data;

	public JsonNode getData() {
		return data;
	}

	public void setData(JsonNode data) {
		this.data = data;
	} 
}
