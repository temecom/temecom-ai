package net.temecom.ai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.temecom.ai.model.neuralNetwork.NetworkConfiguration;

public interface NetworkRepository extends MongoRepository<NetworkConfiguration, String>{

}
