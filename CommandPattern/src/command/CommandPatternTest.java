package command;

import demo1.Command;
import demo1.ConcreteCommand;
import demo1.Invoker;

public class CommandPatternTest {

	public static void main(String[] args) {
		Command cmd = new ConcreteCommand();
		Invoker ir = new Invoker(cmd);
		System.out.println("客户访问调用者的call()方法...");
        ir.call();

	}

}
