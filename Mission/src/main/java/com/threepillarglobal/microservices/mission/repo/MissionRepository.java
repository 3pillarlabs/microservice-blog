package com.threepillarglobal.microservices.mission.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.threepillarglobal.microservices.mission.model.Mission;

public interface MissionRepository extends MongoRepository<Mission, String> {

}
