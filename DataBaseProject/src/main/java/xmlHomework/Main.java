package xmlHomework;

import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Main {
	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = builder.parse(new File("src/main/java/xmlHomework/student.xml"));
		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName("student");
		System.out.println("Numbers of students:  " + nodeList.getLength());
		Node first = nodeList.item(0);

		NodeList childNodesList = first.getChildNodes();
		int n = childNodesList.getLength();
		Node current;
		for (int i = 0; i < n; i++) {
			current = childNodesList.item(i);
			if (current.getNodeType() == Node.ELEMENT_NODE) {
				System.out.println(current.getNodeName() + ": " + current.getTextContent());
			}
		}
		System.out.println("--------------------------");

		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		StudentsHandler studentsHandler = new StudentsHandler();
		saxParser.parse("src/main/java/xmlHomework/student.xml", studentsHandler);

		Students result = studentsHandler.getStudents();
		System.out.println("Parse XML file using SAX: ");
		System.out.println("name: " + result.getList().get(1).getName());
		System.out.println("age: " + result.getList().get(1).getAge());
		System.out.println("course: " + result.getList().get(1).getCourse());

	}

}
