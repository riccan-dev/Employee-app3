package com.example.demo.domain.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.seasar.doma.Entity;
import org.seasar.doma.Metamodel;
import org.seasar.doma.jdbc.entity.NamingType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(metamodel = @Metamodel,  naming = NamingType.SNAKE_LOWER_CASE)
//@Table(name = "tickets", "cities", "flights") テーブルが複数ある場合はいらない。
@Getter
@Setter
@NoArgsConstructor
public class TicketMerged {
	
	private Integer ticketId;

	private LocalDate departureDate;

	private Integer price;

	private Integer seatCount;

	private String flightNo;

	private String airlineName;

	private LocalTime departureTime;

	private LocalTime arrivalTime;

	private String departureCityName;

	private String arrivalCityName;

}
