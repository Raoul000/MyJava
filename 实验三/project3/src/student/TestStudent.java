package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TestStudent {

	public static void main(String[] args) throws FileNotFoundException {
		Student[] student1 = Student.readStudentsFromFile("Students.txt");
		Student.studentSort(student1);
	}
}
