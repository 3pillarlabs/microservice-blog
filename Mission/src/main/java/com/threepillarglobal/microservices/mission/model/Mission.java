package com.threepillarglobal.microservices.mission.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="missions")
public class Mission {

	
	@Id
	private String id; 
	
	private String name;
	private String description;
	private int pointValue;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPointValue() {
		return pointValue;
	}
	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}
}
