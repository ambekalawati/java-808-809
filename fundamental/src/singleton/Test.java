package singleton;

public class Test {

	public static void main(String[] args) {
		EagerInitialization instance = EagerInitialization.getInstance();
		EagerInitialization instance1 = EagerInitialization.getInstance();
		EagerInitialization instance2 = EagerInitialization.getInstance();
		EagerInitialization instance3 = EagerInitialization.getInstance();
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
	}

}
