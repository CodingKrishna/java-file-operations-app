package com.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvWriter {

	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = "id,name,mobileNo,emailId";

	public static void main(String[] args) {
		String fileName = "D:\\Raju\\write.csv";
		CsvWriter.writeCsvFile(fileName);

	}

	
	public static void writeCsvFile(String fileName) {

		List<Student> students = new ArrayList();
		Student student1 = new Student(1, "raj", "123", "432raj");
		Student student2 = new Student(2, "prasad", "321", "prasad@123");
		Student student3 = new Student(3, "hanu", "434", "hanu@321");
		Student student4 = new Student(4, "hari", "79865", "hari@123");

	
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		
		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter(fileName);
			fileWriter.append(FILE_HEADER.toString());
			fileWriter.append(NEW_LINE_SEPARATOR);

			for (int i = 0; i < students.size(); i++) {

				fileWriter.append(String.valueOf(students.get(i).getId()));
				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(students.get(i).getName());
				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(students.get(i).getMobileNo());

				fileWriter.append(COMMA_DELIMITER);

				fileWriter.append(students.get(i).getEmailId());

				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);

			}
			System.out.println("successfully done");
		} catch (Exception e) {

			e.printStackTrace();

		}
		try {

			fileWriter.flush();

			fileWriter.close();

		} catch (IOException e) {

			System.out.println("Error while flushing/closing fileWriter !!!");

			e.printStackTrace();

		}

	}

}
