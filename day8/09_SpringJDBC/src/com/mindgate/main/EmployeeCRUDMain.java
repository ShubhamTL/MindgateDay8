package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.dao.EmployeeDAOInterface;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {

		Employee employee = new Employee(1, "Yogesh", 26000);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);
//		boolean result = employeeServiceInterface.addNewEmployee(employee);
//		
//		if(result)
//			System.out.println("Employee Added Successfully");
//		else 
//			System.out.println("Failed to add new employee");
//		
//		
//		List<Employee> allEmployees = employeeServiceInterface.getAllEmployee();
//		
//		for (Employee emp : allEmployees) {
//			System.out.println(emp);
//		}
//		
//		System.out.println("-".repeat(50));
//		
//		Employee singleEmployee= employeeServiceInterface.getEmployeeByEmployeeId(1);
//		System.out.println(singleEmployee);
//		Employee emp = new Employee(3, "Yogesh Nanvate", 26500);
//		boolean result = employeeServiceInterface.updateEmployee(emp);
//
//		if (result)
//			System.out.println("Employee Updated uccessfully");
//		else
//			System.out.println("Failed to Upadate employee");

		
		boolean result = employeeServiceInterface.deleteEmployeeByEmployeeId(3);

		if (result)
			System.out.println("Employee Delete uccessfully");
		else
			System.out.println("Failed to Delete employee");
	}

}
