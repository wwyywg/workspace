package demo1;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public Product newProduct() {
		System.out.println("���幤��1����-->�����Ʒ1...");
		return new ConcreteProduct1();
	}

}
