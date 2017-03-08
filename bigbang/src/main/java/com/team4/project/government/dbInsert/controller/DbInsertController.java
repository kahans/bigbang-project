package com.team4.project.government.dbInsert.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class DbInsertController {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertController.class);
	
	@Autowired
	private DbInsertService dbInsertService;
	
	@RequestMapping(value="/government/getHospitalInfo", method=RequestMethod.POST)
	public String getHospitalInfo(String hospitalCode, String hospitalInfo){
		logger.debug("hospitalCode 확인 controller : "+hospitalCode);
		logger.debug("hospitalInfo 확인 controller : "+hospitalInfo);
		String result = dbInsertService.DbAddInformation(hospitalCode, hospitalInfo);
		Gson gson = new Gson();
		String insertResult = gson.toJson(result);
		return insertResult;
	}
	
}
