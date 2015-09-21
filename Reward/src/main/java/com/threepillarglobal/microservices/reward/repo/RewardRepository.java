package com.threepillarglobal.microservices.reward.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.threepillarglobal.microservices.reward.model.Reward;

public interface RewardRepository extends MongoRepository<Reward, String> {

}
