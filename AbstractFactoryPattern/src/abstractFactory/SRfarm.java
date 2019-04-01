package abstractFactory;

public class SRfarm implements Farm {

	@Override
	public Animal newAnimal() {
		System.out.println("新马出生！");
        return new Horse();
	}

	@Override
	public Plant newPlant() {
		System.out.println("水果长成！");
        return new Fruitage();
	}

}
