package LambdaExpression;

import java.util.Comparator;

public class Employee_sort {
	public static Comparator<Employee> sortById = new Comparator<Employee>() {

		@Override
		public int compare(Employee s1, Employee s2) {
			return s1.getEmp_id() - s2.getEmp_id();
		}

	};
	public static Comparator<Employee> sortByName = new Comparator<Employee>() {

		@Override
		public int compare(Employee s1, Employee s2) {
			int i = s1.getEmp_name().compareTo(s2.getEmp_name());
			return i;
		}

	};
	public static Comparator<Employee> sortBySalary = new Comparator<Employee>() {

		@Override
		public int compare(Employee s1, Employee s2) {
			int j = (int) (s1.getEmp_salary() - s2.getEmp_salary());
			if (j == 0) {
				int k = s1.getEmp_name().compareTo(s2.getEmp_name());
				if (k == 0) {
					int l = s1.getEmp_dob().compareTo(s2.getEmp_dob());
					return -l;
				}
				return k;
			}
			return j;

		}

	};
	public static Comparator<Employee> sortByDob = new Comparator<Employee>() {

		@Override
		public int compare(Employee s1, Employee s2) {
			return 0;
		}

	};

}
