package com.tanaprog.bank.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Account extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn
	private Client client;
	
	@ManyToMany
	private List<Card> cards;
	@Column
	private BigDecimal amount;
	@Column
	private Timestamp created;

}
