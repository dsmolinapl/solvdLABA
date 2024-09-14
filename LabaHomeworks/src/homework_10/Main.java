package homework_10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		Class cust = Customer.class;
		Customer customer = new Customer("Nika");
		Class cust2 = customer.getClass();

		Customer customer2 = (Customer) cust.newInstance();// Create Object using Reflection with default construction
		Constructor constructor = cust.getConstructor(String.class);
		Customer customer3 = (Customer) constructor.newInstance("Nika2");
		LOGGER.info("Create Object with Reflection: " + customer3.getName());

		Constructor[] constructors = cust.getConstructors();
		for (Constructor constructor1 : constructors) {
			LOGGER.info("reflection count : " + constructor1.getParameterCount());
			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				LOGGER.info("Parameter name: " + parameter.getName());
				LOGGER.info("Parameter type: " + parameter.getType());
			}
			Method[] methods = cust.getDeclaredMethods();
			for (Method method : methods) {
				LOGGER.info("Method: " + method.getName());
				LOGGER.info("Method return type: " + method.getReturnType());
			}
			Method method = cust.getMethod("print", String.class);
			method.invoke(customer3, "Hello");
			Field[] fields = cust.getDeclaredFields();
			for (Field field : fields) {
				LOGGER.info("Field: " + field.getName());

			}
			Products product = new Products("Laptop LENOVO", 2600);

			List<Products> list = new ArrayList<>();
			list.add(new Products("Laptop ASUS", 8200));
			list.add(new Products("Laptop HP", 6200));
			list.add(new Products("Phone SAMSUNG", 3500));
			list.add(new Products("Phone VIVO", 2400));
			list.add(new Products("Phone IPHONE", 9900));

			list.stream().map(x -> x.getName()).forEach(y -> LOGGER.info(" " + y));
			List<Integer> prices = list.stream().map(x -> x.getPrice()).collect(Collectors.toList());
			List<String> products = list.stream().map(x -> x.getName()).collect(Collectors.toList());
			LOGGER.info("our products : " + products);
			list.stream().filter(x -> x.getPrice() > 5000)
					.forEach(y -> LOGGER.info(y.getName() + " - more expensive than 5000"));
			int sumAllPrice = list.stream().map(x -> x.getPrice()).reduce(0, (x, y) -> x + y);

			LOGGER.info("Summ prices all priducts is: " + sumAllPrice);
			list.stream().filter(x -> x.getPrice() < 9000).filter(x -> x.getPrice() > 3000)
					.forEach(x -> LOGGER.info("9000 >   " + x.getName() + "  price   " + "> 3000"));

			List<String> name = list.stream().filter(x -> x.getPrice() > 18).filter(x -> x.getPrice() < 7000)
					.map(x -> x.getName()).collect(Collectors.toList());
			LOGGER.info(name);

		}
	}
}
