package com.tanaprog.bank.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToMany;

public class Card extends AbstractEntity {
	
	@ManyToMany
	private List<Account> accounts;
	@Column(nullable=false, unique=true, length=50)
	private long number;
	@Column(nullable=false, length=20)
	private int cvv;
	@Column(name="start_date")
	private Timestamp startDate;
	@Column(name="end_date")
	private Timestamp endDate;
	
	
}
