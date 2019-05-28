import java.util.Scanner;

public class Exercise_5 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String str=in.next();
	boolean result=positiveString(str.toUpperCase());
	if(result)
	{
		System.out.println("Positive String");
	}
	else
		System.out.println("Not a positive string");
	
	in.close();
}
static boolean positiveString(String str)
{
	for(int i=0;i<str.length()-1;i++)
	{
		if(str.charAt(i)>str.charAt(i+1))
			return false;
			
	}
	
	return true;
}
}
