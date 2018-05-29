package com.tanaprog.bank.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Operation extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn
	private Account account;
	@Enumerated(EnumType.STRING)
	private OperationType type;
	@Column(nullable=true)
	private BigDecimal amount;
	@Column
	private Timestamp created;
	
} 
