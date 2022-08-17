package com.example.masterclass.masterclass;

import com.example.masterclass.masterclass.basic.BinarySearch;
import com.example.masterclass.masterclass.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MasterclassApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(MasterclassApplication.class );
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MasterclassApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());

		//BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		//int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);

		//System.out.println(result);
		//SpringApplication.run(MasterclassApplication.class, args);
	}

}
