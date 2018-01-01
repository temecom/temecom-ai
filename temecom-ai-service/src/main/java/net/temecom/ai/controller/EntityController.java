package net.temecom.ai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.AIEntity;
import net.temecom.ai.repository.EntityRepository;

@RestController
@RequestMapping("/entities")
public abstract class  EntityController <T extends AIEntity>{
	
	abstract public EntityRepository<T> getRepository() ;
	public EntityRepository<T> getRepository(String className){
		return this.getRepository();
	}
		
	@RequestMapping(value="", method=RequestMethod.POST)
	public T createEntity(@RequestBody T entity) {
		getRepository(entity.getClassName()).save(entity);
		return entity;
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<T> getEntities() {
		return getRepository().findAll();
	}
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public T updateEntity(@RequestBody T entity, @PathVariable String  id) {
		getRepository(entity.getClassName()).save(entity);
		return entity;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public T getEntity(@PathVariable String  id) {
		return getRepository().findOne(id);
	}
}
