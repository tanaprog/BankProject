package com.tanaprog.bank.entity;

import javax.persistence.Column;

import org.springframework.security.core.GrantedAuthority;

public class Authority extends AbstractEntity implements GrantedAuthority {
	
	@Column
	private String role;

	@Override
	public String getAuthority() {
		
		return this.role;
	}

}
