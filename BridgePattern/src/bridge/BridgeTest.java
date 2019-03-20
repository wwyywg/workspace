package bridge;

import demo1.Abstraction;
import demo1.ConcreteImplementorA;
import demo1.Implementor;
import demo1.RefinedAbstraction;

public class BridgeTest {

	public static void main(String[] args) {
		Implementor imple = new ConcreteImplementorA();
		Abstraction abs = new RefinedAbstraction(imple);
		abs.Operation();
	}

}
