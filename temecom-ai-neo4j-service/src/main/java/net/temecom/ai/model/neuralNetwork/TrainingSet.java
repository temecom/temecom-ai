package net.temecom.ai.model.neuralNetwork;

import org.nd4j.shade.jackson.databind.JsonNode;

import net.temecom.ai.model.AIEntity;

public class TrainingSet extends AIEntity {

	private JsonNode data;

	public JsonNode getData() {
		return data;
	}

	public void setData(JsonNode data) {
		this.data = data;
	} 
}
