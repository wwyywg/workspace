package twoWayAdapter;

import common.TwoWayAdaptee;

public class AdapteeRealize implements TwoWayAdaptee {

	@Override
	public void specificRequest() {
		System.out.println("�����ߴ��뱻���ã�");
	}

}
