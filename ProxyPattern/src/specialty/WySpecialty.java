package specialty;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WySpecialty extends JFrame implements Specialty {
	
	private static final long serialVersionUID = 1L;
	
	public WySpecialty() {
		super("�عش�����Դ�ز�����");
		this.setLayout(new GridLayout(1, 1));
		JLabel l1 = new JLabel(new ImageIcon("src/proxy/WuyuanSpecialty.jpg"));
		this.add(l1);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void display() {
		this.setVisible(true);
	}

}
