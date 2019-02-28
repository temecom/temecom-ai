package net.temecom.ai.neo4j;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("net.temecom.ai.neo4j")
@EnableNeo4jRepositories("net.temecom.ai.neo4j.repository")
public class PersistenceContext {

  @Bean
  public SessionFactory getSessionFactory() {
    return new SessionFactory(configuration(), "net.temecom.ai.neo4j.model");
  }

  @Bean
  public Neo4jTransactionManager transactionManager() throws Exception {
    return new Neo4jTransactionManager(getSessionFactory());
  }

  @Bean
  public org.neo4j.ogm.config.Configuration configuration() {
    return new org.neo4j.ogm.config.Configuration.Builder()
      .uri("bolt://localhost")
      .build();
  }
}
