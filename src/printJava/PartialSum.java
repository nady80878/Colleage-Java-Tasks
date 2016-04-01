package printJava;

import javax.swing.JOptionPane;

public class PartialSum {
	
	  public  int sum(int number){
		  int sum = 0;
	       while(number >0 ){
	           int reminder = number%10;
	           number -= reminder;
	           number/=10;
	           sum+=reminder;
	       }
	       return sum;
	  }
        public PartialSum() {
        	
        	System.out.println("The Partial Sum : "+sum(Integer.parseInt(JOptionPane.showInputDialog(null,"EnterNumber : "))));
         }
}
