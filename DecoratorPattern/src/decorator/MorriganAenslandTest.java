package decorator;

import morriganAensland.Girl;
import morriganAensland.Morrigan;
import morriganAensland.Original;
import morriganAensland.Succubus;

public class MorriganAenslandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morrigan m0 = new Original();
		m0.display();
		Morrigan m1 = new Succubus(m0);
		m1.display();
		Morrigan m2 = new Girl(m0);
		m2.display();
	}

}
