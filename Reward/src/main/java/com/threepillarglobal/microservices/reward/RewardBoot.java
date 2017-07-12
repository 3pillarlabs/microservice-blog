package com.threepillarglobal.microservices.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class RewardBoot {

	   public static void main(String[] args) {
	        SpringApplication.run(RewardBoot.class);
	    }
	
	   
	   @Autowired
		private Environment env;


	   
	   
}
