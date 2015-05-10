import javax.swing.*;//import swing 
import java.awt.event.*;//import awt.event.*
import java.awt.*;//import awt.event.*
public class OriginalImage extends JPanel implements ActionListener{
	Image digestiveimage = Toolkit.getDefaultToolkit().getImage("hds.jpg");
	JButton esop;	
  ActionEvent e;
  int width = 0;
  int height = 0;
	boolean EsoClicked = false;
	boolean E= false;
	JLabel infod;
	String thing="General";
		public OriginalImage(){	
			setLayout(null);
			esop = new JButton("Esophagus");
				esop.addActionListener(this);
				esop.setBounds(1494,0,100,200);
				add(esop);
		/*
			else{
				thing="General";
			}
			* */
				infod = new JLabel(thing);
				//t();
			}
	public void paintComponent(Graphics g){
			g.drawImage(digestiveimage,700,10,this);
			
	}
	public void actionPerformed(ActionEvent e){
		width = getWidth();
		height= getHeight();
		System.out.println("Width = " + width);
		System.out.println("Height = " + height);
		if(e.getSource()==esop) {
			System.out.println("yes");
			thing="Esophagus";
			infod.setText(thing);
		}
		
		else{
			thing="Digestive System";
			infod.setText(thing);
		}
		adders();
	}
	public void adders(){
				add(infod,BorderLayout.SOUTH);
				Font yips= new	Font("Utopia", Font.BOLD, 30);
				infod.setFont(yips);
	}

}
