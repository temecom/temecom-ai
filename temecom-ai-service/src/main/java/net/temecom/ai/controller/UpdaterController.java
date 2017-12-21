package net.temecom.ai.controller;


import org.deeplearning4j.nn.conf.Updater;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/updaters")
public class UpdaterController extends EnumerationController<Updater>{

	@Override
	public Updater[] getEnumerationValues() {
		return Updater.values();
	}
	
}
