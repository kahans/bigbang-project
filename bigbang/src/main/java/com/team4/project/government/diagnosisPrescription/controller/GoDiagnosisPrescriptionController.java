package com.team4.project.government.diagnosisPrescription.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.team4.project.government.hopitalizationSurgery.controller.GoHospitalizationSurgeryController;

@RestController
public class GoDiagnosisPrescriptionController {
	private static final Logger logger = LoggerFactory.getLogger(GoHospitalizationSurgeryController.class);
	private Gson gson = new Gson();
	
	@Autowired
	private GoDiagnosisPrescriptionService goDPService;
	
	// 1.진료코드로 진단결과 가져오기(test)
	@RequestMapping(value="/government/getListDiagnosisByTreatCode", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByTreatCode(String treatCode, String test){
		logger.debug("getListDiagnosisByTreatCode GET 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByTreatCode(treatCode));
		return diagnosisList;
	}
	
	// 1.진료코드로 진단결과 가져오기
	@RequestMapping(value="/government/getListDiagnosisByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByTreatCode(String treatCode){
		logger.debug("getListDiagnosisByTreatCode POST 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByTreatCode(treatCode));
		return diagnosisList;
	}
	
	
	// 2.진료코드로 처방(약)결과 가져오기(test)
	@RequestMapping(value="/government/getListPrescriptionByTreatCode", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByTreatCode(String treatCode, String test){
		logger.debug("getListPrescriptionByTreatCode GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByTreatCode(treatCode));
		return prescriptionList;
	}
	
	// 2.진료코드로 처방(약)결과 가져오기
	@RequestMapping(value="/government/getListPrescriptionByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByTreatCode(String treatCode){
		logger.debug("getListPrescriptionByTreatCode GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByTreatCode(treatCode));
		return prescriptionList;
	}
	
	// 3.주민번호로 진단결과 가져오기(test)
	@RequestMapping(value="/government/getListDiagnosisByCitizenId", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByCitizenId(String citizenId, String test){
		logger.debug("getListDiagnosisByCitizenId GET 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByCitizenId(citizenId));
		return diagnosisList;
	}
	
	// 3.주민번호로 진단결과 가져오기
	@RequestMapping(value="/government/getListDiagnosisByCitizenId", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByCitizenId(String citizenId){
		logger.debug("getListDiagnosisByCitizenId GET 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByCitizenId(citizenId));
		return diagnosisList;
	}
	
	// 4.주민번호로 처방(약)결과 가져오기(test)
	@RequestMapping(value="/government/getListPrescriptionByCitizenId", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByCitizenId(String citizenId, String test){
		logger.debug("getListPrescriptionByCitizenId GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByCitizenId(citizenId));
		return prescriptionList;
	}
	
	// 4.주민번호로 처방(약)결과 가져오기
	@RequestMapping(value="/government/getListPrescriptionByCitizenId", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByCitizenId(String citizenId){
		logger.debug("getListPrescriptionByCitizenId GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByCitizenId(citizenId));
		return prescriptionList;
	}
	
	
	// 5.의사아이디로 처방(약)결과 가져오기(test)
	@RequestMapping(value="/government/getListPrescriptionByDoctorId", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByDoctorId(String doctorId, String test){
		logger.debug("getListPrescriptionByDoctorId GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByDoctorId(doctorId));
		return prescriptionList;
	}
	
	// 5.의사아이디로 처방(약)결과 가져오기
	@RequestMapping(value="/government/getListPrescriptionByDoctorId", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByDoctorId(String doctorId){
		logger.debug("getListPrescriptionByDoctorId GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByDoctorId(doctorId));
		return prescriptionList;
	}
	
	
	// 6.의사아이디로 진단결과 가져오기(test)
	@RequestMapping(value="/government/getListDiagnosisByDoctorId", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByDoctorId(String doctorId, String test){
		logger.debug("getListDiagnosisByDoctorId GET 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByDoctorId(doctorId));
		return diagnosisList;
	}
	
	
	// 6.의사아이디로 진단결과 가져오기
	@RequestMapping(value="/government/getListDiagnosisByDoctorId", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByDoctorId(String doctorId){
		logger.debug("getListDiagnosisByDoctorId GET 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByDoctorId(doctorId));
		return diagnosisList;
	}
	
	// 최근 7일간 진단된 최고 10순위 결과 가져오기(test)
	@RequestMapping(value="/government/getListDiagnosisByTopcount", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByTopcount(String period, String test){
		logger.debug("getListDiagnosisByTopcount GET 진입");
		if(period==null){
			return "period를 보내주세요";
		}
		int periodNum = Integer.parseInt(period);
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByTopcount(periodNum));
		return diagnosisList;
	}
	
	// 최근 7일간 진단된 최고 10순위 결과 가져오기
	@RequestMapping(value="/government/getListDiagnosisByTopcount", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByTopcount(String period){
		logger.debug("getListDiagnosisByTopcount GET 진입");
		if(period==null){
			return "period를 보내주세요";
		}
		int periodNum = Integer.parseInt(period);
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByTopcount(periodNum));
		return diagnosisList;
	}
	
	
	// 최근 7일간 처방된 10순위 결과 가져오기(test)
	@RequestMapping(value="/government/getListPrescriptionByTopcount", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByTopcount(String period, String test){
		logger.debug("getListPrescriptionByTopcount GET 진입");
		if(period==null){
			return "period를 보내주세요";
		}
		int periodNum = Integer.parseInt(period);
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByTopcount(periodNum));
		return prescriptionList;
	}
	
	
	// 최근 7일간 처방된 10순위 결과 가져오기
	@RequestMapping(value="/government/getListPrescriptionByTopcount", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByTopcount(String period){
		logger.debug("getListPrescriptionByTopcount GET 진입");
		if(period==null){
			return "period를 보내주세요";
		}
		int periodNum = Integer.parseInt(period);
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByTopcount(periodNum));
		return prescriptionList;
	}
	
}
