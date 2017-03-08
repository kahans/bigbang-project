package com.team4.project.government.dto;

public class GoSurgery {
	protected String goSurgeryCode;
	protected String goSurgeryName;
	public String getGoSurgeryCode() {
		return goSurgeryCode;
	}
	public void setGoSurgeryCode(String goSurgeryCode) {
		this.goSurgeryCode = goSurgeryCode;
	}
	public String getGoSurgeryName() {
		return goSurgeryName;
	}
	public void setGoSurgeryName(String goSurgeryName) {
		this.goSurgeryName = goSurgeryName;
	}
	@Override
	public String toString() {
		return "GoSurgery [goSurgeryCode=" + goSurgeryCode + ", goSurgeryName=" + goSurgeryName + "]";
	}
	
	
	
}
