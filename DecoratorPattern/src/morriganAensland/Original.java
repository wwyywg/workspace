package morriganAensland;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Original extends JFrame implements Morrigan {

	private static final long serialVersionUID = 1L;
	private String t="Morrigan0.jpg";
	
	public Original() {
		super("《恶魔战士》中的莫莉卡·安斯兰");
	}
	
	public void setImage(String t) {
		// TODO Auto-generated method stub
		this.t = t;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		this.setLayout(new FlowLayout());
		JLabel jLabel = new JLabel(new ImageIcon("src/morriganAensland/" + t));
		this.add(jLabel);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
