package dsmolina.Dao;

import java.util.List;

import dsmolina.model.Products;

public interface IProductDAO extends IBaseDAO<Products> {

	@Override
	Products getEntityById(int index);

	@Override
	List<Products> getEntities();

	@Override
	void insert(Products t);

	@Override
	void delete(int index);

	@Override
	void update(int index, Products t);

}
