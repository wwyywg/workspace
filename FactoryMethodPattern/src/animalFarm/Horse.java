package animalFarm;

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
	JFrame jf = new JFrame("��������ģʽ����");
	
	public Horse() {
		Container contentPane = jf.getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1));
		p1.setBorder(BorderFactory.createTitledBorder("�����"));
		sp = new JScrollPane(p1);
		contentPane.add(sp,BorderLayout.CENTER);
		JLabel l1=new JLabel(new ImageIcon("src/animalFarm/A_Horse.jpg"));
        p1.add(l1);       
        jf.pack();       
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //�û�������ڹر�
	}

	@Override
	public void show() {
		jf.setVisible(true);

	}

}
