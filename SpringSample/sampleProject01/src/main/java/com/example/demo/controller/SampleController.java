package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Members;
import com.example.demo.domain.MembersRepository;

@Controller
public class SampleController {

	private final MembersRepository repository;

	SampleController(MembersRepository repository) {
		this.repository = repository;
	}

	//@Autowired
	//private MembersRepository repository;

	@GetMapping("/")
	public String member(@ModelAttribute("formModel") Members members, Model model) {
		model.addAttribute("members", repository.findAll());
		return "index";
	}

	@PostMapping("/register")
	public String registerAndUpdate(@ModelAttribute("formModel") Members members) {
		if(members.getId() == null && members.getName() == "") {
			return "redirect:/";
		}
			repository.save(members);
		return "redirect:/";
	}

	@PostMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		repository.deleteById(id);
		return "redirect:/";
	}
}