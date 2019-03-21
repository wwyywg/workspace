package morriganAensland;

public class Changer implements Morrigan {
	
	Morrigan m;
	public Changer(Morrigan m) {
		this.m = m;
	}

	@Override
	public void display() {
		m.display();
	}

}
