package demo1;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		// TODO Auto-generated constructor stub
		super(component);
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
		addFunction();
	}
	
	public void addFunction() {
		System.out.println("为具体构件角色增加额外的功能addedFunction()");
	}
}
