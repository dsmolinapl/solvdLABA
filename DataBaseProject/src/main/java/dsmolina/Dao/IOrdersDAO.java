package dsmolina.Dao;

import java.util.List;

import dsmolina.model.Orders;

public interface IOrdersDAO extends IBaseDAO<Orders> {

	@Override
	Orders getEntityById(int index);

	@Override
	List<Orders> getEntities();

	@Override
	void insert(Orders t);

	@Override
	void delete(int index);

	@Override
	void update(int index, Orders t);

}
