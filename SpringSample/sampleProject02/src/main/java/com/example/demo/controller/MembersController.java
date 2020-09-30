package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.TimeCardDto;
import com.example.demo.mapper.MembersMapper;

@Controller
public class MembersController {

	@Autowired
	MembersMapper mapper;

	@GetMapping("/")
	public String Index(@ModelAttribute("formModel") TimeCardDto timeCard, Model model) {
		model.addAttribute("members", mapper.FindAll());
		return "index";
	}

	@PostMapping("/register")
	public String Register(Model model) {
		// 出社チェック
		if (mapper.FindSyusyaTime() == null) {
			mapper.Register();
		}
		return "redirect:/";
	}

	@PostMapping("/update")
	public String Update() {
		// 退社チェック
		if (mapper.FindTaisyaTime() == null) {
			mapper.Update();
		}
		return "redirect:/";
	}

	@PostMapping("/cancel")
	public String Cancel(@RequestParam("torikeshi") String torikeshi) {
		if (torikeshi.equals("1")) {
			mapper.SyusyaCancel();
		} else {
			mapper.TaisyaCancel();
		}
		return "redirect:/";
	}
}
