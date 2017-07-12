package com.threepillarglobal.microservices.reward.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="missions")
public class Reward {

	
	@Id
	private String id; 
	
	private String name;
	private String description;
	private int pointCost;
	
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
		return pointCost;
	}
	public void setPointValue(int pointValue) {
		this.pointCost = pointValue;
	}
}
