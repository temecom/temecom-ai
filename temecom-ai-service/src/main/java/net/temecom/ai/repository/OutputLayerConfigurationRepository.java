package net.temecom.ai.repository;

import net.temecom.ai.model.neuralNetwork.OutputLayerConfiguration;

public interface OutputLayerConfigurationRepository extends EntityRepository<OutputLayerConfiguration>{
	OutputLayerConfiguration findOne(String id);
}
