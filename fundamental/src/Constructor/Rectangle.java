package Constructor;

public class Rectangle {
	int length;
	int width;
	int result;

	Rectangle(int x, int y) {
		length = x;
		width = y;
	}

	void rectArea() {
		result = length * width;
		System.out.println("result is:" +result);
	}

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(10, 20);
		obj.rectArea();
	}

}
