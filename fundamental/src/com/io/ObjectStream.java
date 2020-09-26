package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectStream {

	public static void main(String[] args) {
		Map<Integer, String> ob = new HashMap<>();
		ob.put(1, "Ambe");
		ob.put(2, "Anjali");
		ob.put(3, "Anu");
		ob.put(4, "Shail");
		ob.put(5, "Shradha");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.data"))) {
			oos.writeObject(ob);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))) {
			Map<Integer, String> readObject = (Map<Integer, String>) ois.readObject();
			readObject.forEach((k, V) -> System.out.println(k + " " + V));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
