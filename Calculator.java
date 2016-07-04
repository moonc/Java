import java.util.Scanner;
public class Calculator{
	private static double input = 0;
	private static double input2 = 0;
	private static double output = 0;
	private static String choose = " ";
	public static void main(String[] allen){
		System.out.println("Would you like to add , subtract , multiply or divide?");
			Scanner in = new Scanner(System.in);
			choose=in.next();
			if((choose.equals("add") || choose.equals("addition"))==true){
				prompt1();
				input=in.nextDouble();
				prompt();
				input2=in.nextDouble();
				output=input+input2;
				printer();
			}
			
	}
	public static void prompt(){
	System.out.println("What is the second number you would like to add?");
	}
	public static void prompt1(){
	System.out.println("What is the first number you would like to add?");
		
	}
	
	
	
	
	public static void printer(){
		System.out.println(output);
		
		
	}
	
}
