package net.temecom.ai.model.neuralNetwork;

import org.neo4j.ogm.annotation.NodeEntity;
@NodeEntity
public class DenseLayerConfiguration extends LayerConfiguration {
	private Integer numberOfHiddenNodes;

	public Integer getNumberOfHiddenNodes() {
		return numberOfHiddenNodes;
	}

	public void setNumberOfHiddenNodes(Integer numberOfHiddenNodes) {
		this.numberOfHiddenNodes = numberOfHiddenNodes;
	}
}
