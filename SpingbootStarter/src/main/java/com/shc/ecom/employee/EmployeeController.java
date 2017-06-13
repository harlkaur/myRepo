package com.shc.ecom.employee;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/emp")
	private ArrayList<Employee> getEmployeeDetails() {
		return employeeService.details();
	}

	@RequestMapping(value = "/emp/{id}")
	private Employee getId(@PathVariable("id") String id) {
		return employeeService.getById(id);
	}

	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	private void addDetails(@RequestBody Employee e) {
		employeeService.addDetails(e);
	}

	@RequestMapping(value = "/emp/{id}", method = RequestMethod.PUT)
	private void updateDetails(@RequestBody Employee e,@PathVariable("id") String id) {
		employeeService.updateDetails(e, id);
	}

	@RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
	private void deleteDetails(@PathVariable("id") String id) {
		employeeService.deleteDetails(id);
	}
}
