package net.temecom.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.neuralNetwork.InputLayerConfiguration;
import net.temecom.ai.repository.EntityRepository;

@RestController
@RequestMapping(value="/inputLayerConfigurations")
public class InputLayerController extends EntityController<InputLayerConfiguration>{
	@Autowired
	protected EntityRepository<InputLayerConfiguration> repository ;

	public EntityRepository<InputLayerConfiguration> getRepository() {return repository;}
	
}
