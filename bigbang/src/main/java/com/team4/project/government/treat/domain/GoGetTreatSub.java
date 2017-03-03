package com.team4.project.government.treat.domain;

import com.team4.project.government.dto.HangleInfo;

public class GoGetTreatSub extends GoTreat{
	
	private HangleInfo hangleInfo;

	public HangleInfo getHangleInfo() {
		return hangleInfo;
	}

	public void setHangleInfo(HangleInfo hangleInfo) {
		this.hangleInfo = hangleInfo;
	}

	@Override
	public String toString() {
		return "GoGetTreatSub [hangleInfo=" + hangleInfo + ", goTreatCode=" + goTreatCode + ", goHospitalId="
				+ goHospitalId + ", goCitizenId=" + goCitizenId + ", goDoctorId=" + goDoctorId + ", goTreatSubjectCode="
				+ goTreatSubjectCode + ", goChartCode=" + goChartCode + ", goChartSeq=" + goChartSeq
				+ ", goTreatContents=" + goTreatContents + ", goTreatRegistrationDate=" + goTreatRegistrationDate
				+ ", goTreatGoRegistrationDate=" + goTreatGoRegistrationDate + "]";
	}
	
	

}
