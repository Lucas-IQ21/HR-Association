package com.openclassrooms.webapp;

import com.openclassrooms.webapp.model.Employee;
import com.openclassrooms.webapp.model.Role;
import com.openclassrooms.webapp.repository.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class WebappApplication implements CommandLineRunner {
	@Autowired
	private EmployeeProxy employeeProxy;
	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {



	}
}
