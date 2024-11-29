package com.openclassrooms.webapp.controller;

import com.openclassrooms.webapp.model.Employee;
import com.openclassrooms.webapp.model.Role;
import com.openclassrooms.webapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @GetMapping("/")
    public String home(Model model) {
        Iterable<Employee> listEmployee = service.getEmployees();
        model.addAttribute("employees", listEmployee);
        return "home";
    }


    @GetMapping("/test")
    public String getRole(Model model) {
        Role role = new Role();
        role.setName("Boulanger");

        model.addAttribute("role", List.of(role));
        return "test";
    }
}
