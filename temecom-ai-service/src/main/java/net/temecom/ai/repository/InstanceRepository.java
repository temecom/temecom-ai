package net.temecom.ai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.temecom.ai.model.NeuralNetworkInstance;

public interface InstanceRepository extends MongoRepository<NeuralNetworkInstance, String>{
	NeuralNetworkInstance findOne(String id);
}
