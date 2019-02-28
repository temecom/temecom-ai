package net.temecom.ai.neo4j.repository;



import java.util.UUID;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import net.temecom.ai.model.AIEntity;

public interface  EntityRepository <T extends AIEntity> extends Neo4jRepository<T, UUID>{
	
}
