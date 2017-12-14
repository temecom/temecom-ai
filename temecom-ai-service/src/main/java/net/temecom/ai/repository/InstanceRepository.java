package net.temecom.ai.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.temecom.ai.model.NeuralNetworkConfiguration;

public interface InstanceRepository extends MongoRepository<NeuralNetworkConfiguration, UUID>{

}
