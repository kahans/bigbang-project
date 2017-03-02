package com.team4.project.government.test.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoImageTest;
import com.team4.project.util.HttpUrlCon;

@Controller
public class GoTestController {
	Gson gson;
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTS;

	
	//treatCode 사용하여 혈액검사결과 하나 조회
	@ResponseBody
	@RequestMapping(value="/government/getOneBloodTest", method=RequestMethod.POST , produces = "text/json; charset=UTF-8")
	public String getOneBloodTestResult(String treatCode){
		/**
		/government/goBloodTest 주소값으로 요청시 
		혈액검사결과 테이블의 모든 컬럼
		 String goBloodTestCode
		 int goBloodTestBloodSugar
		 int goBloodTestPlatelet
		 String goBloodTestFilePath
		 String goBloodTestFileName
		 String goBloodTestDate
		 String goBloodTestGoRegistrationDate
		 
		*/
		
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);
		
		//test를 위해 treatCode를 직접 세팅해줌
		treatCode = "treat_01";
		
		//treatCode를 사용하여 혈액검사결과 조회
		GoBloodTest goBloodTest = goTS.getOneBloodTestResult(treatCode);
		logger.debug("goBloodTest 확인 : "+goBloodTest);
		
		//혈액검사결과를 json타입으로 바꿔줌
		gson = new Gson();
		String bloodTestResult = gson.toJson(goBloodTest);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
		
	}
	
	//citizenId 사용하여 혈액검사결과리스트 조회
	@ResponseBody
	@RequestMapping(value="/government/getListBloodTestResult" , method=RequestMethod.POST,  produces = "text/json; charset=UTF-8")
	public String getListBloodTestResult(String citizenId){
		
		logger.debug("controller 에 매개변수로 받은 citizenId 확인 :"+citizenId);
		
		//test를 위해 citizenId를 직접 세팅해줌
		citizenId = "900101-1000001";
		
		//citizenId를 사용하여 혈액검사결과 조회
		List<GoBloodTest> getListBloodTestResult = goTS.getListBloodTestResult(citizenId);
		logger.debug("goBloodTest 확인 : "+getListBloodTestResult);
		
		//혈액검사결과리스트를 json타입으로 바꿔줌
		gson = new Gson();
		String bloodTestResult = gson.toJson(getListBloodTestResult);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
	}
	
	/*//json type으로 혈액검사 요청한것을 받아보겠다.(테스트용)
	@RequestMapping(value="/getJson" , method=RequestMethod.GET)
	public String getJson(Map<String, String> map){
		HttpUrlCon http = new HttpUrlCon("http://localhost/project/government/getListBloodTestResult");
		 try {
			
			String jsonString = http.HttpUrlPOST(map);
			System.out.println("jsonString : "+jsonString);
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}*/
	
	//treatCode를 사용하여 이미지테스트 결과 하나 받아옴
	@ResponseBody
	@RequestMapping(value="/government/getOneImageTestResult" , method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getOneImageTestResult(String treatCode){
		
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);
		
		//test를 위해 treatCode를 직접 세팅해줌
		treatCode = "treat_01";
		//test로 세팅된 treatCode 확인
		logger.debug("test treatCode : "+treatCode);
		
		//treatCode를 사용하여 영상검사결과를 받아옴
		GoImageTest goImageTestResult = goTS.getOneImageTestResult(treatCode);
		logger.debug("goImageTestResult 확인 : "+goImageTestResult);
		//영상검사결과를 json타입으로 변형
		Gson gson = new Gson();
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);
			
	return imageTestResult;
		
	}
	
	//citizenId를 사용하여 영상검사결과리스트 조회
	@ResponseBody
	@RequestMapping(value="/government/getListImageTestResult" , method=RequestMethod.POST)
	public String getListImageTestResult(String citizenId){
		
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+citizenId);
		
		//test를 위해 treatCode를 직접 세팅해줌
		citizenId = "900101-1000001";
		//test로 세팅된 treatCode 확인
		logger.debug("test citizenId : "+citizenId);
		
		//treatCode를 사용하여 영상검사결과를 받아옴
		List<GoImageTest> goImageTestResult = goTS.getListImageTestResult(citizenId);
		logger.debug("goImageTestResult 확인 : "+goImageTestResult);
		//영상검사결과를 json타입으로 변형
		Gson gson = new Gson();
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);
			
	return imageTestResult;
		
	}
	
	
	/*//json type으로 영상검사 요청한것을 받아보겠다.(테스트용)
	@RequestMapping(value="/getJson" , method=RequestMethod.GET)
	public String getJson(Map<String, String> map){
		HttpUrlCon http = new HttpUrlCon("http://localhost/project/government/getListImageTestResult");
		 try {
			
			String jsonString = http.HttpUrlPOST(map);
			System.out.println("jsonString : "+jsonString);
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	*/
	
}
