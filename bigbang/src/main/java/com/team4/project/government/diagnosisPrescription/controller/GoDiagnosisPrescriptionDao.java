package com.team4.project.government.diagnosisPrescription.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.diagnosisPrescription.domain.GoPrescription;

@Repository
public class GoDiagnosisPrescriptionDao {

	@Autowired
	private SqlSessionTemplate sql;
	
	///// 진단
	
	// 진료코드로 진단결과 가져오기
	public List<GoDiagnosis> selectListDiagnosisByTreatCode(String treatCode){
		return sql.selectList("goDiagnosisPrescription.selectListDiagnosisByTreatCode", treatCode);
	}
	
	// 주민번호로 진단결과 가져오기
	public List<GoDiagnosis> selectListDiagnosisByCitizenId(String citizenId){
		return sql.selectList("goDiagnosisPrescription.selectListDiagnosisByCitizenId", citizenId);
	}
	
	// 의사아이디로 진단결과 가져오기
	public List<GoDiagnosis> selectListDiagnosisByDoctorId(String doctorId){
		return sql.selectList("goDiagnosisPrescription.selectListDiagnosisByDoctorId", doctorId);
	}
	
	// 최근7일간 진단된 최고 10순위 결과 가져오기
	public List<Map> selectListDiagnosisByTopcount(int period){
		return sql.selectList("goDiagnosisPrescription.selectListDiagnosisByTopcount",period);
	}
	
	
	/////// 처방
	
	// 진료코드로 처방결과 가져오기
	public List<GoPrescription> selectListPrescriptionByTreatCode(String treatCode){
		return sql.selectList("goDiagnosisPrescription.selectListPrescriptionByTreatCode", treatCode);
	}
	
	// 주민번호로 처방결과 가져오기
	public List<GoPrescription> selectListPrescriptionByCitizenId(String citizenId){
		return sql.selectList("goDiagnosisPrescription.selectListPrescriptionByCitizenId", citizenId);
	}
	
	// 의사아이디로 처방결과 가져오기
	public List<GoPrescription> selectListPrescriptionByDoctorId(String doctorId){
		return sql.selectList("goDiagnosisPrescription.selectListPrescriptionByDoctorId", doctorId);
	}
	
	// 최근 7일간 처방된 10순위 결과 가져오기
	public List<Map> selectListPrescriptionByTopcount(int period){
		return sql.selectList("goDiagnosisPrescription.selectListPrescriptionByTopcount",period);
	}
}
