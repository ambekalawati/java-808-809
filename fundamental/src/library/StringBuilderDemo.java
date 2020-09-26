package library;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("WhizLab");
		System.out.println(sb.capacity());
		char arr []= new char[5];
		sb.getChars(0, 5, arr, 0);
		for(char c: arr)
			System.out.println(c);

	}

}
