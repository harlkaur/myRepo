package com.shc.ecom.employee;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public ArrayList<Employee> details() {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(emp::add);
		return emp;
	}

	public Employee getById(String id) {
		return employeeRepository.findOne(id);
	}

	public void addDetails(Employee e) {
		employeeRepository.save(e);
	}

	public void updateDetails(Employee e, String id) {
		employeeRepository.save(e);
	}

	public void deleteDetails(String id) {
		employeeRepository.delete(id);
	}
}
