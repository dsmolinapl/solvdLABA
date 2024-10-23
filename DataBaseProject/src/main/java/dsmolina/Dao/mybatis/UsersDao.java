package dsmolina.Dao.mybatis;

import java.util.List;
import java.util.ResourceBundle;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import dsmolina.Dao.IUserDAO;
import dsmolina.model.Users;

public class UsersDao implements IUserDAO {

	@Override
	public Users getEntityById(int index) {
		SqlSessionFactory SqlSessionFactory  = buildqlSessionFactory();
		try(SqlSession session = SqlSessionFactory.openSession()) {
			Users user = session.selectOne("dsmolina.Dao.IUserDAO.getEntityById", index);
			return user;
		}
	}
	
	public static SqlSessionFactory buildqlSessionFactory() {

		ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
		String url = resourceBundle.getString("url");
		String user = resourceBundle.getString("user");
		String password = resourceBundle.getString("password");
		
		PooledDataSource dataSource = new PooledDataSource("com.mysql.cj.jdbc.Driver", url, user, password);
		Environment environment = new Environment("Development", new JdbcTransactionFactory(), dataSource);
	        
	    Configuration configuration = new Configuration(environment);
	    configuration.addMapper(IUserDAO.class);
	    // ...

	    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	    return builder.build(configuration);
	}

	@Override
	public List<Users> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Users t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int index, Users t) {
		// TODO Auto-generated method stub
		
	}

}
