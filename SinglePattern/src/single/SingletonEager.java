package single;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SingletonEager {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("����ģʽ");
		jFrame.setLayout(new GridLayout(1, 2));
		Container contentPane=jFrame.getContentPane();
        Bajie obj1=Bajie.getInstance();
        contentPane.add(obj1);    
        Bajie obj2=Bajie.getInstance(); 
        contentPane.add(obj2);
        if(obj1==obj2)
        {
            System.out.println("������ͬһ�ˣ�");
        }
        else
        {
            System.out.println("���ǲ���ͬһ�ˣ�");
        }   
        jFrame.pack();       
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Bajie extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Bajie instance = new Bajie();
	private Bajie() {
		JLabel jLabel = new JLabel(new ImageIcon("src/single/Bajie.jpg"));
		this.add(jLabel);
	}
	
	public static Bajie getInstance() {
		return instance;
	}
}
