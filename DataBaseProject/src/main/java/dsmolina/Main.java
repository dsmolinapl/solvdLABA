package dsmolina;

import dsmolina.Dao.IUserDAO;
import dsmolina.Dao.jdbc.ProductsDao;
import dsmolina.Dao.jdbc.UsersDao;
import dsmolina.model.Products;
import dsmolina.model.Users;
import dsmolina.service.UserService;

public class Main {
	public static void main(String[] args) {

		IUserDAO userDAO = UserService.getUserDAO("mybatis");
		Users user = userDAO.getEntityById(10);
		System.out.println(user);
//		UsersDao usersDao = new UsersDao();
//		ProductsDao productsDao = new ProductsDao();
//
//		Users users = usersDao.getEntityById(5);
//		System.out.println(users);
//		Users user = new Users("Anna", 22, "567-66-09");
//		Users user2 = new Users("Nikola", 20, "867-00-65");
//		Users user3 = new Users("Monika", 77, "555-33-21");
//		Users user4 = new Users("Ola", 29, "689-01-22");
//		usersDao.insert(user);
//		usersDao.insert(user2);
//		usersDao.insert(user3);
//		usersDao.insert(user4);
//		usersDao.delete(8);
//		Users usersToUpdate = new Users();
//		usersToUpdate.setAge(30);
//		usersDao.update(5, usersToUpdate);
//
//
//		Products products = productsDao.getEntityById(3);
//		System.out.println("Your product is  " + products);
//		Products product = new Products("Laptop HP", 5700);
//		Products product2 = new Products("Laptop ASUS", 4500);
//		Products product3 = new Products("Laptop Lenovo", 3300);
//		Products product4 = new Products("Laptop Dell", 900);
//		productsDao.insert(product);
//		productsDao.insert(product2);
//		productsDao.insert(product3);
//		productsDao.insert(product4);
//		System.out.println("I add  " + product);
//		productsDao.delete(2);
//		Products productToUpdate = new Products("Laptop HP+", 5700);
//		productsDao.update(1, productToUpdate);
	}

}
