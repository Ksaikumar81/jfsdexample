package com.klef.jfsd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
    List<Customer> customers = new ArrayList<>();
   
	@GetMapping("/demo1")
	public int demo1()
	{
		return 123;
	}
	
	@GetMapping("/demo2")
	public double demo2()
	{
		return 670.123;
	}
	
	@GetMapping("/demo3")
	public String demo3()
	{
		return "<h1>Hello</h1>";
	}
	
	@GetMapping("/demo4")
	public String demo4()
	{
		String s = "KLEF";
		
		return "I Study at"+" "+s;
	}
	
	@GetMapping("/demo5/{id}")
	public int demo5(@PathVariable("id") int pid)
	{
		return pid;
	}
	
	@GetMapping("/demo6/{a}/{b}")
	public String demo6(@PathVariable("a") int num1, @PathVariable("b") int num2)
	{
		return "Sum: "+(num1+num2);
	}
	
	@GetMapping("/demo7")
	public String demo7(@RequestParam int id)
	{
		return Integer.toString(id);
	}
	
	@GetMapping("/demo8/{name}")
	public String demo8(@PathVariable("name") String n)
	{
		return n;
	}
	
	@PostMapping("/addcustomer")
	public String addCustomer(@RequestBody Customer c)
	{
		customers.add(c);
		return "Customer added successfully";
	}
	
	@GetMapping("/viewcustomer")
	public List<Customer> viewCustomer()
	{
		return customers;
	}
	
}
