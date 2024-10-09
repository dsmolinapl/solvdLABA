package dsmolina.Dao.jdbc;

import java.util.List;

import dsmolina.Dao.IOrdersDAO;
import dsmolina.model.Orders;

public class OrdersDao implements IOrdersDAO{

	@Override
	public Orders getEntityById(int index) {

		return IOrdersDAO.super.getEntityById(index);
	}

	@Override
	public List<Orders> getEntities() {

		return IOrdersDAO.super.getEntities();
	}

	@Override
	public void insert(Orders t) {

		IOrdersDAO.super.insert(t);
	}

	@Override
	public void delete(int index) {

		IOrdersDAO.super.delete(index);
	}

	@Override
	public void update(int index, Orders t) {

		IOrdersDAO.super.update(index, t);
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() {

		return super.toString();
	}
	

}
