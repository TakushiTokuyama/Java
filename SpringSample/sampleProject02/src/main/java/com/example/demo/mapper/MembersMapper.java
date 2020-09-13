package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.TimeCardDto;

@Mapper
public interface MembersMapper {
	@Select("SELECT * FROM timecard")
	List<TimeCardDto> FindAll();

	@Insert("INSERT INTO timecard VALUES(2,'AAAA', now(), now(), null, null, now())")
	void Register();

	@Update("UPDATE timecard SET taisyatime=now(),totaltime = TIMEDIFF(taisyatime, syusyatime) WHERE id=2")
	void Update();
}
