package abstractFactory;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Horse implements Animal {
	
	JScrollPane sp;
	JFrame jf = new JFrame("抽象工厂模式测试");
	
	public Horse() {
		Container contentPane = jf.getContentPane();
		JPanel pl = new JPanel();
		pl.setLayout(new GridLayout(1, 1));
		pl.setBorder(BorderFactory.createTitledBorder("动物：马"));
		sp = new JScrollPane(pl);
		contentPane.add(sp, BorderLayout.CENTER);
		JLabel l1 = new JLabel(new ImageIcon("src/A_Horse.jpg"));
		pl.add(l1);
		jf.pack();
		jf.setVisible(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		jf.setVisible(true);
	}

}
