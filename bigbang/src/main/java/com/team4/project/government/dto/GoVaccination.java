package com.team4.project.government.dto;

public class GoVaccination {
	protected String goVaccinationCode;
	protected String goVaccinationName;
	protected int goVaccinationDegree;
	public String getGoVaccinationCode() {
		return goVaccinationCode;
	}
	public void setGoVaccinationCode(String goVaccinationCode) {
		this.goVaccinationCode = goVaccinationCode;
	}
	public String getGoVaccinationName() {
		return goVaccinationName;
	}
	public void setGoVaccinationName(String goVaccinationName) {
		this.goVaccinationName = goVaccinationName;
	}
	public int getGoVaccinationDegree() {
		return goVaccinationDegree;
	}
	public void setGoVaccinationDegree(int goVaccinationDegree) {
		this.goVaccinationDegree = goVaccinationDegree;
	}
	@Override
	public String toString() {
		return "GoVaccination [goVaccinationCode=" + goVaccinationCode + ", goVaccinationName=" + goVaccinationName
				+ ", goVaccinationDegree=" + goVaccinationDegree + "]";
	}
	
	
}
