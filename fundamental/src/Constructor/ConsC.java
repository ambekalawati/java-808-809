package Constructor;

public class ConsC {
	int year;
	String name;
	public ConsC(int ya, String na)
	{
      year= ya;
      name=na;
		
	}

	public static void main(String[] args) {
		ConsC myConsC = new ConsC(10,"doll");
		System.out.println(myConsC.year + "\n" + myConsC.name);

	}

}
