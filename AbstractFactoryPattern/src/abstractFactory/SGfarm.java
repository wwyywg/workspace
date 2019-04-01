package abstractFactory;

public class SGfarm implements Farm {

	@Override
	public Animal newAnimal() {
		System.out.println("��ţ������");
		return new Cattle();
	}

	@Override
	public Plant newPlant() {
		System.out.println("�߲˳��ɣ�");
		return new Vegetables();
	}

}
