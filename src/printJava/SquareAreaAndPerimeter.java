package printJava;
/*
 * Author : nady shalaby
 * 
 * topic : how to find SquareAreaAndPerimeter
 */
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class SquareAreaAndPerimeter {
	public SquareAreaAndPerimeter() {
		do{
		try{
		double x = Double.parseDouble(JOptionPane.showInputDialog(null,"«œŒ· ÷·⁄ «·„—»⁄ «·„—«œ Õ”«» „”«Õ Â Ê„ÕÌÿÂ ","«·«œŒ«·",JOptionPane.QUESTION_MESSAGE));
        double area = Math.pow(x, 2);
        double perimeter = x*4;
        JOptionPane.showMessageDialog(null,String.format("The Area : %f  And The Perimeter : %f (^_^)!!!",area,perimeter),"The Result",JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			 JOptionPane.showMessageDialog(null,e);
		}
		}while( JOptionPane.showConfirmDialog(null, "Do you Wanna Continue ?","Confirmation",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION);
		}
	public static void main_SquareAreaAndPerimeter() {
	
	new SquareAreaAndPerimeter();
}
}
