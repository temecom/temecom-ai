package net.temecom.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.temecom.ai.model.neuralNetwork.NetworkConfiguration;
import net.temecom.ai.repository.EntityRepository;

/**
 * Controller for NetworkConfigurations
 * @see net.temecom.ai.repository.EntityRepository
 * for more details
 * @author csmith
 *
 */


@RestController
@RequestMapping(value="/networkConfigurations")
public class NetworkController extends EntityController<NetworkConfiguration>{
	
	@Autowired
	protected EntityRepository<NetworkConfiguration> repository ;

	@Override
	public EntityRepository<NetworkConfiguration> getRepository() {
		return this.repository;
	}
		
	
}
