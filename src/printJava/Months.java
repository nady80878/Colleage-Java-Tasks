package printJava;


import java.util.Scanner;

public class Months {

  Scanner x= new Scanner(System.in);
    
    public Months(){

   String Arr [] = {"Jan","feb","mar","avril","june","jullie","may","augest","september","oct","november","decimber"};
   String c="y";
    while( c.equals("y"))   {
   System.out.println("Enter the number of the month :");
   int y = x.nextInt();
   if(y>0&&y<12){
       System.out.println("the month is : "+ Arr[y-1]);
    
   }
   else{
       System.out.println("Enter A valid Number");
   }
            System.out.println("if you want to continue enter : y else emter : any key");
            c= x.next();
    }
    	
    }
   
	public static void main_Months() {
      new Months();
    }

  
}
