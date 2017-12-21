package net.temecom.ai.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.nd4j.linalg.lossfunctions.LossFunctions.LossFunction;

@RestController
@RequestMapping(value="/lossFunctions")
public class LossFunctionController extends EnumerationController<LossFunction>{

	@Override
	public LossFunction[] getEnumerationValues() {
		return LossFunction.values();
	}
	
}
