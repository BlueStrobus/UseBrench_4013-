package Onee;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class JFrame4Demo extends JFrame {
	JFrame4Demo() {
		setTitle("안녕, 스윙!");
		JPanel p =  new JPanel();

		JLabel l = new JLabel ("안녕, 스윙!");
		JButton b = new JButton("버튼");
		
		add(l);
		add(b);
		
		add(b);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrame4Demo();
	}

}
