package com.tanaprog.bank.service;

import java.util.List;

import com.tanaprog.bank.entity.AbstractEntity;

public interface IAbstractEntityService<T extends AbstractEntity> {
	
	T find (long id);
	List<T> findAll();
	T save (T entity);
	void delete (long id);
}
