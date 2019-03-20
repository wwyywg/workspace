package bridge;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import bagDemo.Bag;
import bagDemo.Color;
import bagDemo.ReadXML;

public class BagManage {

	public static void main(String[] args) {
		Color color;
		Bag bag;
		color = (Color)ReadXML.getObject("color");
		bag = (Bag)ReadXML.getObject("bag");
		bag.setColor(color);
		String name = bag.getName();
		show(name);
	}
	
	public static void show(String name) {
		JFrame jFrame = new JFrame("桥接模式测试");
		Container contentPane = jFrame.getContentPane();
		JPanel jPanel = new JPanel();
		JLabel jLabel = new JLabel(new ImageIcon("src/bagDemo/"+ name + ".jpg"));
		jPanel.setLayout(new GridLayout(1,1));
		jPanel.setBorder(BorderFactory.createTitledBorder("女士皮包"));
		jPanel.add(jLabel);
		contentPane.add(jPanel,BorderLayout.CENTER);
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
