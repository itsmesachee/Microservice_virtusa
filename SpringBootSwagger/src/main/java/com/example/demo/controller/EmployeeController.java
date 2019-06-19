package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;


	@RestController
	@RequestMapping("/first")
	public	class EmployeeController{
		
		List<Employee> el = new ArrayList<Employee>();{
			el.add(new Employee(01,"raj",1000));
			el.add(new Employee(02,"ravi",1000));
			el.add(new Employee(03,"santosh",1000));
			el.add(new Employee(04,"rama",1000));
		}
		
		
		@RequestMapping("/message1")
		public String getMessage(String s) {
			
			return "Hi Message from controller";
			
		}
		
		@RequestMapping("/getAllEmp")
		public List<Employee> getEmployees(){
			return el;
			
		}
		
		@RequestMapping("/getByName/{name}")
		public Employee getByName(@PathVariable(value= "name") String name) {
			
			return el.stream().filter(x->x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
		}
		
		@RequestMapping("/getById/{id}")
		public Employee getById(@PathVariable (value="id") int id){
			
				Employee e = new Employee();
				for(Employee e1 : el) {
					if(id==e1.getId()) {
						e.setId(e1.getId());
						e.setName(e1.getName());
						e.setSal(e1.getSal());
					}
				}
				return e;
			
		}
}
