package LambdaExpression;

public class Student {
	private int sid;
	private String name;
	private int phoneNo;

	public Student(int sid, String name, int phoneNo) {
		super();
		this.sid = sid;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return " " + sid + " " + name + " " + phoneNo;
		// return "Student [sid=" + sid + ", name=" + name + ", phoneNo=" + phoneNo +
		// "]";
	}

}
