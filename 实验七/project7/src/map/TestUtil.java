package map;

import java.util.*;

public class TestUtil {

	public static void main(String[] args) {
		new Util();
		List<String> nameList = Util.generateNameList(10000000);
		Map<String, Student> stuMap = Util.generateStudentMap(10000000);
		String name = "Itlgjantde";

		long startTime = System.currentTimeMillis();
		System.out.println("Name: " + Util.searchName(nameList, name));
		long listEndTime = System.currentTimeMillis();
		System.out.println("Student: " + Util.searchStudent(stuMap, name));
		long mapEndTime = System.currentTimeMillis();
		long listUsedTime = (listEndTime - startTime);
		long mapUsedTime = (mapEndTime - listEndTime);
		System.out.println("End time of list: " + listUsedTime + "ms\nEnd time of map: " + mapUsedTime + "ms");

		Util.printStudentMap(stuMap);
	}

}
