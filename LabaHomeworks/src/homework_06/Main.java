package homework_06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	final static Logger LOGGER = LogManager.getLogger();
	
	public static void main(String[] args) {

		IPhone myIPhone = new IPhone("white");
		IPhone myIPhone2 = new IPhone("white");
		Motorola myMotorola = new Motorola("black");
		Samsung mySamsung = new Samsung(true, "white");
		Vivo myVivo = new Vivo("white");
		Xiaomi myXiaomi = new Xiaomi("blue");

		myIPhone.addAdrress("Moon Street, house 9486 ");

		LOGGER.info("Hello!");
		
		LOGGER.info(myIPhone.getAdress());
		Set<String> newSet = myIPhone.getAdress();

		Map<String, Integer> soldPhones = new HashMap<>();
		soldPhones.put("Sergey", 145);
		soldPhones.put("Boris", 1086);
		soldPhones.put("Anna", 4576);
		soldPhones.put("Sveta", 986);
		LOGGER.info("Sold Phone is : " + soldPhones.get("Sveta"));

		LOGGER.info("Number of model IPhons is: " + myIPhone.getNumModel());
		List<Integer> newList = myIPhone.getNumModel();

		myIPhone.addNumModel(7);

		LOGGER.info("  ");
		LOGGER.info(" Custom LinkedList:  ");
		CustomLinkedList customLinkedList = new CustomLinkedList();
		customLinkedList.insert(1);
		customLinkedList.insert(2);
		customLinkedList.insert(3);
		customLinkedList.insert(4);
		customLinkedList.display();
		customLinkedList.insertAt(2, 10);
		LOGGER.info("  ");
		customLinkedList.display();
		LOGGER.info("  ");
		customLinkedList.insertHead(100);
		customLinkedList.display();
		LOGGER.info("  ");
		customLinkedList.deleteNodeAt(1);
		customLinkedList.display();

	}

}
