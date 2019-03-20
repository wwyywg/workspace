package demo1;

public class RefinedAbstraction extends Abstraction {
	
	public RefinedAbstraction(Implementor imple) {
		super(imple);
	}

	@Override
	public void Operation() {
		System.out.println("��չ����(Refined Abstraction)��ɫ������" );
		imple.OperationImpl();
	}

}
