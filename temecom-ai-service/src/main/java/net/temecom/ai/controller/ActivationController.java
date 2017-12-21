package net.temecom.ai.controller;

import org.nd4j.linalg.activations.Activation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/activations")
public class ActivationController extends EnumerationController<Activation>{

	@Override
	public Activation[] getEnumerationValues() {
		return Activation.values();
	}
	
}
