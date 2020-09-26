package LambdaExpression;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent1 {

	public static void main(String[] args) {
		List<Student1> list = new ArrayList<Student1>();
		Student1 st1 = new Student1("ambe", "kalawati");
		Student1 st2 = new Student1("anjali", " jatav");
		Student1 st3 = new Student1("anu", " dubey");
		Student1 st4 = new Student1("shail", " mishra");
		Student1 st5 = new Student1("shradha", "jhadiya");
		Student1 st6 = new Student1("ankita", "kumari");
		Student1 st7 = new Student1("aakansha", "parihar");
		Student1 st8 = new Student1("amisha", "sinha");
		Student1 st9 = new Student1("soumya", "dixit");
		Student1 st10 = new Student1("ayushi", "tiwari");
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		list.add(st6);
		list.add(st7);
		list.add(st8);
		list.add(st9);
		list.add(st10);
		List<Student1> list1 = new ArrayList<>();
		for (Student1 s1 : list) {
			s1.setFirstName(s1.getFirstName().substring(0, 1).toUpperCase().concat(s1.getFirstName().substring(1)));
			list1.add(s1);
		}
		list1.forEach(System.out::println);
		List<Student1> list2 = new ArrayList<>();
		for (Student1 s2 : list) {
			s2.setLastName(s2.getLastName().substring(0, 1).toUpperCase().concat(s2.getLastName().substring(1)));
			list2.add(s2);
		}
		

		/*
		 * Iterator<Student1> it = list.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

	}

}
