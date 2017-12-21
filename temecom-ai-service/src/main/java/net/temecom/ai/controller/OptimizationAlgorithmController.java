package net.temecom.ai.controller;

import org.deeplearning4j.nn.api.OptimizationAlgorithm;
import org.nd4j.linalg.activations.Activation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/optimizationAlgorithms")
public class OptimizationAlgorithmController extends EnumerationController<OptimizationAlgorithm>{

	@Override
	public OptimizationAlgorithm[] getEnumerationValues() {
		return OptimizationAlgorithm.values();
	}
	
}
