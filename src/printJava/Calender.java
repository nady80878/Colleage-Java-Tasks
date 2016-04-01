package printJava;

import javax.swing.JOptionPane;

public class Calender {
	
	public static void main_Calender() {
	
	int NumOfLines = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The Number Of Lines : "));
	if(NumOfLines < 1 || NumOfLines >15)
		System.exit(0);
	for (int i = 1; i <= NumOfLines; i++) {		
		for (int j = 1 ; j <= NumOfLines - i ; j++) 		
          System.out.print("   ");
		for (int j = i ; j >= 1  ; j--)
			 System.out.print((j>=10)? " "+j : "  "+j);
		for (int j = 2 ; j <= i ; j++) 
			 System.out.print((j>=10)? " " +j:"  " + j);
	System.out.println();
	}

}
}
