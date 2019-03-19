package motorAdapter;

import common.Motor;

public class ElectricAdapter implements Motor {

	private ElectricMotor electricMotor;
	
	public ElectricAdapter() {
		electricMotor = new ElectricMotor();
	}
	
	@Override
	public void drive() {
		electricMotor.electricDrive();
	}

}
