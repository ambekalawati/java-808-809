package singleton;

public class ImproveThreadsafeSingleton {
	private static ImproveThreadsafeSingleton instance;

	private ImproveThreadsafeSingleton() {
		throw new RuntimeException();
	}

	public static ImproveThreadsafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ImproveThreadsafeSingleton.class) {
				if (instance == null) {
					instance = new ImproveThreadsafeSingleton();
				}
			}
		}
		return instance;
	}

}
