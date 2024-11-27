package com.openclassrooms.api;

import com.openclassrooms.api.model.Employee;
import com.openclassrooms.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {
@Autowired
private EmployeeRepository employeeRepository;
// Commentaire toto
public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	List<Employee> employees = (List<Employee>) employeeRepository.findAll();

	for(Employee employee : employees) {
		System.out.println("Le prénom de l'employé est : " + employee.getFirstName());
		System.out.println("Le nom de l'employé est : " + employee.getLastName());
	}
}
}

