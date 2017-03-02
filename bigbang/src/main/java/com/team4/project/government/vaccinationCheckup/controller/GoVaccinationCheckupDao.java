package com.team4.project.government.vaccinationCheckup.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;

@Repository
public class GoVaccinationCheckupDao {
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupDao.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String VACCINATIONCHECKUP_NS = "GoVaccinationCheckup.";
	//예방접종 목록 가져오기
	
	public GoVaccinationResult selectVaccination(String treatCode){
		logger.debug("Vaccination Dao");
		logger.debug("treatCode 확인 : "+treatCode);
		
		return sqlSession.selectOne("",treatCode);
	}
}
