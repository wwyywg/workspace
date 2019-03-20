package demo1;

public class RefinedAbstraction extends Abstraction {
	
	public RefinedAbstraction(Implementor imple) {
		super(imple);
	}

	@Override
	public void Operation() {
		System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
		imple.OperationImpl();
	}

}
