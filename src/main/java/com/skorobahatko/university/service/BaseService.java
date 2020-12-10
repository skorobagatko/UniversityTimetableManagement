package com.skorobahatko.university.service;

import java.util.List;

public interface BaseService<T> {
	
	List<T> getAll();
	T getById(int id);
	void add(T t);
	void removeById(int id);

}
