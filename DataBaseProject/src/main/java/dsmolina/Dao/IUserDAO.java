package dsmolina.Dao;

import java.util.List;

import dsmolina.model.Users;

public interface IUserDAO extends IBaseDAO <Users> {

	@Override
	default Users getEntityById(int index) {
		return null;
	}

	@Override
	default List<Users> getEntities() {
		return null;
	}

	@Override
	default void insert(Users t) {
		
	}

	@Override
	default void delete(int index) {	
	}

	@Override
	default void update(int index, Users t) {	
	}

	
}
