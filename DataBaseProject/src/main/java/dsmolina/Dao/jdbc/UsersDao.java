package dsmolina.Dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dsmolina.MyConnectionPool;
import dsmolina.Dao.IUserDAO;
import dsmolina.model.Users;

public class UsersDao implements IUserDAO {

	static MyConnectionPool connectionPool = MyConnectionPool.create();

	@Override
	public Users getEntityById(int index) {
		Users users = new Users();
		Connection connection = null;
		try {
			connection = connectionPool.getConnection();
			String query = "SELECT * FROM orderssql.users  where user_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, index);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				users.setName(resultSet.getString("user_name"));
				users.setAge(resultSet.getInt("user_age"));
				users.setPhone(resultSet.getString("user_phone"));
			}
		} catch (SQLException e) {
			System.out.println("Error");
			;
		} finally {
			connectionPool.releaseConnection(connection);
		}
		return users;
	}

	@Override
	public List<Users> getEntities() {
		return IUserDAO.super.getEntities();
	}

	@Override
	public void insert(Users users) {

		String query = "INSERT INTO `orderssql`.`users`(`user_name`,`user_age`,`user_phone`)VALUES(?,?,?)";
		Connection connection = null;
		try {
			connection = connectionPool.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, users.getName());
			preparedStatement.setInt(2, users.getAge());
			preparedStatement.setString(3, users.getPhone());
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
			String query = "DELETE  FROM orderssql.users  WHERE user_id = ?";
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
	public void update(int index, Users user) {
		Connection connection = null;
		try {
			connection = connectionPool.getConnection();
			String query = "UPDATE orderssql.users SET user_age = ? WHERE user_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, user.getAge());
			preparedStatement.setInt(2, index);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error ");
		} finally {
			connectionPool.releaseConnection(connection);
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
