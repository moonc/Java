import javax.swing.*;//import swing 
import java.awt.event.*;//import awt.event.*
import java.awt.*;//import awt.event.*
public class  Systems extends JPanel implements ActionListener{//class SystemSelec which displays systems/and is used to pick
	static Physio s;
	//get the image for digestive
	//get the image for circultory
	//get the image for muscular
	//get the image for  urinary
	//get the image for  respiratory
	//get the image for  lymphatic
	//get the image for  endocrine
	JLabel tl;
	Image u = Toolkit.getDefaultToolkit().getImage("digestive.jpg");
	Image u2 = Toolkit.getDefaultToolkit().getImage("endocrine system.png");
	Image u3 = Toolkit.getDefaultToolkit().getImage("humanheart.gif");
	Image u4 = Toolkit.getDefaultToolkit().getImage("immune.gif");
	Image u5 = Toolkit.getDefaultToolkit().getImage("muscle.jpg");
	Image u6 = Toolkit.getDefaultToolkit().getImage("urin.jpg");
	Image u7 = Toolkit.getDefaultToolkit().getImage("respira.png");
	ImageIcon i = new ImageIcon(u);
	ImageIcon i2 = new ImageIcon(u2);
	ImageIcon i3 = new ImageIcon(u3);
	ImageIcon i4 = new ImageIcon(u4);
	ImageIcon i5 = new ImageIcon(u5);
	ImageIcon i6 = new ImageIcon(u6);
	ImageIcon i7 = new ImageIcon(u7);
	public Systems(){//constructor method
		setLayout(new GridLayout(3,3));
		JButton dig = new JButton("Digestive",i);//JButton for the Digestive
		JButton circ = new JButton("Circulatory",i3);//JButton for the Circulatory
		JButton musc = new JButton("Muscular",i5);//JButton for the Musclar
		JButton urin = new JButton("Urinary",i6);//JButton for the Urinary
		JButton resp = new JButton(i7);//JButton for the Respiratory
		JButton lymph = new JButton("Lymphatic",i4);//JButton for the  Lymphatic
		JButton endo = new JButton("Endocrine",i2);//JButton for the  Endocrine
		dig.addActionListener(this);
		circ.addActionListener(this);
		musc.addActionListener(this);
		urin.addActionListener(this);
		resp.addActionListener(this);
		lymph.addActionListener(this);
		endo.addActionListener(this);
		add(dig);
		add(circ);
		add(musc);
		add(urin);
		add(resp);
		add(lymph);
		add(endo);
		}
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand().equals("Digestive")){
			s.c.show(s,"OrganSel1");
			s.d.repaint();
			}
		
		}
		public static void getPhysio(Physio p){
			s = p;
			}
	}
