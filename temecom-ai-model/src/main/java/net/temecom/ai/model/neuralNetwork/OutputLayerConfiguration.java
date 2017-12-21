package net.temecom.ai.model.neuralNetwork;

import org.nd4j.linalg.lossfunctions.LossFunctions.LossFunction;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OutputLayerConfiguration extends LayerConfiguration {

	private LossFunction lossFunction;

	public LossFunction getLossFunction() {
		return lossFunction;
	}

	public void setLossFunction(LossFunction lossFunction) {
		this.lossFunction = lossFunction;
	}  
}
