package morriganAensland;

public class Succubus extends Changer {

	public Succubus(Morrigan m) {
		super(m);
	}
	
	@Override
	public void display() {
		setChanger();
		super.display();
	}
	
	public void setChanger() {
		((Original)(super.m)).setImage("Morrigan1.jpg");
	}
}
