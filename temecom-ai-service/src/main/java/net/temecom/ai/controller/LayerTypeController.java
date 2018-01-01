package net.temecom.ai.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.enumeration.LayerType;

import org.nd4j.linalg.lossfunctions.LossFunctions.LossFunction;

@RestController
@RequestMapping(value="/layerTypes")
public class LayerTypeController extends EnumerationController<LayerType>{

	@Override
	public LayerType[] getEnumerationValues() {
		return LayerType.values();
	}
	
}
