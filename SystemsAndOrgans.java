///4-20-15
//This game is a education game that teaches people about their body . Specifically about the body systems
//import awt.*
import javax.swing.*;//import swing 
import java.awt.event.*;//import awt.event.*
import java.awt.*;//import awt.event.*

public class SystemsAndOrgans extends JFrame{//extends JFrame
	public static void main(String[] allen){//main header
		 SystemsAndOrgans sys = new SystemsAndOrgans();//constructor for SystemsAndOrgans()
	}
	public SystemsAndOrgans(){//constructor  for JFrame
		super("Body Systems And Organs!");//Set the title of the window using super
		setSize(1600,800);//set the size of the initial window(the start screen)
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//allow closing by clicking on the 'X' button
		Physio phy = new Physio(this);//create Physio class instance(the panel which contains all of the cards)
		Start.getPhysio(phy);
		Systems.getPhysio(phy);
		setContentPane(phy);//set the content pane
		setResizable(true);//alow resizing
		setVisible(true);//make the frame display
	}
}

class Physio extends JPanel{//class Physio which contains all of the cards
	public CardLayout c = new CardLayout();//create a card layout
	Start start;//start screen
	Systems syste;//system selection screen
	OriginalImage os;//organ selection screen
	Lung lun;//organ screens
	Quiz qui;//quiz screen
	SystemsAndOrgans d;
	//card variables ( so a name for a specific card)
	public Physio(SystemsAndOrgans o){//constructor method which adds/creates thecards
		setLayout(c);	//set the card layout
		d = o;
		start = new Start();//make the constructor for start
		syste = new Systems();//make the constructor for systems
		os = new OriginalImage();//make the constructor for  organ selection
		lun = new Lung();//make the constructor for  organs
		qui = new Quiz();//make the constructor for quiz
		add(start,"Start");	
		add(syste,"System");	
		add(os,"OrganSel1");	
		add(lun,"Lung");	
		add(qui,"Quiz");	
		
			//add start
			//add systems
			//add organ selection
			//add organs
			//add quiz
			}
		}



class EsoImage extends JPanel implements ActionListener{
	
	public  EsoImage(){
		
	}
	public void actionPerformed(ActionEvent e ){
		
	}
	
}
	
	

class Larynx extends JPanel implements ActionListener{
	public Larynx(){//Contains JComponenets ( JLABEL and JButton)for information about the Larynx ( button is to go back)
		System.out.println("Larynx");
	}
	public void actionPerformed(ActionEvent e){
		
	}
}

class Lung extends JPanel implements ActionListener{ 
	//get Lung image
	public Lung(){//constructor method
		//Display image of the lungs
		//Make a JLabel about the lungs
		//add the JLabel
	}
	public void actionPerformed(ActionEvent e){
		//if back button is clicked , go back to the last page were the system is displayed
		
		}
}			
