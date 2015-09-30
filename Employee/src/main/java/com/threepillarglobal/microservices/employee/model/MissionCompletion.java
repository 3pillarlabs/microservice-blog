package com.threepillarglobal.microservices.employee.model;

import java.util.Date;

public class MissionCompletion {

	private String missionId;
	private Date completionDate;
	private int pointsEarned;
	
	public String getMissionId() {
		return missionId;
	}
	public void setMissionId(String missionId) {
		this.missionId = missionId;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	
}
