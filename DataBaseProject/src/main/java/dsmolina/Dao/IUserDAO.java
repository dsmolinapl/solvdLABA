package dsmolina.Dao;

import java.util.List;

import dsmolina.model.Users;

public interface IUserDAO extends IBaseDAO<Users> {

	@Override
	Users getEntityById(int index);

	@Override
	List<Users> getEntities();

	@Override
	void insert(Users t);

	@Override
	void delete(int index);

	@Override
	void update(int index, Users t);

}
