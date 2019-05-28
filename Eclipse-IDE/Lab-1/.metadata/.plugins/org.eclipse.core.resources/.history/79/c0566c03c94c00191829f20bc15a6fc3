import java.util.Scanner;

enum Days{
	
	SUN,MON,TUE,WED,THU,FRI,SAT;
}

public class EnumDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the day");
		String str=scan.next();
		Days days=Days.valueOf(str.toUpperCase());
		switch(days)
		{
		case SUN :System.out.println("Sunday is holiday");break;
		case MON:System.out.println("Monday is unhappy day");break;
		case TUE:System.out.println("Tuesday is boring day");break;
		case WED: System.out.println("Wednesday is unhappy day ");break;
		case THU:System.out.println("Thursday is review day");break;
		case FRI:System.out.println("Friday is code delivery day");break;
		case SAT: System.out.println("Saturday is weekend");break;
		default :System.out.println("Invalid day...");break;

		}
		
	}

}
