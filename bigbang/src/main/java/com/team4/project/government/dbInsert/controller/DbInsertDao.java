package com.team4.project.government.dbInsert.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.treat.domain.GoTreat;

@Repository
public class DbInsertDao {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertDao.class);
	@Autowired
	private SqlSessionTemplate sql;
	
	//차트입력(나중에할예정, 패키지위치 못정함)
	
	//진료 입력
	public int insertTreat(/*매개변수*/ ){
		logger.debug("진료입력 DAO");
		logger.debug("매개변수 treat확인 : "/*매개변수*/);
		/*return sql.insert("dbInsrt.",매개변수);*/
		return 0;
	}
	
	
}
