package printJava;

import javax.swing.JOptionPane;

public class Division {
public Division() {
  if(Integer.parseInt(JOptionPane.showInputDialog("enter the number : "))%2==0){
  JOptionPane.showMessageDialog(null, "the number is even", "result", JOptionPane.INFORMATION_MESSAGE);
  }else{
  JOptionPane.showMessageDialog(null, "the number is odd", "result", JOptionPane.INFORMATION_MESSAGE);
  }
     int num = Integer.parseInt(JOptionPane.showInputDialog("enter the number : "));
  if(num%5==0&&num%6==0){
  JOptionPane.showMessageDialog(null, "the number is divisible by all", "result", JOptionPane.INFORMATION_MESSAGE);
  }else if(num%5==0){
  JOptionPane.showMessageDialog(null, "the number is divisible by 5", "result", JOptionPane.INFORMATION_MESSAGE);
  }
  else if(num%6==0){
  JOptionPane.showMessageDialog(null, "the number is divisible by 6", "result", JOptionPane.INFORMATION_MESSAGE);
  }
  else{
             JOptionPane.showMessageDialog(null, "the number isn't divisible by all", "result", JOptionPane.INFORMATION_MESSAGE);
  }
  }
}
