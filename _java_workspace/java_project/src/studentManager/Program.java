package studentManager;

import java.util.Scanner;

public interface Program {
	/*
	 * - 학생리스트 출력기능  void printStudent();
	- 학생등록기능  void insertStudent(Scanner scan);
	- 학생검색기능  void searchStudent(Scanner scan);
	- 수강신청기능  void registerSubject(Scanner scan);
	- 수강철회기능  void deleteSubject(Scanner scan);
	 * */
	void printStudent();
	void insertStudent(Scanner scan);
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
}
