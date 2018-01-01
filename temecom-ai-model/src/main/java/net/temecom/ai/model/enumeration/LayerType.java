package net.temecom.ai.model.enumeration;

import net.temecom.ai.model.neuralNetwork.LayerConfiguration;
import net.temecom.ai.model.neuralNetwork.DenseLayerConfiguration;
import net.temecom.ai.model.neuralNetwork.OutputLayerConfiguration;
public enum LayerType {
	DENSE_LAYER(DenseLayerConfiguration.class),
	OUTPUT_LAYER(OutputLayerConfiguration.class);
	 Class<? extends LayerConfiguration> layerClass; 
	<T extends LayerConfiguration> LayerType(Class<T> layerClass ) {
		this.layerClass = layerClass;
	}
	 Class<? extends LayerConfiguration> layerClass() {
		return this.layerClass;
	}
}
