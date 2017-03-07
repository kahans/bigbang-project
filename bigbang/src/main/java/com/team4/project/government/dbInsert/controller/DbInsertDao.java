package com.team4.project.government.dbInsert.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DbInsertDao {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertDao.class);
	@Autowired
	private SqlSessionTemplate sql;
	//수술입력
	public int insertSurgery(){
		logger.debug("수술입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertSurgery");
	}
	
	//차트입력
	public int insertChart(){
		logger.debug("차트입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertChart");
	}
	//진료 입력
	public int insertTreat(/*매개변수*/ ){
		logger.debug("진료입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertTreat");
	}
	
	//혈액검사 입력
	public int insertBloodTest(){
		logger.debug("혈액검사입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertBloodTest");
	}
	
	//건강검진 입력
	public int insertCheckup(){
		logger.debug("건강검진입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertCheckup");
	}
	
	//진단 입력
	public int insertDiagnosis(){
		logger.debug("진단입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertDiagnosis");
	}
	
	//입/퇴원 입력
	public int insertHospitalization(){
		logger.debug("입/퇴원입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertHospitalization");
	}
	
	//영상검사 입력
	public int insertImageTest(){
		logger.debug("영상검사입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertImageTest");
	}
	
	//처방 입력
	public int insertPrescription(){
		logger.debug("처방입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertPrescription");
	}
	
	//예방접종 입력
	public int insertVaccine(){
		logger.debug("예바접종입력 DAO");
		logger.debug("매개변수 확인 : "/*매개변수*/);
		return sql.insert("dbInsert.insertVaccine");
		
	
	
	}
}
