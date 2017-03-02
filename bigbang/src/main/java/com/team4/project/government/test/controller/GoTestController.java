package com.team4.project.government.test.controller;

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

	//json타입으로 
	@ResponseBody
	@RequestMapping(value="/government/goBloodTest", method=RequestMethod.POST , produces = "text/json; charset=UTF-8")
	public String goJson(String treatCode){
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
		GoBloodTest goBloodTest = goTS.selectBloodTest(treatCode);
		
		
		//혈액검사결과를 json타입으로 바꿔줌
		gson = new Gson();
		String bloodTestResult = gson.toJson(goBloodTest);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
		
	}
	
	/*//json type으로 혈액검사 요청한것을 받아보겠다.
	@RequestMapping(value="/getJson" , method=RequestMethod.GET)
	public String getJson(Map<String, String> map){
		HttpUrlCon http = new HttpUrlCon("http://localhost/project/government/goBloodTest");
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
	
	@ResponseBody
	@RequestMapping(value="/government/goImageTest" , method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String selectImgTest(String treatCode){
		
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);
		
		//test를 위해 treatCode를 직접 세팅해줌
		treatCode = "treat_01";
		//test로 세팅된 treatCode 확인
		logger.debug("test treatCode : "+treatCode);
		
		//treatCode를 사용하여 영상검사결과를 받아옴
		GoImageTest goImageTestResult = goTS.selectImageTest(treatCode);
		
		//영상검사결과를 json타입으로 변형
		Gson gson = new Gson();
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);
			
	return imageTestResult;
		
	}
	//json type으로 영상검사 요청한것을 받아보겠다.
	@RequestMapping(value="/getJson" , method=RequestMethod.GET)
	public String getJson(Map<String, String> map){
		HttpUrlCon http = new HttpUrlCon("http://localhost/project/government/goImageTest");
		 try {
			
			String jsonString = http.HttpUrlPOST(map);
			System.out.println("jsonString : "+jsonString);
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	

}
