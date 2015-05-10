import javax.swing.*;//import swing 
import java.awt.event.*;//import awt.event.*
import java.awt.*;//import awt.event.*
public class Start extends JPanel implements ActionListener{ //class Starter which hold the title and start button with information
	static Physio s;
	  int width = 0;
  int height = 0;
	public Start(){//constructor method
		
		setLayout(null);
		JButton starter = new JButton("Start");//JButton to Start
		starter.setBounds(597,385,400,100);
		starter.addActionListener(this);
		JLabel l = new JLabel("                            Body Systems And Organs!");//JLabel for the title
		 Font f= new	Font("Utopia", Font.BOLD, 50);//create a font for the title ( so that the title pops out and is larger)
		l.setFont(f);//set the font for the JLabel
		add(starter);//add the JButton
		add(l,BorderLayout.CENTER);//add the JLabel

	}
	public void actionPerformed(ActionEvent e){
				width = getWidth();
		height= getHeight();
				System.out.println("Width = " + width);
		System.out.println("Height = " + height);
		s.c.next(s);

		}
		
		public static void getPhysio(Physio p){
			s = p;
			}
}
