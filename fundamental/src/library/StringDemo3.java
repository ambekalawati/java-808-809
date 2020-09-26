package library;

public class StringDemo3 {

	public static void main(String[] args) {
		String word= "Totalt";
		int lan= word.length();
		System.out.println("length "+ word+" is :" +lan);
		System.out.println("length "+word+" is :" + word.length());
		char lastLetter = word.charAt(word.length()-1);
		System.out.println("The last letter "+ word +" is :" +lastLetter);
		char secondLetter = word.charAt(word.length()-4);
		System.out.println("The second letter"+word+" is :" +secondLetter);
		String s="";
		System.out.println(word.isEmpty());
		String [] name= {"kumar","kalawati","kumkum","mayawati","durgawati"};
		for(int i=0;i<name.length;i++) {
			if(name[i].endsWith("i"))
			System.out.print(String.join(" ,",name[i]));
			
		}
		System.out.println(word.lastIndexOf("t"));
		String st="ambe,kalawati";
		System.out.println(st.substring(3,9));
		String[] split = st.split(",");
System.out.println(split.length);
System.out.println(word.toLowerCase());
String join = String.join(",", "kumar","kalawati","kumkum","mayawati","durgawati");
System.out.println(join);
	}

}

