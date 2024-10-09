package dsmolina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MyConnectionPool {

	private static String url;
	private static String user;
	private static String password;
	private static List<Connection> connectionPool = new ArrayList<>();
	private static List<Connection> usedConnections = new ArrayList<>();
	private static int INITIAL_POOL_SIZE = 5;// 5 opened connection at the same time

	public static MyConnectionPool create() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
		url = resourceBundle.getString("url");
		user = resourceBundle.getString("user");
		password = resourceBundle.getString("password");

		// List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
		for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
			connectionPool.add(createConnection(url, user, password));
		}
		return new MyConnectionPool();
	}

	private MyConnectionPool() {
	}

	public Connection getConnection() {
		Connection connection = connectionPool.remove(connectionPool.size() - 1);
		usedConnections.add(connection);
		return connection;
	}

	public boolean releaseConnection(Connection connection) {
		connectionPool.add(connection);
		return usedConnections.remove(connection);
	}

	private static Connection createConnection(String url, String user, String password) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return connection;
	}

	public int getSize() {
		return connectionPool.size() + usedConnections.size();
	}

}