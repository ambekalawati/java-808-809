package LambdaExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee_Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(1, "Shivangi", 40000, LocalDate.of(1990, 02, 02));
		Employee e2 = new Employee(2, "Ambe", 50000, LocalDate.of(1992, 03, 03));
		Employee e3 = new Employee(3, "Alisha", 60000, LocalDate.of(1994, 04, 04));
		Employee e4 = new Employee(4, "Soumya", 60000, LocalDate.of(1996, 05, 05));
		Employee e5 = new Employee(5, "Shivangi", 40000, LocalDate.of(1998, 06, 06));
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		/*
		 * Collections.sort(list, Employee_sort.sortById);
		 * list.forEach(System.out::println);
		 * 
		 * System.out.println("SORTBYID****************************");
		 * Collections.sort(list, Employee_sort.sortByName);
		 * list.forEach(System.out::println);
		 * System.out.println("SORTBYNAME****************************");
		 * Collections.sort(list, Employee_sort.sortBySalary);
		 * list.forEach(System.out::println);
		 * System.out.println("SORTBYSALARY****************************");
		 * Collections.sort(list, Employee_sort.sortByDob);
		 * list.forEach(System.out::println);
		 * System.out.println("SORTBYDOB****************************");
		 */
		Collections.sort(list, Employee_sort.sortBySalary);
		list.forEach(System.out::println);
	}

}
