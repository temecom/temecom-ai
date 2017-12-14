package net.temecom.ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.NeuralNetworkConfiguration;
import net.temecom.ai.repository.ConfigurationRepository;

@RestController
@RequestMapping("/instances")
public class InstanceController {
	
	@Autowired
	private ConfigurationRepository repository ;
		
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public NeuralNetworkConfiguration createConfiguration(@RequestBody NeuralNetworkConfiguration configuration) {
		repository.save(configuration);
		return configuration;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<NeuralNetworkConfiguration> getConfigurations() {
		return repository.findAll();
	}
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public NeuralNetworkConfiguration updateConfiguration(@RequestBody NeuralNetworkConfiguration configuration, @PathVariable String  id) {
		repository.save(configuration);
		return configuration;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public List<NeuralNetworkConfiguration> getConfiguration(@PathVariable String  id) {
		return repository.findAll();
	}
}
