package dsmolina.service;

import dsmolina.Dao.IUserDAO;
import dsmolina.Dao.jdbc.UsersDao;

public class UserService {
	
	public static IUserDAO getUserDAO(String connectrType) {
		if(connectrType.equalsIgnoreCase("jdbc"))
			return new UsersDao();
		else
			return new dsmolina.Dao.mybatis.UsersDao();
	}

}
