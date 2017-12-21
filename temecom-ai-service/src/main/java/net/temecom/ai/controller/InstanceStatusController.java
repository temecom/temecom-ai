package net.temecom.ai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.neuralNetwork.InstanceStatus;

@RestController
@RequestMapping(value="/instanceStatuses")
public class InstanceStatusController extends EnumerationController<InstanceStatus>{

	@Override
	public InstanceStatus[] getEnumerationValues() {
		return InstanceStatus.values();
	}
	
}
