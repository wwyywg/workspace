package abstractFactory;

public class SRfarm implements Farm {

	@Override
	public Animal newAnimal() {
		System.out.println("���������");
        return new Horse();
	}

	@Override
	public Plant newPlant() {
		System.out.println("ˮ�����ɣ�");
        return new Fruitage();
	}

}
