//04-11-15
//This program is a JFrame Calculator
//This is code created by MoonCheese62 or on github moonc
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
public class Calc extends JFrame{
	public static void main(String[] acalc){
		Calc cal = new Calc();
	}
	public Calc(){
		super("MoonCheese62's Calculator");
		setSize(350,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(10,50);
		setResizable(false);
		Clanel z = new Clanel();
		setContentPane(z);
		setVisible(true);
		}
	}
	class Clanel extends JPanel{
		Bon bons;
		public Clanel(){
			setLayout(new BorderLayout());
			bons = new Bon();
			add(bons,BorderLayout.CENTER);
		}
		
	}

	
	class Bon extends JPanel{
			Funk fun = new Funk();
			Numbers nus = new Numbers();
			Disp dis = new Disp();
		public Bon(){
			setLayout(new BorderLayout());
			add(dis,BorderLayout.NORTH);
			add(fun,BorderLayout.EAST);
			add(nus,BorderLayout.CENTER);
		}

		
	
	class Funk extends JPanel implements ActionListener{
		String numb=" ";
		private JButton plus;
		private JButton minus;
		private JButton multiply;
		private JButton divide;
		private JButton square;
		private JButton r;
		String number1;
		int number2;
				Numbers calcnumberswitch = new Numbers();

		public Funk(){
			setLayout(new GridLayout(5,1));
			JButton plus = new JButton("+");
			plus.addActionListener(this);
			JButton minus = new JButton("-");
			minus.addActionListener(this);
			JButton divide = new JButton("/");
			divide.addActionListener(this);
			JButton square = new JButton("Square");
			square.addActionListener(this);
			JButton r = new JButton("Root");
			r.addActionListener(this);
			add(plus);
			add(minus);
			add(divide);
			add(square);
			add(r);
		}
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand().equals("+")){
					numb = "+";
					System.out.println("Hi");
				number1 = calcnumberswitch.number;
				System.out.println(number1);
			}

		}
		
	}
	class Numbers extends JPanel implements ActionListener{
		private JButton plus;
		private JButton minus;
		private JButton multiply;
		private JButton divide;
		private JButton square;
		private JButton r;
		private JLabel t;
		private String numprev = " ";
		private String number=" ";
		private String number2=" ";
		public Numbers(){
			setLayout(new GridLayout(4,3));
			JButton plus = new JButton("0");
			plus.addActionListener(this);
			JButton minus = new JButton("1");
			minus.addActionListener(this);
			JButton divide = new JButton("2");
			divide.addActionListener(this);
			JButton square = new JButton("3");
			square.addActionListener(this);
			JButton r = new JButton("4");
			r.addActionListener(this);
			JButton fiv = new JButton("5");
			fiv.addActionListener(this);
			JButton si = new JButton("6");
			si.addActionListener(this);
			JButton se = new JButton("7");
			se.addActionListener(this);
			JButton ei = new JButton("8");
			ei.addActionListener(this);
			JButton ni = new JButton("9");
			ni.addActionListener(this);
			JButton clear = new JButton("Clear");
			clear.addActionListener(this);
			JButton del = new JButton("Delete");
			del.addActionListener(this);
			add(plus);
			add(minus);
			add(divide);
			add(square);
			add(r);	
			add(fiv);	
			add(si);	
			add(se);	
			add(ei);	
			add(ni);
			add(clear);	
			add(del);
	
		}
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand().equals("0")){
				number=number + "0";
				numprev="0";
			}
			if(e.getActionCommand().equals("Clear")){
				number="";
				fun.numb =" ";
			}
			if(e.getActionCommand().equals("1")){
				number=number+"1";
				numprev="1";
			}
			if(e.getActionCommand().equals("2")){
				number=number+"2";
				numprev="2";
			}
			if(e.getActionCommand().equals("3")){
				number=number+"3";
				numprev="3";
			}
			if(e.getActionCommand().equals("4")){
				number=number+"4";
				numprev="4";
			}
			if(e.getActionCommand().equals("5")){
				number=number+"5";
				numprev="5";
			}
			if(e.getActionCommand().equals("6")){
				number=number+"6";
				numprev="6";
			}
			if(e.getActionCommand().equals("7")){
				number=number+"7";
				numprev="7";
			}
			if(e.getActionCommand().equals("8")){
				number=number+"8";
				numprev="8";
			}
			if(e.getActionCommand().equals("9")){
				number=number+"9";	
				numprev="9";
						}
			if(e.getActionCommand().equals("Delete")){
				number= number.substring(0, number.length() - 1);
			
			}
			System.out.println(number);	
			dis.Caller();
		}
	}
	class Disp extends JPanel implements ActionListener{
		private JLabel t;
		public Disp(){
			t = new JLabel("Answer");
			add(t);
		}
		public void Caller(){
			String nop = fun.numb;
			String numb=nus.number + nop;
			t.setText(numb);
		}
		public void actionPerformed(ActionEvent e){
		
		}
		
	}
}
