package factoryMethod;

import demo1.AbstractFactory;
import demo1.Product;
import demo1.ReadXML1;

public class FactoryMethodTest {

	public static void main(String[] args) {
		try {
			Product a;
			AbstractFactory af;
			af = (AbstractFactory)ReadXML1.getObject();
			a = af.newProduct();
			a.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
