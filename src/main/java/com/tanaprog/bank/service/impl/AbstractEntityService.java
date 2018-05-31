package com.tanaprog.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tanaprog.bank.entity.AbstractEntity;
import com.tanaprog.bank.service.IAbstractEntityService;

public class AbstractEntityService<T extends AbstractEntity> implements IAbstractEntityService<T> {

	@Autowired
	JpaRepository<T, Long> repository;
	
	@Override
	public T find(long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public T save(T entity) {
		return repository.saveAndFlush(entity);
	}

	@Override
	public void delete(long id) {
		
	}

}
