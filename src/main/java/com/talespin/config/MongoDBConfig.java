package com.talespin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
/*@EnableMongoRepositories(basePackages = "com.talespin")*/
public class MongoDBConfig {

	public @Bean MongoDbFactory getMongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient("52.220.0.248",27018), "TaleSpin");
    }
 
    public @Bean MongoTemplate getMongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(getMongoDbFactory());
        return mongoTemplate;
    }
	
}
