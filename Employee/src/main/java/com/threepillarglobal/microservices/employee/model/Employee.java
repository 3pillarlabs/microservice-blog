package com.threepillarglobal.microservices.employee.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employees")
public class Employee {

	@Id
	private String id; 
	
	private String email;
	private String fullName;
	private String managerEmail;
	
	private int totalPointsEarned;
	
	private int availablePoints;
	private List<MissionCompletion> completedMissions = new ArrayList<>();
	private List<RewardRedeemed> redeemedRewards = new ArrayList<>();
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getManagerEmail() {
		return managerEmail;
	}
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
	
	public int getTotalPointsEarned() {
		return totalPointsEarned;
	}
	public void setTotalPointsEarned(int totalPointsEarned) {
		this.totalPointsEarned = totalPointsEarned;
	}
	public int getAvailablePoints() {
		return availablePoints;
	}
	public void setAvailablePoints(int availablePoints) {
		this.availablePoints = availablePoints;
	}
	public List<MissionCompletion> getCompletedMissions() {
		return completedMissions;
	}
	public void setCompletedMissions(List<MissionCompletion> completedMissions) {
		this.completedMissions = completedMissions;
	}
	public List<RewardRedeemed> getRedeemedRewards() {
		return redeemedRewards;
	}
	public void setRedeemedRewards(List<RewardRedeemed> redeemedRewards) {
		this.redeemedRewards = redeemedRewards;
	}
	
}
