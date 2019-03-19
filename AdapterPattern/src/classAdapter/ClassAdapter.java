package classAdapter;

import common.Adaptee;
import common.Target;

public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void request() {
		specificRequest();
	}

}
