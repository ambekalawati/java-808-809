package oops;

import java.io.IOException;

@FunctionalInterface


public interface InterF {	
	int a=10;
	void m2() throws IOException;
default void m3() {
	System.out.println("m3");
		
	}
default void m4() {
	System.out.println("m4");
		
	}
default void m5() {
	System.out.println("m5");
	
}
static void m6() {
	System.out.println("m6");
	
}
static void m7() {
	System.out.println("m7");
	
}

}
