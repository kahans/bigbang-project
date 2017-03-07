package com.team4.project.government.dbInsert.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.scenario.effect.Bloom;

@Service
public class DbInsertService {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertService.class);
	@Autowired
	private DbInsertDao dbInsertDao;
	
	//컨트롤러에서 한꺼번에 넘겨준 것 분기해서 각각 DAO 쓸 예정
	
	@Transactional
	public String DbAddInformation(){
		//매개변수로 받은 덩어리에서 각 기능별 insert할 정보 쪼개기
		
		//차트입력
		dbInsertDao.insertChart();
		
		//진료입력
		dbInsertDao.insertTreat();
		
		//진단입력
		dbInsertDao.insertDiagnosis();
		
		//입/퇴원입력
		dbInsertDao.insertHospitalization();
		
		//영상검사입력
		dbInsertDao.insertImageTest();
		
		//혈액검사입력
		dbInsertDao.insertBloodTest();
		
		//건강검진입력
		dbInsertDao.insertCheckup();
		
		//예방접종입력
		dbInsertDao.insertVaccine();
		
		//처방입력
		dbInsertDao.insertPrescription();
		
		//수술입력
		dbInsertDao.insertSurgery();
		return "";
	}
	
}
