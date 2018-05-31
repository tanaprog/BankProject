package com.tanaprog.bank.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}	
	
	
}