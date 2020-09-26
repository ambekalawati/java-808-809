package LambdaExpression;

import java.util.List;
import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<Student>();
		Student s1 = new Student(1, "shail", 128);
		Student s2 = new Student(2, "shaily", 123);
		Student s3 = new Student(3, "shailja", 723);
		Student s4 = new Student(4, "anu", 233);
		Student s5 = new Student(5, "ambe", 122);
		Student s6 = new Student(6, "anjali", 223);
		Student s7 = new Student(7, "shradha", 323);
		Student s8 = new Student(8, "anjali", 423);
		Student s9 = new Student(9, "mahendra", 523);
		Student s10 = new Student(10, "sanjali", 623);
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		li.add(s7);
		li.add(s8);
		li.add(s9);
		li.add(s10);
		/*
		 * Iterator<Student> it = li.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		// Q1 fetch those student whose name starts with A?

		List<Student> list = new ArrayList<Student>();
		for (Student st : li) {
			if (st.getName().startsWith("a")) {
				list.add(st);
			}
		}
		list.forEach(System.out::println);
		// Q2 fetch those student who's ID lies between 5 to 8?
		for (Student s : li) {
			if (s.getSid() > 5 && s.getSid() < 8) {
				list.add(s);
			}
		}
		list.forEach(System.out::println);
		// Q3 Update those student name whose name starts with 's' and length must be
		// greater than 5 and update with java. set(int index, Element E)
		for (Student st1 : li) {
			if (st1.getName().startsWith("s") && st1.getName().length() > 5) {
				st1.setName("Java");
			}
		}
		System.out.println(li);
		// Q4 Update all the students names first character with UpperLetter?
		for (Student st2 : li) {
			st2.setName(st2.getName().substring(0, 1).toUpperCase().concat(st2.getName().substring(1)));
		}
		System.out.println(li);
//Q5 
		

	}

}
