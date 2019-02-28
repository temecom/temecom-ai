package net.temecom.ai.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableNeo4jRepositories
@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
@ComponentScan(basePackages = {"net.temecom.ai.neo4j.repository"} )

public class Neo4JServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4JServiceApplication.class, args);
	}
}
