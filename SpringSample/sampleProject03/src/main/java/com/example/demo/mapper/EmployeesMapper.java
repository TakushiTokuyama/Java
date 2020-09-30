package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.EmployeesDto;

@Mapper
public interface EmployeesMapper {
	@Select("SELECT * FROM employees")
	List<EmployeesDto> FindAll();
}
