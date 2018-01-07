package net.temecom.ai.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.enumeration.LayerType;

import java.util.List;
import java.util.Map;

import org.nd4j.linalg.lossfunctions.LossFunctions.LossFunction;

@RestController
@RequestMapping(value="/layerTypes")
public class LayerTypeController extends EnumerationController<LayerType>{

	@Override
	public LayerType[] getEnumerationValues() {
		return LayerType.values();
	}

	@Override
	public List<Map<String, String>> getEnumerations() {
		List<Map<String,String>> enumerations = super.getEnumerations();
		for (Map<String, String> enumeration: enumerations) {
			enumeration.put("className", LayerType.valueOf(enumeration.get("id")).className());
		}
		return enumerations;
	}
	
}
