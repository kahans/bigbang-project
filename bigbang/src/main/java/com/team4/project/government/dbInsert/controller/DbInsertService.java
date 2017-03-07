package com.team4.project.government.dbInsert.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.scenario.effect.Bloom;

@Service
public class DbInsertService {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertService.class);
	@Autowired
	private DbInsertDao dbInsertDao;
	
	//컨트롤러에서 한꺼번에 넘겨준 것 분기해서 각각 DAO 쓸 예정
	
	@Transactional
	public String DbAddInformation(){
		//매개변수로 받은 덩어리에서 각 기능별 insert할 정보 쪼개기
		
		
		//while문 돌지말라고 false값 넣어놓음
		boolean t = true; 
		boolean f = false;
		
		
		
		while(f){
			//진료리스트 받아서 dao 호출
			dbInsertDao.insertTreat(/*매개변수*/);
		}
		
		return "";
	}
	
}
