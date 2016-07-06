//4/1/15
//This program will display an image then the user wil get to use the slider to zoom in/out the image.
///Then they will get to use the checkbox to build the new image which will only show the zoomed image
/* --- TESTING PLAN ------------------------------------------------------------------------------
 * 1) Zoom  in on image by using the slider
 * 2) Click Checkbox to build image
 * A) See if building the image before zooming in will work
 * -----------------------------------------------------------------------------------------------------------
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Zoom extends JFrame {
	public static void main(String[] allen){
		Zoom f = new Zoom();
	}

	public Zoom(){//makes the JFrame
		super("ZOOM!");
		setSize(1200,1200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(10,50);
		setResizable(true);//allows the panel to be resized
		Granel z = new Granel();
		setContentPane(z);
		setVisible(true);
		}
	}
		class Granel extends JPanel {
			ZoomImage uno;
			ImageDisplay dos;
			public Granel(){
			setLayout(new GridLayout(1,2));
			uno = new ZoomImage();
			dos = new ImageDisplay();
			add(uno);
			add(dos);

}

	class ZoomImage extends JPanel implements ActionListener , ChangeListener{
			private JSlider s;//Slider s
			private JSlider x;//Slider x
			private JSlider y;//Slider y
			private JSlider j;//Slider j
			private JButton c;
			 int slide;
			 int yslide;
			 int x2slide;
			int y2slide;
		 Image i = Toolkit.getDefaultToolkit().getImage("cheetah.jpg");///gets the image of the animal
			ZoomImage(){
				s = new JSlider(JSlider.HORIZONTAL,0,940,0);// creates a new slider which can be used to zoom in or out the image
				x= new JSlider(JSlider.HORIZONTAL,0,650,0);// creates a new slider which can be used to zoom in or out the image
				y= new JSlider(JSlider.HORIZONTAL,0,650,0);// creates a new slider which can be used to zoom in or out the image
				j= new JSlider(JSlider.HORIZONTAL,0,470,0);// creates a new slider which can be used to zoom in or out the image
				add(s);//adds the slider to panel
				s.addChangeListener(this);
				x.addChangeListener(this);
				j.addChangeListener(this);
				y.addChangeListener(this);
				add(x);//adds the slider to panel
				add(y);//adds the slider to panel
				add(j);//adds the slider to panel
			}
		public void stateChanged(ChangeEvent e){
			slide=s.getValue();
			yslide=x.getValue();
			x2slide=y.getValue();
			y2slide=j.getValue();
		//	ImageDisplay imageconstruct = new ImageDisplay();
			dos.repaint();
		}///stateCHanged to zoom in when 
		public void actionPerformed(ActionEvent e){//constructs the image after being zoomed in
		
		}
	public void paintComponent(Graphics g){

		g.drawImage(i,10,10,this);//draws the image
	}
		
	}
	class ImageDisplay extends JPanel{ //displays the builded image
	private Image zoomedimage;

	public void paintComponent(Graphics g){
	//	ZoomImage zoomed = new ZoomImage();
		 zoomedimage=uno.i; 
		int  x=uno.slide;
		 int y=uno.yslide;
		int  x2=uno.x2slide;
		int  y2=uno.y2slide;
		g.drawImage(zoomedimage,0,0,900,650,x2,y2,x,y,this);
		
	}
		public ImageDisplay(){
		repaint();
	}
}

}
