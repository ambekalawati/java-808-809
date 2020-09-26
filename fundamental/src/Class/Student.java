package Class;

public class Student {

	int y = 10;
	static {
		int r = 10;
		int e = 5;
	}
	int r;

	int x = 012;

	void go(final int i) {
		System.out.println(i / x);
	}

	private Student(String s) {
		System.out.println("A");
	}

	public static void main(String[] args) {
		int o = 0;
		int p = 10;
		String g = "AK";
		StringBuilder sb = new StringBuilder("aAaA");
		sb.insert(sb.lastIndexOf("A"), true);
		System.out.println("Sb" + sb);
		if (o++ > 1 && ++p > 10) {
			System.out.println("o=" + (o + p));
		}
		if (++p > 10 || ++o > 10) {
			System.out.println("p=" + (o + p));
		}

		int i = 3;
		int m = 2;
		System.out.println(i-- + --m + ++i);

		Student s = new Student("K");
		s.go(20);

		int[] a = { 1, 2, 3, 4 };
		for (int j : a) {
			if (j == 2)
				continue;
			for (int x = 0; x < 3; System.out.println(x)) {
				x++;
			}
		}

	}

}
