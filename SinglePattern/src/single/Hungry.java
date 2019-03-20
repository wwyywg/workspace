package single;

public class Hungry {

	private static final Hungry instance = new Hungry();
	private Hungry() {
		// TODO Auto-generated constructor stub
	}
	
	public static Hungry getInstance() {
		return instance;
	}
}
