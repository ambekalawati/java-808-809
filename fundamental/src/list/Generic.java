package list;

public class Generic<T> {
	void add(T data) {
		
	} 
	public static void main(String arg[]) {
		Generic<Integer> gn = new Generic<>();
		gn.add(5);
		Generic<String> s= new Generic<>();
		s.add("kalawati");
	}


}
