package com.team4.project.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddHospitalCode {
	private static final Logger logger = LoggerFactory.getLogger(AddHospitalCode.class);
	public static final String addHospitalCode(String primary){
		
		logger.debug("primary 확인 : "+primary);
		return primary;
		
	}
}
