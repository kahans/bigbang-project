package com.team4.project.government.test.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoImageTest;

@Repository
public class GoTestDao {
	private static final Logger logger = LoggerFactory.getLogger(GoTestDao.class);
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	//진료코드로 혈액검사결과를 조회한다.
	public GoBloodTest selectBlood(String treatCode){
		return sqlSession.selectOne("goTest.selectBloodTest", treatCode);
	}
	

	//진료코드로 영상검사결과를 조회한다.
	public GoImageTest selectImage(String treatCode){		
		return sqlSession.selectOne("goTest.selectImageTest", treatCode);		
	}
	
}
