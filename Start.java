package progs; //note this line is only for my computer
//package for all external files that may exist in the future
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings({ "serial", "unused" })
public class Start extends JFrame{
	public static void main(String[] author_allen){
		Start t = new Start();
		
	}
	public Start(){
		super("Allen's Programs!");
		//Image x = Toolkit.getDefaultToolkit().getImage("ic1.png");
		//this.setIconImage(Toolkit.getDefaultToolkit().getImage("ic1.png"));
		setSize(300,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(10,50);
		setResizable(false);
		THolder z = new THolder();
		StarterPan.getS(z);
		TimPlanel.getS(z);
		Tlanel.getS(z);
		setContentPane(z);
		setVisible(true);
	}

}
@SuppressWarnings("serial")
class THolder extends JPanel{
	public CardLayout c = new CardLayout();
	StarterPan p;
	TimPlanel ti;
	Tlanel tc;
	public THolder(){
		setLayout(c);
		p = new StarterPan();
		ti=new TimPlanel();
		add(p,"Start");
		add(ti,"Timer");
		tc = new Tlanel();
		add(tc,"Colorer");
	}
	
}
@SuppressWarnings("serial")
class StarterPan extends JPanel implements ActionListener{
	static THolder s;
	JButton timerss;
	JButton colpr;
	public StarterPan(){
		setLayout(new GridLayout(3,1));
		timerss =new JButton("Timer");
		timerss.addActionListener(this);
		colpr = new JButton("Color Selector!");
		colpr.addActionListener(this);
		add(timerss);
		add(colpr);
	}
	public static void getS(THolder p) {
		s=p;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == timerss){
			s.c.show(s,"Timer");
		}
		if(e.getSource()==colpr){
			s.c.show(s,"Colorer");
			
		}
		
	}
	
	
}
@SuppressWarnings("serial")
class TimPlanel extends JPanel implements ActionListener{
	static Timer timer = new Timer(1000,new myActionListener());
	static THolder s;
	JButton Timestop;
	JButton Timestart;
	JButton gb;
	//JButton res;
	static boolean rest=false;
	static JLabel Disptim;
	static boolean stater=false;
	public TimPlanel(){
		setLayout(new GridLayout(4,1));
		Disptim = new JLabel("	Time: 0:0:00");
		Font f = new Font("Sans",Font.PLAIN, 40);
		Disptim.setFont(f);
		timer.start();
	    Timestart = new JButton("Start");
	    Timestop = new JButton("Stop");
	   // res = new JButton("Reset");
	    gb = new JButton("Back");
	    add(Disptim);
	    Timestart.addActionListener(this);
	    Timestop.addActionListener(this);
	    //res.addActionListener(this);
	    gb.addActionListener(this);
	    add(Timestart);
	    add(Timestop);
	    //add(res);
	    add(gb);

	}
	
	public static void getS(THolder z) {
		// TODO Auto-generated method stub
		s=z;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Timestop){
			stater=true;
			
			
		}
		if(e.getSource()==Timestart){
			stater=false;
			timer.start();
		}
		if(e.getSource()==gb){
			s.c.show(s,"Start");
		}
	}
     


}
class myActionListener implements ActionListener{
	public static int count = 0;
	public static int minut =0;
	public static int hr=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(TimPlanel.stater){
			
			TimPlanel.timer.stop();
			count--;
		}
		if(count<=1000&&count>=0){
			count++;
				
			if(count>=10){
				TimPlanel.Disptim.setText("Time: "+hr+":"+minut+":"+count);
			}
			else{
				TimPlanel.Disptim.setText("Time: "+hr+":"+minut+":"+"0"+count);
				
			}
				
		}
		if(count>59){
			minut++;
			count=0;
			TimPlanel.Disptim.setText("Time: "+hr+":"+minut+":"+count);
		}
		if(minut>59){
			hr++;
			minut=0;
			count=0;
			TimPlanel.Disptim.setText("Time: "+hr+":"+minut+":"+count);
			
		}
		
	}
	
	
}
@SuppressWarnings("serial")
class Tlanel extends JPanel implements  ChangeListener,ActionListener{
	//private int slide=1;
	private int s2 = 1;
	private int s3 = 1;
	private int s4 = 1;
	//private int x=0;
	//private int y=0;
	//private int prev1=0;
	//int prev2=0;
	//int prev3=0;
	//int prev4=0;
	//private JSlider s;
	private JSlider l;
	private JSlider h;
	private JSlider i;
	JLabel dispred;
	JLabel dispblu;
	JLabel dispgre;
	JButton backer;
	String u ="Red: 1";
	String d="Blue: 1";
	String t="Green: 1";
	static THolder toy;
	public Tlanel(){
		setLayout(null);
		Font sesr = new Font("Sans",Font.BOLD,20);
	//	s = new JSlider(JSlider.HORIZONTAL,slide,255,1);
		l = new JSlider(JSlider.HORIZONTAL,s2,255,1);
		i = new JSlider(JSlider.HORIZONTAL,s3,255,1);
		h = new JSlider(JSlider.HORIZONTAL,s4,255,1);
		backer=new JButton("Back");
		//s.addChangeListener(this);
		l.addChangeListener(this);
		i.addChangeListener(this);
		h.addChangeListener(this);
		backer.addActionListener(this);
		dispred = new JLabel(u);
		dispblu = new JLabel(d);
		dispgre = new JLabel(t);
	//	add(s);
		l.setBounds(0,10,300,40);
		i.setBounds(0,50,300,40);
		h.setBounds(0,90,300,40);
		backer.setBounds(200,325,100,50);
		dispred.setBounds(100,130,300,50);
		dispblu.setBounds(100,190,300,50);
		dispgre.setBounds(100,250,300,50);
		dispblu.setFont(sesr);
		dispred.setFont(sesr);
		dispgre.setFont(sesr);
		add(l);
		add(i);
		add(h);
		add(backer);
		add(dispred);
		add(dispblu);
		add(dispgre);
	}
	public static void getS(THolder z) {
		toy=z;
		
	}
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//int aalpha = slide;
		int rred = s2;
		int bblue = s3;
		int ggreen = s4;
		Color fade = new Color(rred,bblue,ggreen);//, aalpha);
		setBackground(fade);
		//System.out.println("-------------------------------------------");
		//System.out.println("Red: "+rred);
		//System.out.println("Blue: "+bblue);
		//System.out.println("Green: "+ggreen);
		//System.out.println("-------------------------------------------");
		//prevpos();
		u="Red: "+rred;
		d="Blue: "+bblue;
		t="Green: "+ggreen;
		if(rred==1)
			dispred.setForeground(Color.WHITE);
		if(bblue==1)
			dispgre.setForeground(Color.WHITE);
		if(ggreen==1)
			dispblu.setForeground(Color.WHITE);
		if(rred>=200)
			dispred.setForeground(Color.BLACK);
		if(bblue>=200)
			dispblu.setForeground(Color.BLACK);
		if(ggreen>=200)
			dispgre.setForeground(Color.BLACK);
		
	}
	public  void stateChanged(ChangeEvent e){
		
		s2=l.getValue();
		s3=i.getValue();
		s4=h.getValue();
		//slide=s.getValue();
		
		
		repaint();
		dispblu.setText(d);
		dispred.setText(u);
		dispgre.setText(t);
	}
	//public void prevpos(){
		//prev1=slide;
		//prev2=s2;
		//prev3=s3;
		//prev4=s4;
	//}
	@Override
	public void actionPerformed(ActionEvent e) {
		toy.c.show(toy,"Start");
		
	}
}
