package net.temecom.ai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.temecom.ai.model.neuralNetwork.Instance;

public interface InstanceRepository extends MongoRepository<Instance, String>{
	Instance findOne(String id);
}
