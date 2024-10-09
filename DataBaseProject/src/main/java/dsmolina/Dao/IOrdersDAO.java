package dsmolina.Dao;

import java.util.List;

import dsmolina.model.Orders;

public interface IOrdersDAO extends IBaseDAO <Orders>  {

	@Override
	default Orders getEntityById(int index) {
		
		return null;
	}

	@Override
	default List<Orders> getEntities() {
	
		return null;
	}

	@Override
	default void insert(Orders t) {
	
		
	}

	@Override
	default void delete(int index) {
		
		
	}

	@Override
	default void update(int index, Orders t) {
		
		
	}

	
}
