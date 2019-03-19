package adapter;

import common.TwoWayAdaptee;
import common.TwoWayTarget;
import twoWayAdapter.AdapteeRealize;
import twoWayAdapter.TargetRealize;
import twoWayAdapter.TwoWayAdpater;

public class TwoWayAdapterTest {

	public static void main(String[] args) {
		System.out.println("Ŀ��ͨ��˫�����������������ߣ�");
		TwoWayAdaptee adaptee = new AdapteeRealize();
		TwoWayTarget target = new TwoWayAdpater(adaptee);
		target.request();
		
		System.out.println("-------------------");
        System.out.println("������ͨ��˫������������Ŀ�꣺");
        target = new TargetRealize();
        adaptee = new TwoWayAdpater(target);
        adaptee.specificRequest();
	}

}
