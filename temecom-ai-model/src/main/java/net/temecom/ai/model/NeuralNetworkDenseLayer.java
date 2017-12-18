package net.temecom.ai.model;

public class NeuralNetworkDenseLayer extends NeuralNetworkLayer {
	private Integer numberOfHiddenNodes;

	public Integer getNumberOfHiddenNodes() {
		return numberOfHiddenNodes;
	}

	public void setNumberOfHiddenNodes(Integer numberOfHiddenNodes) {
		this.numberOfHiddenNodes = numberOfHiddenNodes;
	}
}
