package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Members;
import com.example.demo.domain.MembersRepository;

@Service
@Transactional
public class MembersService {
	@Autowired
    MembersRepository repository;
	 public String FindByName(Members member) {
	        return "";
	    }

}
