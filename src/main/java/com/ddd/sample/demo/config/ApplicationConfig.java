package com.ddd.sample.demo.config;

import javax.sql.DataSource;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.relational.core.mapping.event.RelationalEvent;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;

@Configuration
@EnableJdbcRepositories(basePackages="com.ddd.sample.demo.repository", considerNestedRepositories=true)
class ApplicationConfig extends AbstractJdbcConfiguration {                            


  /**
   * @return {@link ApplicationListener} for {@link RelationalEvent}s.
   */
  @Bean
  public ApplicationListener<?> loggingListener() {

       return (ApplicationListener<ApplicationEvent>) event -> {
            if (event instanceof RelationalEvent) {
                 System.out.println("Received an event: " + event);
            }
       };
  }
  
    @Bean
    NamedParameterJdbcOperations namedParameterJdbcOperations(DataSource dataSource) { 
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    TransactionManager transactionManager(DataSource dataSource) {                     
        return new DataSourceTransactionManager(dataSource);
    }
}