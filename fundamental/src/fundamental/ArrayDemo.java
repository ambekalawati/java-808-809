package fundamental;

public class ArrayDemo {
	int[] a = new int[10];
//	int b[] = new int[10];
	int count = 0;

	public void add() {
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//		a[5] = 60;
//		a[6] = 70;
//		a[7] = 80;
//		a[8] = 90;
//		a[9] = 100;
//		int value=10;
//		for(int i=0;i<a.length;i++) {
//			a[i]=value;
//			value=value+10;
//		}

	}

// getElementByIndex(int index) return  value(int)
	public void add(int input) {
		// 1. check bucket is empty or not
		// 2 if bucket is empty then add
		// else don't add.
		// 3. increase the count.
		if (isEmpty()) {
			a[count] = input;
			count = count + 1;

		} else {
			System.out.println("Bucket is full you can't  add value : " + input);
		}

	}

	public boolean isEmpty() {
		// check count is less then a.length or not
		if (size() < a.length) {
			return true;

		} else {
			return false;
		}

	}

	public void removeLastElement() {
		// 1. check size of the bucket. if size>0 means there is some element
		// available// it will tell you about the index.
		// 2.count=size-1 or count=count-1
		if (size() > 0) {
			count = size() - 1;
		} else {

		}

	}

	public void display() {
		for (int i = 0; i < count; i++) {
			System.out.println(a[i]);
		}
	}

	public int size() {
		return count;
	}

	public int get(int index) {

		int value = a[index];

		return value;

	}

	public int getIndexByValue(int value) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayDemo array = new ArrayDemo();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		array.add(60);
		array.add(70);
		array.add(80);
		array.add(90);
		array.add(100);

		array.display();
		System.out.println("*******************************************************");
		array.removeLastElement();
		array.removeLastElement();
		array.removeLastElement();
		array.removeLastElement();
		array.display();
		System.out.println("Size: " + array.size());
		int result = array.get(1);
		System.out.println("result:" + result);
		int value =array.getIndexByValue(20);
		System.out.println("value:"+value);
	}

}
