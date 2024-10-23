package dsmolina.Dao;

import java.util.List;
import org.apache.ibatis.annotations.*;
import dsmolina.model.Users;

public interface IUserDAO extends IBaseDAO<Users> {
	
	@Select("SELECT * FROM users WHERE user_id = #{index}")
	@Results(value = {
			@Result(property="name", column="user_name"),
			@Result(property="phone", column="user_phone"),
	})

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
