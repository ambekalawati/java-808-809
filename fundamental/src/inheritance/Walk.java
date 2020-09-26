package inheritance;

public interface Walk {
	public default int getSpeed() {
		return 6;
	}

}
