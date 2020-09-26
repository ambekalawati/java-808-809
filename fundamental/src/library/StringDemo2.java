package library;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = new String();
		String s2= new String("abc");
		String s3 = "abc";
		String s4= "abcd";
		String s5= s4.concat(s3);
		String s6="abc";
		System.out.println(s2==s3);// == operator check address/ location of the object
		System.out.println(s2.equals (s3));// equals method check content
		System.out.println(s3==s6);
		System.out.println(s3.equals(s6));
		
		
		

	}

}
