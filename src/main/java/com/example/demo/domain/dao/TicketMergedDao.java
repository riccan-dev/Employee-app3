package com.example.demo.domain.dao;

import java.time.LocalDate;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.entity.TicketMerged;

@Dao
@ConfigAutowireable
public interface TicketMergedDao {
	
	@Select
	List<TicketMerged> selectById(LocalDate date, String city);

}
