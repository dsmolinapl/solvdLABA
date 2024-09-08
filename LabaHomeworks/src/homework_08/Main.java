package homework_08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
	File example = new File("src\\homework_08\\file.txt");
	File result = new File("src\\homework_08\\resultsFile.txt");
	String readString = FileUtils.readFileToString(example, Charset.defaultCharset());
	System.out.println("readString: " + readString);

	String AB = readString.toLowerCase();
	AB = AB.replaceAll("[,.!?]", "");
	List<String> massivAB = Array(AB);
	HashMap<String, Integer> mapAB = ArrayMap(massivAB,AB);
	System.out.println("New array is : " + Array(AB));
	System.out.println("New map is : " + mapAB);
	FileUtils.write(result, mapAB.toString(), Charset.defaultCharset());
}

	public static List<String> Array(String AB) {
		String[] array = AB.split(" ");
		List<String> abArray = new ArrayList<>();
		abArray = Arrays.asList(array);
		for (String array1 : abArray) {
			System.out.println(array1);
		}
	return abArray;
}

public static HashMap<String, Integer> ArrayMap(List<String> listText, String allText) {
	HashMap<String, Integer> mapNew = new HashMap<>();
	for (int i = 0; i <  listText.size(); i++) {
		mapNew.put(listText.get(i), StringUtils.countMatches(allText ,listText.get(i)));
	}
	return mapNew;
}

}