package printJava;


/**
 * AUTHOR : nady shalaby
 *
 * TOPIC : (Even-odd)
 *  ~~~  : (Show if The number is divisable by 5,6, or not for all)
 */


import javax.swing.JOptionPane;
public class Main {
	public static void main_Main() {

         int num = Integer.parseInt(JOptionPane.showInputDialog("enter the first number : "));
          int num2 = Integer.parseInt(JOptionPane.showInputDialog("enter the second number : "));
          switch(JOptionPane.showInputDialog("enter the operator (+,-,*,/) : ").charAt(0)){
              case '+':
                    JOptionPane.showMessageDialog(null, "the sum : "+(num+num2), "result", JOptionPane.INFORMATION_MESSAGE);
          break;
              case '-':
                    JOptionPane.showMessageDialog(null, "the subtract : "+(num-num2), "result", JOptionPane.INFORMATION_MESSAGE);
          break;
              case '/':
                  if(num2==0)
                    JOptionPane.showMessageDialog(null, "can't divide by zero", "result", JOptionPane.ERROR_MESSAGE);
                  else
                    JOptionPane.showMessageDialog(null, "the division  : "+(num/num2), "result", JOptionPane.INFORMATION_MESSAGE);
          break;
              default :
                                      JOptionPane.showMessageDialog(null, "the multiplication : "+(num*num2), "result", JOptionPane.INFORMATION_MESSAGE);

          }

    }
}


