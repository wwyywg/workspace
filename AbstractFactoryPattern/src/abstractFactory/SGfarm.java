package abstractFactory;

public class SGfarm implements Farm {

	@Override
	public Animal newAnimal() {
		System.out.println("新牛出生！");
		return new Cattle();
	}

	@Override
	public Plant newPlant() {
		System.out.println("蔬菜长成！");
		return new Vegetables();
	}

}
