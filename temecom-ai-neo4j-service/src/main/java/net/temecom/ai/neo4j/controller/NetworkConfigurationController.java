package net.temecom.ai.neo4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import net.temecom.ai.model.neuralNetwork.NetworkConfiguration;
import net.temecom.ai.neo4j.repository.EntityRepository;
import net.temecom.ai.neo4j.repository.NetworkConfigurationRepository;
@RequestMapping(value="/networkConfigurations")
public class NetworkConfigurationController extends EntityController<NetworkConfiguration>{

	@Autowired
	private NetworkConfigurationRepository repository; 
	
	@Override
	public EntityRepository<NetworkConfiguration> getRepository() {
		return this.repository;
	}
}
