package homework_06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		IPhone myIPhone = new IPhone("white");
		IPhone myIPhone2 = new IPhone("white");
		Motorola myMotorola = new Motorola("black");
		Samsung mySamsung = new Samsung(true, "white");
		Vivo myVivo = new Vivo("white");
		Xiaomi myXiaomi = new Xiaomi("blue");

		myIPhone.addAdrress("Moon Street, house 9486 ");

		System.out.println(myIPhone.getAdress());
		Set<String> newSet = myIPhone.getAdress();

		Map<String, Integer> soldPhones = new HashMap<>();
		soldPhones.put("Sergey", 145);
		soldPhones.put("Boris", 1086);
		soldPhones.put("Anna", 4576);
		soldPhones.put("Sveta", 986);
		System.out.println("Sold Phone is : " + soldPhones.get("Sveta"));

		System.out.println("Number of model IPhons is: " + myIPhone.getNumModel());
		List<Integer> newList = myIPhone.getNumModel();

		myIPhone.addNumModel(7);

		System.out.println("  ");
		System.out.println(" Custom LinkedList:  ");
		CustomLinkedList customLinkedList = new CustomLinkedList();
		customLinkedList.insert(1);
		customLinkedList.insert(2);
		customLinkedList.insert(3);
		customLinkedList.insert(4);
		customLinkedList.display();
		customLinkedList.insertAt(2, 10);
		System.out.println("  ");
		customLinkedList.display();
		System.out.println("  ");
		customLinkedList.insertHead(100);
		customLinkedList.display();
		System.out.println("  ");
		customLinkedList.deleteNodeAt(1);
		customLinkedList.display();

	}

}
