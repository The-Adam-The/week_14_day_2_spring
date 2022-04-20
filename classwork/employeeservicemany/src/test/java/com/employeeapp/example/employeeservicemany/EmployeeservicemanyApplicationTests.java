package com.employeeapp.example.employeeservicemany;

import com.employeeapp.example.employeeservicemany.Models.Employee;
import com.employeeapp.example.employeeservicemany.Repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

//@AutoConfigureTestDatabase
@SpringBootTest
class EmployeeservicemanyApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee jack = new Employee("jack", "jones", "c87dddd9");
		employeeRepository.save(jack);
	}

}
