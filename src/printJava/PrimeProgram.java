package printJava;

import java.util.Scanner;
/*
 * Author : nady shalaby
 * 
 * topic : how to find the primes nums (Best Way)
 */
public class PrimeProgram {
	static Scanner cin = new Scanner(System.in);

	public static void main_PrimeProgram() {
		System.out.println("Enter the number : ");
		int Fnum = cin.nextInt();
		for(int i=1;i<=Fnum;++i)
		if(prime(i))
			System.out.println(String.format("%d Prime", i));
		else
			System.out.println(String.format("%d Not Prime", i));
	}
public static boolean prime (int tst){
	if(tst==2)
		return true;	
	if(tst%2==0)return false;
	double x = tst / 2.0;
	int k=(int) x;
	if(x==k||tst==1)
	return false;
	for(int i =3;i*i<=tst;i+=2){
		if(tst%i==0)
		return false;
	}
	return true;
}
}
