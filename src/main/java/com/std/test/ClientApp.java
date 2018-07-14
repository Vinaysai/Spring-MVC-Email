package com.std.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.std.bean.Employee;
import com.std.service.EmployeeServiceImpl;

public class ClientApp {

	public static void main(String[] args) {
		// create ioc container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");

		EmployeeServiceImpl service = (EmployeeServiceImpl) ctx.getBean("service", EmployeeServiceImpl.class);

		// // Insert
		//
		// Employee e = new Employee();
		// e.setId(558);
		// e.setName("chaithu");
		// e.setDept("EXE");
		//
		// String result = service.insert(e);
		// System.out.println(result);

		// Delete An Employee

		int delete = service.delete(67);
		System.out.println(delete);

		// List of Employees

		List<Employee> findAll = service.findAll();

		Iterator<Employee> i = findAll.iterator();
		while (i.hasNext()) {

			System.out.println(i.next());

		}

		// Find an Employee Based on Id

		Employee findEmployee = service.findEmployee(559);
		System.out.println(findEmployee);

	}

}
