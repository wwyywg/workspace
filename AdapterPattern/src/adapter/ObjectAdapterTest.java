package adapter;

import common.Adaptee;
import common.Target;
import objectAdapter.ObjectAdapter;

public class ObjectAdapterTest {

	public static void main(String[] args) {
		System.out.println("对象适配器模式测试===：");
		Adaptee adaptee = new Adaptee();
		Target target = new ObjectAdapter(adaptee);
		target.request();
	}

}
