package com.threepillarglobal.microservices.mission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.threepillarglobal.microservices.mission.model.Mission;
import com.threepillarglobal.microservices.mission.repo.MissionRepository;

@RestController
@RequestMapping("/mission")
public class MissionController {
	
	@Autowired
	MissionRepository missionRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Mission create(@RequestBody Mission mission){
		
		Mission result = missionRepository.save(mission);
		return result;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{missionId}")
	public Mission get(@PathVariable String missionId){
		return missionRepository.findOne(missionId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/")
	public List<Mission> getAll(){
		return missionRepository.findAll();
	}
	
}
