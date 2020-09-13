package com.example.demo.domain;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data
public class Times {
	private int id;

	private Date ymd;

	private Time syusyatime;

	private Time taisyatime;

	private String totaltime;
}
