import java.util.Scanner;

public class Exercise_7 {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	String str=in.next();
	if(validateName(str))
	{
		System.out.println(str+" is a valid name");
	}
	else
		System.out.println("Not a valid name");
}
static boolean validateName(String name)
{
	if(name.matches("[a-zA-z]{8,}_job"))
	{
		return true;
	}
	return false;
}
}
