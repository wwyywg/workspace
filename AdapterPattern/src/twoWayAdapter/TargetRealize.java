package twoWayAdapter;

import common.TwoWayTarget;

public class TargetRealize implements TwoWayTarget {

	@Override
	public void request() {
		System.out.println("Ŀ����뱻���ã�");
	}

}
