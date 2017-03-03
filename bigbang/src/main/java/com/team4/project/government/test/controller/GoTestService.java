package com.team4.project.government.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoImageTest;

@Service
public class GoTestService {

	private static final Logger logger = LoggerFactory.getLogger(GoTestService.class);

	@Autowired
	private GoTestDao goTD;
	
	
	//treatCode로 혈액검사결과 하나 요청
	public GoBloodTest getOneBloodTestResult(String treatCode){
			logger.debug("서비스 혈액검사결과 하나");
			logger.debug("매개변수 treatCode 확인 : "+treatCode); 
			return goTD.selectOneBloodTestResult(treatCode);
	}
		
	//citizenId로 혈액검사결과리스트 요청
	public List<GoBloodTest> getListBloodTestResult(String citizenId){
		logger.debug("서비스 혈액검사결과 리스트");
		logger.debug("매개변수 citizenId 확인 : "+citizenId);
		return goTD.selectListBloodTestResult(citizenId);
	}
		
		
	//treatCode로 영상검사결과 하나 요청
	public GoImageTest getOneImageTestResult(String treatCode){
		logger.debug("서비스로 영상검사결과 하나");
		logger.debug("매개변수 treatCode 확인 : "+treatCode); 

		return goTD.selectOneImageTestResult(treatCode);
	}
	
	//citizenId로 영상검사결과 리스트 요청
	public List<GoImageTest> getListImageTestResult(String citizenId){
		logger.debug("서비스 영상검사결과 리스트");
		logger.debug("매개변수 citizenId 확인 : "+citizenId);
		return goTD.selectListImageTestResult(citizenId);
	}
	
	
}