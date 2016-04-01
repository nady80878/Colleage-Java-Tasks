package printJava;


import java.util.Scanner;


public class Quiz {


    public static void reverse(int number){
       while(number >0 ){
           int reminder = number%10;
           number -= reminder;
           number/=10;
           System.out.print(reminder);
       }
    }

   public static void main_Quis() {
        Scanner cin = new Scanner(System.in);
        System.out.println(" enter the number : ");
        int num = cin.nextInt();
        System.out.println(" the entered number : ");
   
        System.out.println("The reversed : ");

                   
    }
}

