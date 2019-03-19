package objectAdapter;

import common.Adaptee;
import common.Target;

public class ObjectAdapter implements Target {
	private Adaptee adaptee;
	
	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
