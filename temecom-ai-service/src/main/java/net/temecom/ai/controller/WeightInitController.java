package net.temecom.ai.controller;

import org.deeplearning4j.nn.weights.WeightInit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/weightInits")
public class WeightInitController extends EnumerationController<WeightInit>{

	@Override
	public WeightInit[] getEnumerationValues() {
		return WeightInit.values();
	}
	
}
