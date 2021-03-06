package com.team4.project.government.diagnosisPrescription.domain;

import org.springframework.format.annotation.DateTimeFormat;

import com.team4.project.government.dto.HangleInfo;

public class GoDiagnosis extends HangleInfo{

	protected String goDiagnosisCode;
	protected String goTreatCode;
	protected String goDiseaseCode;

	// 조인문 데이터
	protected String goDiseaseKor;
	/* 날짜 포멧을 하여 원하는 형식으로 표기 */
	@DateTimeFormat(pattern = "YY-MM-DD")
	protected String goDiagnosisWriteDate;
	@DateTimeFormat(pattern = "YY-MM-DD")
	protected String goDiagnosisGoRegistrationDate;
	public String getGoDiagnosisCode() {
		return goDiagnosisCode;
	}
	public void setGoDiagnosisCode(String goDiagnosisCode) {
		this.goDiagnosisCode = goDiagnosisCode;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	public String getGoDiseaseCode() {
		return goDiseaseCode;
	}
	public void setGoDiseaseCode(String goDiseaseCode) {
		this.goDiseaseCode = goDiseaseCode;
	}
	public String getGoDiseaseKor() {
		return goDiseaseKor;
	}
	public void setGoDiseaseKor(String goDiseaseKor) {
		this.goDiseaseKor = goDiseaseKor;
	}
	public String getGoDiagnosisWriteDate() {
		return goDiagnosisWriteDate;
	}
	public void setGoDiagnosisWriteDate(String goDiagnosisWriteDate) {
		this.goDiagnosisWriteDate = goDiagnosisWriteDate;
	}
	public String getGoDiagnosisGoRegistrationDate() {
		return goDiagnosisGoRegistrationDate;
	}
	public void setGoDiagnosisGoRegistrationDate(String goDiagnosisGoRegistrationDate) {
		this.goDiagnosisGoRegistrationDate = goDiagnosisGoRegistrationDate;
	}
	@Override
	public String toString() {
		return "GoDiagnosis [goDiagnosisCode=" + goDiagnosisCode + ", goTreatCode=" + goTreatCode + ", goDiseaseCode="
				+ goDiseaseCode + ", goDiseaseKor=" + goDiseaseKor + ", goDiagnosisWriteDate=" + goDiagnosisWriteDate
				+ ", goDiagnosisGoRegistrationDate=" + goDiagnosisGoRegistrationDate + ", goHospitalName="
				+ goHospitalName + ", goHospitalAddress=" + goHospitalAddress + ", goCitizenName=" + goCitizenName
				+ ", goDoctorName=" + goDoctorName + ", goTreatSubjectName=" + goTreatSubjectName + "]";
	}
	
}
