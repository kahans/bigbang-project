package com.team4.project.government.dbInsert.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
@Transactional
@Service
public class DbInsertService {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertService.class);
	Gson gson = new Gson();
	@Autowired
	private DbInsertDao dbInsertDao;
	
	//컨트롤러에서 한꺼번에 넘겨준 것 분기해서 각각 DAO 쓸 예정
	
	
	public String DbAddInformation(String hospitalCode, String hospitalInfo){
		logger.debug("hospitalCode 확인 service : "+hospitalCode);
		logger.debug("hospitalInfo 확인 service : "+hospitalInfo);
		
		//hospitalInfo json 타입에서 java객체타입으로 변환
		try{
		//json형태의 String 매개변수 hospitalInfo받아서 map타입형태로 변환
		Map<String, Object> jsonObject = gson.fromJson(hospitalInfo, new TypeToken<Map<String, Object>>(){}.getType()); 
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 chart
		if(jsonObject.get("hoChart")!=null){
			logger.debug("hoChart 존재");
			List<Map> listChart = (List<Map>) jsonObject.get("hoChart");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listChart.size();i++){
				logger.debug("listChart확인 : "+listChart.get(i));
				//Chart가 들어있는 map에 병원코드를 입력해준다.
				listChart.get(i).put("hospitalCode", hospitalCode);
				dbInsertDao.insertChart(listChart.get(i));
			}
		}
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 treat
		if(jsonObject.get("hoTreat")!=null){
			logger.debug("hoTreat 존재");
			List<Map> listTreat = (List<Map>) jsonObject.get("hoTreat");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listTreat.size();i++){
				logger.debug("listTreat확인 : "+listTreat.get(i));
				//Treat가 들어있는 map에 병원코드를 입력해준다.
				listTreat.get(i).put("hospitalCode", hospitalCode);
				dbInsertDao.insertTreat(listTreat.get(i));
			}
		}
	
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 diagnosis
		if(jsonObject.get("hoDiagnosis")!=null){
			logger.debug("dignosis 존재");
			List<Map> listDiagnosis = (List<Map>) jsonObject.get("hoDiagnosis");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listDiagnosis.size();i++){
				logger.debug("listDiagnosis확인 : "+listDiagnosis.get(i));
				//Diagnosis가 들어있는 map에 병원코드를 입력해준다.
				listDiagnosis.get(i).put("hospitalCode", hospitalCode);
				dbInsertDao.insertDiagnosis(listDiagnosis.get(i));
			}
		}
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 Prescription
		if(jsonObject.get("hoPrescription")!=null){
			logger.debug("hoPrescription 존재");
			List<Map> listPrescription = (List<Map>) jsonObject.get("hoPrescription");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listPrescription.size();i++){
				logger.debug("listPrescription확인 : "+listPrescription.get(i));
				//Prescription가 들어있는 map에 병원코드를 입력해준다.
				listPrescription.get(i).put("hospitalCode", hospitalCode);
				dbInsertDao.insertPrescription(listPrescription.get(i));
			}
		}
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 Hospitalization
		if(jsonObject.get("hoHospitalization")!=null){
			logger.debug("hoHospitalization 존재");
			List<Map> listHospitalization = (List<Map>) jsonObject.get("hoHospitalization");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listHospitalization.size();i++){
				logger.debug("listHospitalization확인 : "+listHospitalization.get(i));
				//Hospitalization이 들어있는 map에 병원코드를 입력해준다.
				listHospitalization.get(i).put("hospitalCode", hospitalCode);
				dbInsertDao.insertHospitalization(listHospitalization.get(i));
			}
		}
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 Operation
		if(jsonObject.get("hoOperation")!=null){
			logger.debug("hoOperation 존재");
			List<Map> listOperation = (List<Map>) jsonObject.get("hoOperation");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listOperation.size();i++){
				logger.debug("listOperation확인 : "+listOperation.get(i));
				//Operation이 들어있는 map에 병원코드를 입력해준다.
				listOperation.get(i).put("hospitalCode", hospitalCode);
				//operation ->surgery
				dbInsertDao.insertSurgery(listOperation.get(i));
			}
		}
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 Vaccine
		if(jsonObject.get("hoVaccine")!=null){
			logger.debug("hoVaccine 존재");
			List<Map> listVaccine = (List<Map>) jsonObject.get("hoVaccine");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listVaccine.size();i++){
				logger.debug("listVaccine확인 : "+listVaccine.get(i));
				//Vaccine이 들어있는 map에 병원코드를 입력해준다.
				listVaccine.get(i).put("hospitalCode", hospitalCode);
				int a = 1;
				listVaccine.get(i).put("goVaccinationResultDegree", a);
				dbInsertDao.insertVaccine(listVaccine.get(i));
			}
		}
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 BloodTest
		if(jsonObject.get("hoBloodTest")!=null){
			logger.debug("hoBloodTest 존재");
			List<Map> listBloodTest = (List<Map>) jsonObject.get("hoBloodTest");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listBloodTest.size();i++){
				logger.debug("listBloodTest확인 : "+listBloodTest.get(i));
				//BloodTest가 들어있는 map에 병원코드를 입력해준다.
				listBloodTest.get(i).put("hospitalCode", hospitalCode);
				dbInsertDao.insertBloodTest(listBloodTest.get(i));
			}
		}
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 Checkup
		if(jsonObject.get("hoCheckup")!=null){
			logger.debug("hoCheckup 존재");
			List<Map> listCheckup = (List<Map>) jsonObject.get("hoCheckup");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listCheckup.size();i++){
				logger.debug("listCheckup확인 : "+listCheckup.get(i));
				//Checkup이 들어있는 map에 병원코드를 입력해준다.
				listCheckup.get(i).put("hospitalCode", hospitalCode);
				dbInsertDao.insertCheckup(listCheckup.get(i));
			}
		}
		
		//맵타입형태의 jsonObject에서 병원에서 넘겨준 list꺼내 분리 MediaTest
		if(jsonObject.get("hoMediaTest")!=null){
			logger.debug("hoMediaTest 존재");
			List<Map> listMediaTest = (List<Map>) jsonObject.get("hoMediaTest");
			//맵타입의 list로 분리된 진단결과를 for문을 돌려 insert쿼리 실행
			for( int i=0;i<listMediaTest.size();i++){
				logger.debug("listMediaTest확인 : "+listMediaTest.get(i));
				//MediaTest가 들어있는 map에 병원코드를 입력해준다.
				listMediaTest.get(i).put("hospitalCode", hospitalCode);
				dbInsertDao.insertImageTest(listMediaTest.get(i));
			}
		}
		
		}catch(Exception e){
			System.out.println("예외발생");
			e.printStackTrace();
			return "fail";
		}
		return "true";
	}
	
}
