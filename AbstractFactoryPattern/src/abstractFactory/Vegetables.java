package abstractFactory;

import java.awt.*;

import javax.swing.*;

public class Vegetables implements Plant {
	
	JScrollPane sp;
    JFrame jf=new JFrame("���󹤳�ģʽ����");
    public Vegetables()
    {
        Container contentPane=jf.getContentPane();
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,1));
        p1.setBorder(BorderFactory.createTitledBorder("ֲ��߲�"));
        sp=new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1=new JLabel(new ImageIcon("src/P_Vegetables.jpg"));
        p1.add(l1);       
        jf.pack();       
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�û�������ڹر� 
    }

	@Override
	public void show() {
		// TODO Auto-generated method stub
		jf.setVisible(true);
	}

}
