package proxy;

public class Proxy implements Subject {
	private RealSubject realSubject;

	@Override
	public void Request() {
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		preRequest();
		realSubject.Request();
		postRequest();
	}
	
	private void preRequest() {
		System.out.println("������ʵ����֮ǰ��Ԥ����");
	}
	
	private void postRequest() {
		System.out.println("������ʵ����֮���Ԥ����");
	}

}
