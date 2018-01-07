package net.temecom.ai.model.enumeration;

import net.temecom.ai.model.neuralNetwork.LayerConfiguration;
import net.temecom.ai.model.neuralNetwork.DenseLayerConfiguration;
import net.temecom.ai.model.neuralNetwork.OutputLayerConfiguration;
import net.temecom.ai.model.neuralNetwork.InputLayerConfiguration;
public enum LayerType {
	DENSE_LAYER(DenseLayerConfiguration.class),
	OUTPUT_LAYER(OutputLayerConfiguration.class),
	INPUT_LAYER(InputLayerConfiguration.class);
	 Class<? extends LayerConfiguration> layerClass; 
	<T extends LayerConfiguration> LayerType(Class<T> layerClass ) {
		this.layerClass = layerClass;
	}
	 Class<? extends LayerConfiguration> layerClass() {
		return this.layerClass;
	}
	 
	 public String className() {
		 return this.layerClass.getName();
	 }
}
