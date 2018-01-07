package net.temecom.ai.repository;

import net.temecom.ai.model.neuralNetwork.InputLayerConfiguration;

public interface InputLayerConfigurationRepository extends EntityRepository<InputLayerConfiguration>{
	InputLayerConfiguration findOne(String id);
}
