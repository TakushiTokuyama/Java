package com.example.demo.domain;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data
public class TimeCardDto {
	private Integer id;

	private String name;

	private Date ymd;

	private Time syusyatime;

	private Time taisyatime;

	private String totaltime;

	private Time rirekitime;
}
