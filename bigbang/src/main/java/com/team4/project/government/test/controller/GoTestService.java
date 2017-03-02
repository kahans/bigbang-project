package com.team4.project.government.test.controller;

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
	

	
	//혈액검사결과 요청
		public GoBloodTest selectBloodTest(String treatCode){
			logger.debug("서비스로 혈액검사요청 들어옴");
			logger.debug("매개변수 treatCode 확인 : "+treatCode); 

			return goTD.selectBlood(treatCode);
		}
		
	//이미지 검색결과 요청
	public GoImageTest selectImageTest(String treatCode){
		logger.debug("서비스로 영상검사결과 들어옴");
		logger.debug("매개변수 treatCode 확인 : "+treatCode); 

		return goTD.selectImage(treatCode);
	}
	
	
}