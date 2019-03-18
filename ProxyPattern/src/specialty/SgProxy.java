package specialty;

public class SgProxy implements Specialty {
	
	private WySpecialty realSubject=new WySpecialty();

	@Override
	public void display() {
		preRequest();
        realSubject.display();
        postRequest();
	}
	
	public void preRequest() {
          System.out.println("�عش�����Դ�ز���ʼ��");
    }
    public void postRequest() {
          System.out.println("�عش�����Դ�ز�������");
    }

}
