package com.example.masterclass.masterclass;

import componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class );
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication.class, args);
		ComponentDAO personDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());


		//BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		//int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);

		//System.out.println(result);
		//SpringApplication.run(MasterclassApplication.class, args);
	}

}
