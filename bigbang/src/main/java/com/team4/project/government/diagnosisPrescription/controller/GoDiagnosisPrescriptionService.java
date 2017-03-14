package com.team4.project.government.diagnosisPrescription.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.diagnosisPrescription.domain.GoPrescription;

@Service
public class GoDiagnosisPrescriptionService {

	@Autowired
	private GoDiagnosisPrescriptionDao goDPDao;

	//// 진단
	
	// 진료코드로 진단결과 가져오기
	public List<GoDiagnosis> getListDiagnosisByTreatCode(String treatCode){
		return goDPDao.selectListDiagnosisByTreatCode(treatCode);
	}
	
	// 주민번호로 진단결과 가져오기
	public List<GoDiagnosis> getListDiagnosisByCitizenId(String citizenId){
		return goDPDao.selectListDiagnosisByCitizenId(citizenId);
	}
	
	// 의사아이디로 진단결과 가져오기
	public List<GoDiagnosis> getListDiagnosisByDoctorId(String doctorId){
		return goDPDao.selectListDiagnosisByDoctorId(doctorId);
	}
	
	// 병원아이디로 진단결과 가져오기
	public List<GoDiagnosis> getListDiagnosisByHospitalId(String hospitalId){
		return goDPDao.selectListDiagnosisByHospitalId(hospitalId);
	}
	
	
	
	//// 처방 
	
	// 진료코드로 처방결과 가져오기
	public List<GoPrescription> getListPrescriptionByTreatCode(String treatCode){
		return goDPDao.selectListPrescriptionByTreatCode(treatCode);
	}
	
	// 주민번호로 처방결과 가져오기
	public List<GoPrescription> getListPrescriptionByCitizenId(String citizenId){
		return goDPDao.selectListPrescriptionByCitizenId(citizenId);
	}
	
	// 의사아이디로 처방결과 가져오기
	public List<GoPrescription> getListPrescriptionByDoctorId(String doctorId){
		return goDPDao.selectListPrescriptionByDoctorId(doctorId);
	}
	
	// 병원아이디로 처방결과 가져오기
	public List<GoPrescription> getListPrescriptionByHospitalId(String hospitalId){
		return goDPDao.selectListPrescriptionByHospitalId(hospitalId);
	}
}
