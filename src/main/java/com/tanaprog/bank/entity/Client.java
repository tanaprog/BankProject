package com.tanaprog.bank.entity;

import java.sql.Timestamp;

public class Client {
	
	private String firstName;
	private String lastNane;
	private String phone;
	private String email;
	private String login;
	private String password;
	private Timestamp created;
    private Authority authority;	
}