package dsmolina.Dao;

import java.util.List;

import dsmolina.model.Products;

public interface IProductDAO extends IBaseDAO <Products> {

	@Override
	default Products getEntityById(int index) {
		
		return null;
	}

	@Override
	default List<Products> getEntities() {
		
		return null;
	}

	@Override
	default void insert(Products t) {
		
		
	}

	@Override
	default void delete(int index) {
		
		
	}

	@Override
	default void update(int index, Products t) {
		
		
	}
	

}
