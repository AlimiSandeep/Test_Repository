import java.util.Scanner;

interface MyInterface
{
	int calcPower(int x,int y);
}

public class Exercise_1 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter x value:");
	int x=in.nextInt();
	System.out.println("Enter y value:");
	int y=in.nextInt();
	
	MyInterface obj=(e1,e2)->(int)Math.pow(e1, e2);
	System.out.println("The value of x^y is"+obj.calcPower(x, y));
	
	in.close();
	
	
}
}
