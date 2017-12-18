package net.temecom.ai.model;

import org.nd4j.linalg.lossfunctions.LossFunctions.LossFunction;

public class NeuralNetworkOutputLayer extends NeuralNetworkLayer {

	private LossFunction lossFunction;

	public LossFunction getLossFunction() {
		return lossFunction;
	}

	public void setLossFunction(LossFunction lossFunction) {
		this.lossFunction = lossFunction;
	}  
}
