package demo1;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public Product newProduct() {
		System.out.println("���幤��2����-->�����Ʒ2...");
		return new ConcreteProduct2();
	}

}
