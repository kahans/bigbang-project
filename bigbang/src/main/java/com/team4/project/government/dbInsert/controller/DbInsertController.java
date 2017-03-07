package com.team4.project.government.dbInsert.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbInsertController {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertController.class);
	@Autowired
	private DbInsertService dbInsertService;
	
	//테스트용 
/*	@RequestMapping(value="/a/b", method=RequestMethod.GET)
	public void dbAddInformation(Map<String,String> map){
		dbInsertService.DbAddInformation(map);
	}*/
	
	
}
