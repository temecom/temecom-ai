package net.temecom.ai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.temecom.ai.model.neuralNetwork.LayerConfiguration;

public interface LayerConfigurationRepository extends MongoRepository<LayerConfiguration, String>{
	LayerConfiguration findOne(String id);
}
