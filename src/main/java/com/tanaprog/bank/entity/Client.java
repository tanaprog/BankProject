package com.tanaprog.bank.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
public class Client extends AbstractEntity {
	
	@Column(name="first_name", nullable=false, length=100)
	private String firstName;
	@Column(name="last_name", nullable=false, length=100)
	private String lastName;
	@Column(nullable=false, unique=true, length=50)
	private String phone;
	@Column(nullable=false, length=50 )
	private String email;
	@Column(nullable=false, unique=true, length=50)
	private String login;
	@Column(nullable=false, length=50)
	private String password;
	@Column(nullable=false)
	private Timestamp created;
	
	@ManyToOne
	@JoinColumn
    private Authority authority;	
}