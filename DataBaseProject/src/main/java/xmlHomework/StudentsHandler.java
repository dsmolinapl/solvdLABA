package xmlHomework;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

public class StudentsHandler extends DefaultHandler {

	private static final String STUDENTS = "students";
	private static final String STUDENT = "student";
	private static final String NAME = "name";
	private static final String AGE = "age";
	private static final String COURSE = "course";

	private Students students;
	private StringBuilder elementValue;

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (elementValue == null) {
			elementValue = new StringBuilder();
		} else {
			elementValue.append(ch, start, length);
		}
	}

	@Override
	public void startDocument() throws SAXException {
		students = new Students();
	}

	@Override
	public void startElement(String uri, String lName, String qName, Attributes attr) {
		switch (qName) {
		case STUDENTS:
			students.setList(new ArrayList<>());
			break;
		case STUDENT:
			students.getList().add(new Student());
			break;
		case NAME:
			elementValue = new StringBuilder();
			break;
		case AGE:
			elementValue = new StringBuilder();
			break;
		case COURSE:
			elementValue = new StringBuilder();
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch (qName) {
		case NAME:
			latestArticle().setName(elementValue.toString());
			break;
		case AGE:
			latestArticle().setAge(Integer.parseInt(elementValue.toString()));
			break;
		case COURSE:
			latestArticle().setCourse(elementValue.toString());
			break;
		}
	}

	private Student latestArticle() {
		List<Student> studentList = students.getList();
		int latestArticleIndex = studentList.size() - 1;
		return studentList.get(latestArticleIndex);
	}

	public Students getStudents() {
		return students;
	}

}
