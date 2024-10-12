package dsmolina.Dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dsmolina.MyConnectionPool;
import dsmolina.Dao.IProductDAO;
import dsmolina.model.Products;

public class ProductsDao implements IProductDAO {

	static MyConnectionPool connectionPool = MyConnectionPool.create();

	@Override
	public Products getEntityById(int index) {
		Products products = new Products(null, index);
		Connection connection = null;
		try {
			connection = connectionPool.getConnection();
			String query = "SELECT * FROM orderssql.products  where product_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, index);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				products.setName(resultSet.getString("product_name"));
				products.setPrice(resultSet.getInt("product_price"));
			}
		} catch (SQLException e) {
			System.out.println("Error");
			;
		} finally {
			connectionPool.releaseConnection(connection);
		}
		return products;

	}

	@Override
	public List<Products> getEntities() {
		return IProductDAO.super.getEntities();
	}

	@Override
	public void insert(Products products) {

		String query = "INSERT INTO `orderssql`.`products`(`product_name`,`product_price`)VALUES(?,?)";
		Connection connection = null;
		try {
			connection = connectionPool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, products.getName());
			preparedStatement.setInt(2, products.getPrice());
			preparedStatement.execute();
		} catch (SQLException e) {
			System.out.println("ERROR");
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public void delete(int index) {
		Connection connection = null;
		try {
			connection = connectionPool.getConnection();
			String query = "DELETE  FROM orderssql.products  WHERE product_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, index);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error");
			;
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public void update(int index, Products product) {
		Connection connection = null;
		try {
			connection = connectionPool.getConnection();
			String temp = "UPDATE orderssql.products SET product_name = ?, product_price =? WHERE product_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(temp);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());
			preparedStatement.setInt(3, index);
			preparedStatement.execute();
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
