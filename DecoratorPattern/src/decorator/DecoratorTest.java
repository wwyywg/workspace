package decorator;

import demo1.Component;
import demo1.ConcreteComponent;
import demo1.ConcreteDecorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component p = new ConcreteComponent();
		p.operation();
		System.out.println("---------------------------------");
		Component d = new ConcreteDecorator(p);
		d.operation();
	}

}
