package com.tanaprog.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table
public class Authority extends AbstractEntity implements GrantedAuthority {

	@Column
	private String role;

	@Override
	public String getAuthority() {

		return this.role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}
