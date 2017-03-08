package com.team4.project.government.dbInsert.controller;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DbInsertDao {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertDao.class);
	@Autowired
	private SqlSessionTemplate sql;
	//수술입력
	public int insertSurgery(Map<String, Object> map){
		logger.debug("수술입력 DAO");
		logger.debug("매개변수 확인 hospitalCode : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goSurgeryResultCode : "+map.get("goSurgeryResultCode"));
		logger.debug("매개변수 확인 goTreatCode : "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 goSurgeryCode : "+map.get("goSurgeryCode"));
		logger.debug("매개변수 확인 goSurgeryResultRegistrationDate : "+map.get("goSurgeryResultRegistrationDate"));
		return sql.insert("dbInsert.insertSurgery",map);
	}
	
	//차트입력
	public int insertChart(Map<String, Object> map){
		logger.debug("차트입력 DAO");
		logger.debug("매개변수 확인 hospitalCode : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goCitizenId : "+map.get("goCitizenId"));
		logger.debug("매개변수 확인 goCitizenId : "+map.get("goCitizenId"));
		logger.debug("매개변수 확인 goHospitalId : "+map.get("goHospitalId"));
		logger.debug("매개변수 확인 goChartRegistrationDate : "+map.get("goChartRegistrationDate"));
		return sql.insert("dbInsert.insertChart",map);
	}
	//진료 입력
	public int insertTreat(Map<String, Object> map){
		logger.debug("진료입력 DAO");
		logger.debug("매개변수 확인 hospitalCode : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goTreatCode : "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 goHospitalId : "+map.get("goHospitalId"));
		logger.debug("매개변수 확인 goCitizenId : "+map.get("goCitizenId"));
		logger.debug("매개변수 확인 goDoctorId : "+map.get("goDoctorId"));
		logger.debug("매개변수 확인 goTreatSubjectCode : "+map.get("goTreatSubjectCode"));
		logger.debug("매개변수 확인 goChartCode : "+map.get("goChartCode"));
		logger.debug("매개변수 확인 goTreatContents : "+map.get("goTreatContents"));
		logger.debug("매개변수 확인 goTreatRegistrationDate : "+map.get("goTreatRegistrationDate"));
		return sql.insert("dbInsert.insertTreat",map);
	}
	
	//혈액검사 입력
	public int insertBloodTest(Map<String, Object> map){
		logger.debug("혈액검사입력 DAO");
		logger.debug("매개변수 확인 hospitalCode : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goBloodTestCode : "+map.get("goBloodTestCode"));
		logger.debug("매개변수 확인 goTreatCode : "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 goBloodTestBloodSugar : "+map.get("goBloodTestBloodSugar"));
		logger.debug("매개변수 확인 goBloodTestPlatelet : "+map.get("goBloodTestPlatelet"));
		logger.debug("매개변수 확인 goBloodTestFilePath : "+map.get("goBloodTestFilePath"));
		logger.debug("매개변수 확인 goBloodTestFileName : "+map.get("goBloodTestFileName"));
		logger.debug("매개변수 확인 goBloodTestDate : "+map.get("goBloodTestDate"));
		return sql.insert("dbInsert.insertBloodTest",map);
	}
	
	//건강검진 입력
	public int insertCheckup(Map<String, Object> map){
		logger.debug("건강검진입력 DAO");
		logger.debug("매개변수 확인 hospitalCode: "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goCheckupResultCode: "+map.get("goCheckupResultCode"));
		logger.debug("매개변수 확인 goTreatCode: "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 goCheckupResultFilePath: "+map.get("goCheckupResultFilePath"));
		logger.debug("매개변수 확인 goCheckupResultFileName: "+map.get("goCheckupResultFileName"));
		logger.debug("매개변수 확인 goCheckupResultCheckupDate: "+map.get("goCheckupResultCheckupDate"));
		logger.debug("매개변수 확인 goCheckupResultRegistrationDate: "+map.get("goCheckupResultRegistrationDate"));
		return sql.insert("dbInsert.insertCheckup",map);
	}
	
	//진단 입력
	public int insertDiagnosis(Map<String, Object> map){
		logger.debug("진단입력 DAO");
		logger.debug("매개변수 확인 : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 : "+map.get("goDiagnosisCode"));
		logger.debug("매개변수 확인 : "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 : "+map.get("goDiseaseCode"));
		logger.debug("매개변수 확인 : "+map.get("goTreatmentWriteDate"));
		logger.debug("매개변수 확인 : "+map.get("goDiagnosisGoRegistrationDate"));
	
		return sql.insert("dbInsert.insertDiagnosis",map);
	}
	
	//입/퇴원 입력
	public int insertHospitalization(Map<String, Object> map){
		logger.debug("입/퇴원입력 DAO");
		logger.debug("매개변수 확인 hospitalCode : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goHospitalizationCode : "+map.get("goHospitalizationCode"));
		logger.debug("매개변수 확인 goTreatCode : "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 goHospitalizationEnterDate : "+map.get("goHospitalizationEnterDate"));
		logger.debug("매개변수 확인 goHospitalizationExitDate : "+map.get("goHospitalizationExitDate"));
		return sql.insert("dbInsert.insertHospitalization",map);
	}
	
	//영상검사 입력
	public int insertImageTest(Map<String, Object> map){
		logger.debug("영상검사입력 DAO");
		logger.debug("매개변수 확인 hospitalCode : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goImageTestCode : "+map.get("goImageTestCode"));
		logger.debug("매개변수 확인 goTreatCode : "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 goImageTestFilePath : "+map.get("goImageTestFilePath"));
		logger.debug("매개변수 확인 goImageTestFileName : "+map.get("goImageTestFileName"));
		logger.debug("매개변수 확인 goImageTestDate : "+map.get("goImageTestDate"));
		return sql.insert("dbInsert.insertImageTest",map);
	}
	
	//처방 입력
	public int insertPrescription(Map<String, Object> map){
		logger.debug("처방입력 DAO");
		logger.debug("매개변수 확인 hospitalCode : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goPrescriptionResultCode : "+map.get("goPrescriptionResultCode"));
		logger.debug("매개변수 확인 goTreatCode : "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 goMedicineCode : "+map.get("goMedicineCode"));
		logger.debug("매개변수 확인 goPrescriptionResultInjectionNumber : "+map.get("goPrescriptionResultInjectionNumber"));
		logger.debug("매개변수 확인 goPrescriptionResultDosage : "+map.get("goPrescriptionResultDosage"));
		logger.debug("매개변수 확인 goPrescriptionResultTotalDate : "+map.get("goPrescriptionResultTotalDate"));
		logger.debug("매개변수 확인 goPrescriptionResultUsage : "+map.get("goPrescriptionResultUsage"));
		logger.debug("매개변수 확인 goPrescriptionResultWriteDate : "+map.get("goPrescriptionResultWriteDate"));
		return sql.insert("dbInsert.insertPrescription",map);
	}
	
	//예방접종 입력
	public int insertVaccine(Map<String, Object> map){
		logger.debug("예방접종입력 DAO");
		logger.debug("매개변수 확인 hospitalCode : "+map.get("hospitalCode"));
		logger.debug("매개변수 확인 goVaccinationResultCode : "+map.get("goVaccinationResultCode"));
		logger.debug("매개변수 확인 goTreatCode : "+map.get("goTreatCode"));
		logger.debug("매개변수 확인 goVaccinationCode : "+map.get("goVaccinationCode"));
		logger.debug("매개변수 확인 goVaccinationResultDegree : "+map.get("goVaccinationResultDegree"));
		logger.debug("매개변수 확인 goVaccinationResultRegistrationDate : "+map.get("goVaccinationResultRegistrationDate"));
		return sql.insert("dbInsert.insertVaccine",map);
	}
}
