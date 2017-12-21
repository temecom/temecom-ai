package net.temecom.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.neuralNetwork.DenseLayerConfiguration;
import net.temecom.ai.repository.EntityRepository;

@RestController
@RequestMapping(value="/denseLayerConfigurations")
public class DenseLayerController extends EntityController<DenseLayerConfiguration>{
	@Autowired
	protected EntityRepository<DenseLayerConfiguration> repository ;

	public EntityRepository<DenseLayerConfiguration> getRepository() {return repository;}
	
}
