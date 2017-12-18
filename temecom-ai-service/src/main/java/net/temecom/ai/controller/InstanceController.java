package net.temecom.ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.NeuralNetworkInstance;
import net.temecom.ai.repository.InstanceRepository;
import net.temecom.ai.service.AIService;

@RestController
@RequestMapping("/instances")
public class InstanceController {
	
	@Autowired
	private InstanceRepository repository ;
		
	@Autowired
	private AIService service; 
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public NeuralNetworkInstance createInstance(@RequestBody NeuralNetworkInstance instance) {
		repository.save(instance);
		return instance;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<NeuralNetworkInstance> getInstances() {
		return repository.findAll();
	}
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public NeuralNetworkInstance updateInstance(@RequestBody NeuralNetworkInstance instance, @PathVariable String  id) {
		repository.save(instance);
		return instance;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public NeuralNetworkInstance getInstance(@PathVariable String  id) {
		return repository.findOne(id);
	}
	
	@RequestMapping(value="/{id}/activate", method=RequestMethod.GET)
	public NeuralNetworkInstance activateInstance(@PathVariable String  id) {
		return service.activate(id);
	}
}
