package net.temecom.ai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.neuralNetwork.DenseLayerConfiguration;
import net.temecom.ai.model.neuralNetwork.LayerConfiguration;
import net.temecom.ai.model.neuralNetwork.OutputLayerConfiguration;
import net.temecom.ai.repository.EntityRepository;

@RestController
@RequestMapping(value="/layerConfigurations")
public class LayerConfigurationController {
	
	@Autowired
	private EntityRepository<DenseLayerConfiguration> denseLayerRepository ;

	@Autowired
	private EntityRepository<OutputLayerConfiguration> outputLayerRepository ;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<LayerConfiguration> getEntities() {
		List<LayerConfiguration> layers = new ArrayList<>();
		layers.addAll(denseLayerRepository.findAll());
		layers.addAll(outputLayerRepository.findAll());
		return layers;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public LayerConfiguration getEntity(@PathVariable String  id) {
		LayerConfiguration layer  =  denseLayerRepository.findOne(id);
		if (layer == null) {
			layer  =  outputLayerRepository.findOne(id);
		}
		return layer; 
	}
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public LayerConfiguration updateEntity(@RequestBody LayerConfiguration entity, @PathVariable String  id) {
		if (DenseLayerConfiguration.class.equals(entity.getClass())) {
			denseLayerRepository.save((DenseLayerConfiguration)entity);
		} else {
			outputLayerRepository.save((OutputLayerConfiguration) entity);
		}
		return entity;
	}
}
