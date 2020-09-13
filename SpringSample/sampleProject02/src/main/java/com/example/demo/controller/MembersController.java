package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.TimeCardDto;
import com.example.demo.mapper.MembersMapper;

@Controller
public class MembersController {

	@Autowired MembersMapper mapper;

	@GetMapping("/")
	public String Index(@ModelAttribute("formModel") TimeCardDto timecard, Model model) {
		model.addAttribute("members",mapper.FindAll());
		return "index";
	}

	@PostMapping("/register")
	public String Register() {
		mapper.Register();
		return  "redirect:/";
	}

	@PostMapping("/update")
	public String Update() {
		mapper.Update();
		return "redirect:/";
	}
}
