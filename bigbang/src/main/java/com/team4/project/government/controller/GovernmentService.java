package com.team4.project.government.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;
import com.team4.project.government.dto.GoMedicine;

@Service
public class GovernmentService {
	private static final Logger logger = LoggerFactory.getLogger(GovernmentService.class);

	@Autowired
	private GovernmentDao goDao;
	
	// 테스트
	public void addData(String id, String name){
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("name", name);
		goDao.insertData(map);
	}
	
	// 주민번호 확인
	public GoCitizen checkCitizenId(String citizenId){
		return goDao.checkCitizenId(citizenId);
	}
	
	//국민 로그인체크
	public GoCitizen loginCheck(GoCitizen goCitizen){
		logger.debug("GovernmentService_loginInfo:"+goCitizen);
		
		return goDao.loginCheck(goCitizen);
	}
	
	//국민 로그인체크
	public GoHospital loginCheck(GoHospital goHospital){
		logger.debug("GovernmentService_loginInfo:"+goHospital);
		return goDao.loginCheck(goHospital);
	}
	
	// 약코드 가져오기
	public List<Map> getMedicineList(){
		return goDao.selectMedicineList();
	}
	
	//약코드 가져오기
	public List<Map> getDiseaseList(){
		return goDao.selectDiseaseList();
	}
	
	//진료과목코드 가져오기
	public List<Map> getTreatSubjectList(){
		return goDao.selectTreatSubjectList();
	}
	
	//수술코드 가져오기
	public List<Map> getSurgeryList(){
		return goDao.selectSurgeryList();
	}
	
	//예방접종코드 가져오기
	public List<Map> getVaccinationList(){
		return goDao.selectVaccinationList();
	}
	
	
}
