package animalFarm;

public class CattleFarm implements AnimalFarm {

	@Override
	public Animal newAnimal() {
		System.out.println("��ţ������");
		return new Cattle();
	}

}
