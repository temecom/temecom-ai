package net.temecom.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.neuralNetwork.OutputLayerConfiguration;
import net.temecom.ai.repository.EntityRepository;

@RestController
@RequestMapping(value="/outputLayerConfigurations")
public class OutputLayerController extends EntityController<OutputLayerConfiguration>{
	
	@Autowired
	private EntityRepository<OutputLayerConfiguration> repository ;

	@Override
	public EntityRepository<OutputLayerConfiguration> getRepository() {
		return this.repository;
	}
}
