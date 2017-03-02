package com.team4.project.government.treat.domain;

public class GoGetTreatSub extends GoTreat{
	
	private String goHospitalName;
	private String goHospitalAddress;
	private String goCitizenName;
	private String goDoctorName;
	private String goTreatSubjectName;
	
	public String getGoHospitalName() {
		return goHospitalName;
	}
	public void setGoHospitalName(String goHospitalName) {
		this.goHospitalName = goHospitalName;
	}
	public String getGoHospitalAddress() {
		return goHospitalAddress;
	}
	public void setGoHospitalAddress(String goHospitalAddress) {
		this.goHospitalAddress = goHospitalAddress;
	}
	public String getGoCitizenName() {
		return goCitizenName;
	}
	public void setGoCitizenName(String goCitizenName) {
		this.goCitizenName = goCitizenName;
	}
	public String getGoDoctorName() {
		return goDoctorName;
	}
	public void setGoDoctorName(String goDoctorName) {
		this.goDoctorName = goDoctorName;
	}
	public String getGoTreatSubjectName() {
		return goTreatSubjectName;
	}
	public void setGoTreatSubjectName(String goTreatSubjectName) {
		this.goTreatSubjectName = goTreatSubjectName;
	}
	@Override
	public String toString() {
		return "GoGetTreatSub [goHospitalName=" + goHospitalName + ", goHospitalAddress=" + goHospitalAddress
				+ ", goCitizenName=" + goCitizenName + ", goDoctorName=" + goDoctorName + ", goTreatSubjectName="
				+ goTreatSubjectName + ", goTreatCode=" + goTreatCode + ", goHospitalId=" + goHospitalId
				+ ", goCitizenId=" + goCitizenId + ", goDoctorId=" + goDoctorId + ", goTreatSubjectCode="
				+ goTreatSubjectCode + ", goChartCode=" + goChartCode + ", goChartSeq=" + goChartSeq
				+ ", goTreatContents=" + goTreatContents + ", goTreatRegistrationDate=" + goTreatRegistrationDate
				+ ", goTreatGoRegistrationDate=" + goTreatGoRegistrationDate + "]";
	}


}
