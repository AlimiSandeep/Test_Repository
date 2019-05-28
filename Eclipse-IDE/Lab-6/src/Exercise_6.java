import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise_6 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the date in dd-M-yyyy format");
	String str=in.next();
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-M-yyyy");

	 LocalDate pdate = LocalDate.parse(str,dtf);
     LocalDate now = LocalDate.now();

     Period diff = Period.between(pdate, now);

  System.out.printf("\nDifference is %d years, %d months and %d days \n\n", 
                 diff.getYears(), diff.getMonths(), diff.getDays());
  
}
}
