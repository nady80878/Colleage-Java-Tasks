package printJava;
/*
 * Author : nady shalaby
 * 
 * topic : how to find the GCD
 */
import java.util.Scanner;

public class GCD {
	Scanner cin = new Scanner(System.in);
    public GCD() {
	System.out.println("Enter the first number : ");
	int Fnum = cin.nextInt();
	System.out.println("Enter the second number : ");
	int Snum = cin.nextInt();
	int gcd = 1;
	int counter = 1;
	while(counter<= Fnum&&counter <=Snum ){
		gcd=((Fnum%counter==0)&&(Snum%counter==0))? counter : gcd;
		counter++;
	}	
	System.out.println("the result : "+ gcd);
}
	public static void main_GCD() {
	new GCD();
	}

}
