package single;

public class LazySingleton {

	private static volatile LazySingleton instance = null;	//��֤ instance �������߳���ͬ��
	private LazySingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
	}
}
