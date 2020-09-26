package arrayDataStructures;

public class DynamicArray {
	private int[] array;
	private int capacity = 10;
	private int size;

	public DynamicArray() {
		this.array = new int[capacity];
	}

	/*
	 * 1. check bucket is full or not 
	 * 2. if bucket is full then 
	 * a) store original array reference to temp array 
	 * b) Double the capacity of original array. 
	 * c) copy the data from temporary array to original one. 
	 * 3. add the data to the array 
	 * 4. increase the size.
	 */
	public void add(int data) {
		if (size != capacity) {
			this.array[size++] = data;
		} else {
			int[] temp = array;
			this.capacity = capacity * 2;
			this.array = new int[capacity];
			for (int i = 0; i < size; i++) {
				array[i] = temp[i];
			}
			array[size++] = data;
		}
	}

	public int size() {
		return size;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		DynamicArray array = new DynamicArray();
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.add(10);
		array.display();
		System.out.println(array.size());
	}
}
