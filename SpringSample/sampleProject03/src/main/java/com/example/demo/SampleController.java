package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.mapper.EmployeesMapper;

@Controller
public class SampleController {

	@Autowired EmployeesMapper employeesMapper;

	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("employees",employeesMapper.FindAll());
		model.addAttribute("visit", "訪問回数");
		model.addAttribute("construct","契約回数");
		return "index";
	}

	@GetMapping("/calender")
	public String Calender(Model model) {
		return "calender";
	}

}
