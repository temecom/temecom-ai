package net.temecom.ai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.temecom.ai.model.AIEntity;

public interface  EntityRepository <T extends AIEntity> extends MongoRepository<T, String>{
	T findOne(String id);
}
