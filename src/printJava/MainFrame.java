package printJava;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -1421602030509369436L;

	private JButton program(String title) {
		JButton btn = new JButton("Open");
		btn.setActionCommand(title);
		btn.setBorder(BorderFactory.createCompoundBorder(new TitledBorder(title
				+ " program"), new LineBorder(Color.green)));
		btn.setForeground(Color.red);
		return btn;

	}

	public MainFrame() {

		// set buttons
		final JButton b1 = program("Binary Search");
		JButton b2 = program("Binary Tree"), b3 = program("Calender"), b4 = program("Coping Arrays"), b5 = program("GCD"), b6 = program("High Array"), b7 = program("Linked List"), b8 = program("Main"), b9 = program("Method Section"), b10 = program("Months"), b11 = program("Multiplication Table"), b12 = program("Prime"), b13 = program("Print Word Java"), b14 = program("array 2D"), b15 = program("Square Area And Perimeter"), b16 = program("Stack"), b17 = program("Stop Watch"), b18 = program("Partial Sum"), b19 = program("Devision"), b20 = program("Change Appearance");
		// adding the buttons to the frame
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		// setting Action Listener
		Listener listener = new Listener();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		b7.addActionListener(listener);
		b8.addActionListener(listener);
		b9.addActionListener(listener);
		b10.addActionListener(listener);
		b11.addActionListener(listener);
		b12.addActionListener(listener);
		b13.addActionListener(listener);
		b14.addActionListener(listener);
		b15.addActionListener(listener);
		b16.addActionListener(listener);
		b17.addActionListener(listener);
		b18.addActionListener(listener);
		b19.addActionListener(listener);
		b20.addActionListener(listener);
		// set frame properties
		setLayout(new GridLayout(4, 5));
		setSize(1200, 600);
		setDefaultCloseOperation(3);
		show();

	}

	class Listener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String check = e.getActionCommand();

			switch (check) {
			case "Binary Search":
				B_Search.main_B_Search();
				return;
			case "Binary Tree":
				BinaryTree.main_B_Tree();
				return;
			case "Calender":
				Calender.main_Calender();
				return;
			case "Coping Arrays":

				return;
			case "GCD":
				GCD.main_GCD();
				return;
			case "High Array":
				HighArray.main_HighArray();
				return;
			case "Linked List":
				LinkedList.main_LinkedList();
				return;
			case "Main":
				Main.main_Main();
				return;
			case "Method Section":
				Method_Section.main_Method_Section();
				return;
			case "Months":
				Months.main_Months();
				return;
			case "Multiplication Table":
				MultiplicationTable.main_MultiplicationTable();
				return;
			case "Prime":
				PrimeProgram.main_PrimeProgram();
				return;
			case "Print Word Java":
				printWordJava.main_printWordJava();
				return;
			case "array 2D":
				new ARRAY_Td();
				return;
			case "Square Area And Perimeter":
				SquareAreaAndPerimeter.main_SquareAreaAndPerimeter();
				return;
			case "Stack":
				Stack.main_Stack();
				return;
			case "Stop Watch":
				StopWatch.main_StopWatch();
				return;
			case "Partial Sum":
				new PartialSum();
				return;
			case "Devision":
				new Division();
				return;
			case "Change Appearance":
				try {
					UIManager
							.setLookAndFeel("com.jtattoo.plaf.hifi.HIFIlookAndFeel");
					SwingUtilities.updateComponentTreeUI(MainFrame.this);
					for (LookAndFeelInfo info : UIManager
							.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
							UIManager.setLookAndFeel(info.getClassName());
							SwingUtilities
									.updateComponentTreeUI(MainFrame.this);
							break;
						}
					}
				} catch (Exception e1) {
					System.out.println("can't set look and feel");
				}
				return;
			}
		}

	}

	public static void main(String[] args) {

		new MainFrame();
	}

}
