package animalFarm;

public class HorseFarm implements AnimalFarm {

	@Override
	public Animal newAnimal() {
		System.out.println("���������");
		return new Horse();
	}

}
