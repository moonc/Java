//Allen K//

class BreakDownTime {
	static double questionTime=39865.674;
	static int years = 0;
	static int months = 0;
	static int weeks = 0;
	static int days = 0;
	static int hours = 0;
	static int minutes = 0;
	static int seconds = 0;
	
	public static void main (String []args){
		years=numberYears();
		System.out.println(years+"years");
		months=numberMonths();
		System.out.println(months+"months");
		weeks=numberWeeks();
		System.out.println(weeks+"weeks");
		days=numberDays();
		System.out.println(days+"days");
		hours=numberHours();
		System.out.println(hours+"hours");
		minutes=numberMinutes();
		System.out.println(minutes+"minutes");
	}
	public static int numberYears(){
		int answer=(int)(questionTime)/365;
		calRemTime(answer*365);
		return answer;
	}
	
	public static int numberMonths(){
		int answer=(int)(questionTime)/28;
		calRemTime(answer*28);
		return answer;
	}
	
	public static int numberWeeks(){
		int answer=(int)(questionTime)/7;
		calRemTime(answer*7);
		return answer;
	}
	
	public static int numberDays(){
		int answer=(int)(questionTime);
		calRemTime(answer);
		return answer;
	}
	
	public static int numberHours(){
		int answer=(int)(questionTime*24);
		calRemTime(answer/24.0);
		return answer;
	}
	
	public static int numberMinutes(){
		int answer=(int)(questionTime*60);
		calRemTime(answer/60.0);
		return answer;
	}
	
	public static void calRemTime(double takeaway){
		questionTime=questionTime - takeaway;
	}
	
}
		
