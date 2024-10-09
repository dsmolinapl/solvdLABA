package dsmolina.Dao;

import java.util.List;

import dsmolina.model.OrderDetails;

public interface IOrderDetailsDAO extends IBaseDAO<OrderDetails>{

	@Override
	default OrderDetails getEntityById(int index) {
		return null;
	}

	@Override
	default List<OrderDetails> getEntities() {
		return null;
	}

	@Override
	default void insert(OrderDetails t) {	
	}

	@Override
	default void delete(int index) {	
	}

	@Override
	default void update(int index, OrderDetails t) {
		
	}
	

}
