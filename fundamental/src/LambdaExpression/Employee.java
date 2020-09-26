package LambdaExpression;

import java.time.LocalDate;

public class Employee {
	private int emp_id;
	private String emp_name;
	private double emp_salary;
	private LocalDate emp_dob;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public LocalDate getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(LocalDate emp_dob) {
		this.emp_dob = emp_dob;
	}

	public Employee(int emp_id, String emp_name, double emp_salary, LocalDate emp_dob) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_dob = emp_dob;
	}

	@Override
	public String toString() {
		/*
		 * return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name +
		 * ", emp_salary=" + emp_salary + ", emp_dob=" + emp_dob + "]";
		 */
		return emp_id + " " + emp_name + " " + emp_salary + " " + emp_dob;
	}

}
