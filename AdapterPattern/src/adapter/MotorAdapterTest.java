package adapter;

import common.Motor;
import motorAdapter.ReadXML;

public class MotorAdapterTest {

	public static void main(String[] args) {
		System.out.println("������ģʽ���ԣ�");
		Motor motor = (Motor)ReadXML.getObject();
		motor.drive();
	}

}
