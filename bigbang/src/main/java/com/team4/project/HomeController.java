package com.team4.project;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;

@Controller
public class HomeController implements ServletContextAware{
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private ServletContext context;

	@Override
	public void setServletContext(ServletContext context) {
		this.context = context;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		String admin = context.getInitParameter("test");
		logger.debug("context.test:"+admin);
		logger.debug("context.test1:"+context.getInitParameter("test1"));
		
		return "home";
	}

	
}
