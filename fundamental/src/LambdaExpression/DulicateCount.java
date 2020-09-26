package LambdaExpression;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class DulicateCount {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("A");
		System.out.println("A: " + Collections.frequency(list, "A") + " B: " + Collections.frequency(list, "B") + " C: "
				+ Collections.frequency(list, "C"));

	}

}
