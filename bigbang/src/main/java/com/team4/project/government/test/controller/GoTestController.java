package com.team4.project.government.test.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.team4.project.government.test.domain.GoBloodTestTreatSub;
import com.team4.project.government.test.domain.GoTest;
import com.team4.project.util.Http;

@Controller
public class GoTestController {
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTS;
	
	
	
	//검사페이지로 요청
	@RequestMapping(value="/government/goTest" , method=RequestMethod.GET)
	public String testRequest(){
		//a태그로 링크가 걸려있는 검사,진료,수술,입원 text가 화면에 나옴
		logger.debug("검사요청들어옴 혈액검사,영상검사,건강검진,예방접종으로 이동할 수 있게 경로 잡아준 페이지로 이동");
		return "/government/citizen/testVaccinationCheckup/test";
	}
	
	
	
	//혈액검사요청페이지
	@RequestMapping(value="/government/goBloodTest", method=RequestMethod.GET)
	public String selectBloodTest(){
	
		System.out.println("혈액검사 요청페이지로 이동");
		
		return "/government/citizen/testVaccinationCheckup/bloodTest";
	}
	
	//혈액검사 요청페이지에서 날짜 citizenNo 넘겨받음 citizenNo는 추후에 로그인정보에서 citizenNO 혹은 주민번호를 받아 올 예정
	//주민번호를 받게되면 DTo와 mapper 수정해야함.
	
	@RequestMapping(value="/government/goBloodTest", method=RequestMethod.POST)
	public String selectBloodTest(Model model, GoTest goTest,HttpSession session){
		/*
		진료테이블의 모든 컬럼
		 String goTreatCode;
		 String goHospitalId;
		 String goCitizenNo;
		 String goDoctorId;
		 String goTreatSubjectCode;
		 String goChartCode;
		 int goChartSeq;
		 String goTreatContents;
		 Date goTreatRegistrationDate;
		 String goTreatGoRegistrationDate;
		혈액검사결과 테이블의 모든 컬럼
		 String goBloodTestCode;
		 int goBloodTestBloodSugar;
		 int goBloodTestPlatelet;
		 String goBloodTestFilePath;
		 String goBloodTestFileName;
		 String goBloodTestDate;
		 String goBloodTestGoRegistrationDate;
		병원명,의사명, 진료내용
		 String goHospitalName;
		 String goDoctorName;
		 String goTreatContents;
		 을 가진 List<GoBloodTestTreatSub> 타입의 객체를 가진
		  GoTest 클래스타입의 객체에 bloodTestCount를 추가하여 리턴시켜준다.
		*/
		
		
		//세션 임의로 만들어서 넣어줌 테스트할때 매개변수로 httpSession session 받아야함
		System.out.println("세션확인 : "+session.getAttribute("GOCITIZENID"));
		String goCitizenId = (String) session.getAttribute("GOCITIZENID");
		goTest.setGoCitizenId(goCitizenId);
		//여기까지
	
		
			logger.debug("혈액검사 요청페이지에서 날짜 넘겨받음");

			logger.debug("주민번호 확인 : "+goTest.getGoCitizenId());
			GoTest goBloodTest = goTS.selectBloodTest(goTest);
			
			//모델에 list타입 객체를 담음
			model.addAttribute("goTestBlood",goBloodTest);
			
			
			
			//view 페이지로 포워딩
		return "/government/citizen/testVaccinationCheckup/bloodTestResult";
		
	}
	
	//json타입으로 response test
	@ResponseBody
	@RequestMapping(value="/government/goJson", method=RequestMethod.GET , produces = "text/json; charset=UTF-8")
	public String goJson(Model model, GoTest goTest,HttpSession session){
		/*
		진료테이블의 모든 컬럼
		 String goTreatCode;
		 String goHospitalId;
		 String goCitizenNo;
		 String goDoctorId;
		 String goTreatSubjectCode;
		 String goChartCode;
		 int goChartSeq;
		 String goTreatContents;
		 Date goTreatRegistrationDate;
		 String goTreatGoRegistrationDate;
		혈액검사결과 테이블의 모든 컬럼
		 String goBloodTestCode;
		 int goBloodTestBloodSugar;
		 int goBloodTestPlatelet;
		 String goBloodTestFilePath;
		 String goBloodTestFileName;
		 String goBloodTestDate;
		 String goBloodTestGoRegistrationDate;
		병원명,의사명, 진료내용
		 String goHospitalName;
		 String goDoctorName;
		 String goTreatContents;
		 을 가진 List<GoBloodTestTreatSub> 타입의 객체를 가진
		  GoTest 클래스타입의 객체에 bloodTestCount를 추가하여 리턴시켜준다.
		*/
		
		
		//세션 임의로 만들어서 넣어줌 테스트할때 매개변수로 httpSession session 받아야함
		session.setAttribute("GOCITIZENID", "900101-1000001");
		System.out.println("세션확인 : "+session.getAttribute("GOCITIZENID"));
		String goCitizenId = (String) session.getAttribute("GOCITIZENID");
		goTest.setGoCitizenId(goCitizenId);
		String FirstDate = "1990-01-01";
		String SecondDate = "2017-02-28";
		goTest.setGoFirstDate(FirstDate);
		goTest.setGoSecondDate(SecondDate);
		String space = "";
		goTest.setGoDoctorName(space);
		goTest.setGoHospitalName(space);
		//여기까지
			logger.debug("혈액검사 요청페이지에서 날짜 넘겨받음");

			logger.debug("주민번호 확인 : "+goTest.getGoCitizenId());
			GoTest goBloodTest = goTS.selectBloodTest(goTest);
			System.out.println("goBloodTest:"+goBloodTest);
			//모델에 list타입 객체를 담음
			model.addAttribute("goTestBlood",goBloodTest);
			
			//gson 타입객체로 바꾸는 중 에러나있는 곳
			/*List<GoBloodTestTreatSub> bloodTestResultList = goBloodTest.getGoBloodTestTreatSub();
			String CitizenId = goBloodTest.getGoCitizenId();
			int count = goBloodTest.getSelectBloodTestCount();
			String hospitalName = goBloodTest.getGoHospitalName();
			String doctorName = goBloodTest.getGoDoctorName();
			String firstDay = goBloodTest.getGoFirstDate();
			String secondDay = goBloodTest.getGoSecondDate();
					*/
			Gson gson = new Gson();
			String bloodTestResult = gson.toJson(goBloodTest);
			System.out.println("혈액검사결과 확인 : "+bloodTestResult);

	
			//view 페이지로 포워딩
		return "";
		
	}
	
	//json type으로 요청한것을 받아보겠다.
	@RequestMapping(value="/getJson" , method=RequestMethod.GET)
	public String getJson(){
		 Http http = new Http("http://localhost/project/government/goJson");
		 try {
			String jsonString = http.submit();
			System.out.println("jsonString : "+jsonString);
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "";
	}
	
	
	//영상검사 요청페이지
	@RequestMapping(value="/government/goImageTest" , method=RequestMethod.GET)
	public String selectImgTest(){
		logger.debug("img요청페이지");
		return "/government/citizen/testVaccinationCheckup/imgTest";
		
	}
	
	//영상검사 요청페이지에서 날짜 citizenNo 넘겨받음 citizenNo는 추후에 로그인정보에서 citizenNO 혹은 주민번호를 받아 올 예정
	//주민번호를 받게되면 DTo와 mapper 수정해야함.
	@RequestMapping(value="/government/goImageTest" , method=RequestMethod.POST)
	public String selectImgTest(Model model, GoTest goTest, HttpSession session){
		/*
		
		 */
		
		
		
		
		//세션 받아서 goTest객체에 담아줌
		System.out.println("세션확인 : "+session.getAttribute("GOCITIZENID"));
		String goCitizenId = (String) session.getAttribute("GOCITIZENID");
		goTest.setGoCitizenId(goCitizenId);
		
		
			logger.debug("citizenId 확인 : "+goTest.getGoCitizenId());
			logger.debug("입력받은 날짜 확인 : "+goTest.getGoFirstDate()+" , "+goTest.getGoSecondDate());
			
			GoTest goImageTest = goTS.selectImageTest(goTest);
			//모델에 이미지결과 받아온 list를 담음
			model.addAttribute("goImageTest",goImageTest);
		return "/government/citizen/testVaccinationCheckup/imgTestResult";
		
	}
	

}
