package net.temecom.ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.neuralNetwork.LayerConfiguration;
import net.temecom.ai.repository.EntityRepository;
import net.temecom.ai.repository.OutputLayerConfigurationRepository;

@RestController
@RequestMapping(value="/outputLayerConfigurations")
public class OutputLayerController extends EntityController<LayerConfiguration>{
	
	@Autowired
	private EntityRepository<LayerConfiguration> repository ;

	@Override
	public EntityRepository<LayerConfiguration> getRepository() {
		
		return this.repository;
	}
}
