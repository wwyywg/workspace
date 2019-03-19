package twoWayAdapter;

import common.TwoWayAdaptee;
import common.TwoWayTarget;

public class TwoWayAdpater implements TwoWayAdaptee, TwoWayTarget {
	
	private TwoWayTarget target;
	private TwoWayAdaptee adaptee;
	
	public TwoWayAdpater(TwoWayTarget target) {
		this.target = target;
	}
	
	public TwoWayAdpater(TwoWayAdaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}

	@Override
	public void specificRequest() {
		target.request();
	}

}
