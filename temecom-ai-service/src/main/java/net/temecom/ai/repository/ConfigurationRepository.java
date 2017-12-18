package net.temecom.ai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.temecom.ai.model.NeuralNetworkConfiguration;

public interface ConfigurationRepository extends MongoRepository<NeuralNetworkConfiguration, String>{
	NeuralNetworkConfiguration findOne(String id);
}
