package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo dao;
	
	public List<Employee> getAllEmployees(){
		return dao.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		 Optional<Employee> employee=dao.findById(id);
		 return employee.get();
	}
	
	public String saveEmployee(Employee employee) {
		dao.save(employee);
		return "Employee created Successfully with id "+employee.getEmpId();
	}
	
	public String updateEmployee(Employee employee) {
		Optional<Employee> object=dao.findById(employee.getEmpId());
		if(object.isEmpty())
			return "Employee does not exist in database";
		
		dao.save(employee);
		return "Employee updated Successfully with id "+employee.getEmpId();
	}
	
	public String deleteEmployee(int id) {
		Optional<Employee> object=dao.findById(id);
		if(object.isEmpty())
			return "Employee does not exist in database";
		dao.deleteById(id);
		return "Employee deleted successfuly";
	}
	
}
