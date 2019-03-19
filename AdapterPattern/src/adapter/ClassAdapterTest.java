package adapter;

import classAdapter.ClassAdapter;
import classAdapter.Target;

public class ClassAdapterTest {

	public static void main(String[] args) {
		System.out.println("ÀàÊÊÅäÆ÷Ä£Ê½²âÊÔ£º");
		Target target = new ClassAdapter();
		target.request();
	}

}
