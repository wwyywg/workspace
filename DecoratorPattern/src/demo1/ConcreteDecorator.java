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
		System.out.println("Ϊ���幹����ɫ���Ӷ���Ĺ���addedFunction()");
	}
}
