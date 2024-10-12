package dsmolina.Dao;

import java.util.List;

import dsmolina.model.OrderDetails;

public interface IOrderDetailsDAO extends IBaseDAO<OrderDetails> {

	@Override
	OrderDetails getEntityById(int index);

	@Override
	List<OrderDetails> getEntities();

	@Override
	void insert(OrderDetails t);

	@Override
	void delete(int index);

	@Override
	void update(int index, OrderDetails t);

}
