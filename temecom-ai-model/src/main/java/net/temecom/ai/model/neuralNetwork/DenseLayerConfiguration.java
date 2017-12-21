package net.temecom.ai.model.neuralNetwork;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DenseLayerConfiguration extends LayerConfiguration {
	private Integer numberOfHiddenNodes;

	public Integer getNumberOfHiddenNodes() {
		return numberOfHiddenNodes;
	}

	public void setNumberOfHiddenNodes(Integer numberOfHiddenNodes) {
		this.numberOfHiddenNodes = numberOfHiddenNodes;
	}
}
