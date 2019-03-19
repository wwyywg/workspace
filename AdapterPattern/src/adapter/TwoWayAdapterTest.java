package adapter;

import common.TwoWayAdaptee;
import common.TwoWayTarget;
import twoWayAdapter.AdapteeRealize;
import twoWayAdapter.TargetRealize;
import twoWayAdapter.TwoWayAdpater;

public class TwoWayAdapterTest {

	public static void main(String[] args) {
		System.out.println("目标通过双向适配器访问适配者：");
		TwoWayAdaptee adaptee = new AdapteeRealize();
		TwoWayTarget target = new TwoWayAdpater(adaptee);
		target.request();
		
		System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target = new TargetRealize();
        adaptee = new TwoWayAdpater(target);
        adaptee.specificRequest();
	}

}
