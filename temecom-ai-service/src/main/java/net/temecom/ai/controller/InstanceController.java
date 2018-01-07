package net.temecom.ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.neuralNetwork.Instance;
import net.temecom.ai.model.neuralNetwork.InstanceStatus;
import net.temecom.ai.repository.EntityRepository;
import net.temecom.ai.service.AIService;

@RestController
@RequestMapping("/instances")
public class InstanceController extends EntityController<Instance>{
	
	@Autowired
	protected EntityRepository<Instance> repository ;
		
	@Autowired
	private AIService service; 
	
	
	@RequestMapping(value="/{id}/activate", method=RequestMethod.GET)
	public Instance activateInstance(@PathVariable String  id) {		
		return service.activate(id);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	@Override
	public Instance updateEntity(@RequestBody Instance entity, @PathVariable String  id) {
		getRepository().save(entity);
		if (InstanceStatus.RUNNING.equals(entity.getInstanceStatus())) {
			service.activate(entity.getId());
		}
		return entity;
	}

	@Override
	public EntityRepository<Instance> getRepository() {
		
		return this.repository;
	}
}
