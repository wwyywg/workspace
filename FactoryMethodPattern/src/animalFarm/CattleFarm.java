package animalFarm;

public class CattleFarm implements AnimalFarm {

	@Override
	public Animal newAnimal() {
		System.out.println("ĞÂÅ£³öÉú£¡");
		return new Cattle();
	}

}
