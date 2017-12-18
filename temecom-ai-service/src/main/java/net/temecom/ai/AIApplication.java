package net.temecom.ai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
@EnableMongoRepositories
@ComponentScan(basePackages = {"net.temecom.ai.controller","net.temecom.ai.service"} )
public class AIApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(AIApplication.class, args);
	}
	
	public void run(String... arg0) throws Exception {
		
	}
	
}

