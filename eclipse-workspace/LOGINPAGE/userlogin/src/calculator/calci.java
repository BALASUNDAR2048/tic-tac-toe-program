package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calci {

	private JFrame frame;
	private JTextField textField_1;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 417, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setBounds(23, 10, 356, 68);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String backspace=null;
				 if(textField_1.getText().length()>0) {
					 StringBuilder str = new StringBuilder(textField_1.getText());
					 str.deleteCharAt(textField_1.getText().length()-1); 
					 backspace = str.toString();
					 textField_1.setText(backspace);
				 }
			}
		});
		btnbackspace.setFont(new Font("Dialog", Font.PLAIN, 30));
		btnbackspace.setBounds(23, 94, 76, 76);
		frame.getContentPane().add(btnbackspace);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btnclear.setBounds(113, 94, 76, 76);
		frame.getContentPane().add(btnclear);
		
		JButton btn = new JButton("0 0");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn.getText();
				textField_1.setText(number);
			}
		});
		btn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn.setBounds(207, 94, 76, 76);
		frame.getContentPane().add(btn);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btnplus.setBounds(303, 94, 76, 76);
		frame.getContentPane().add(btnplus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn7.getText();
				textField_1.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn7.setBounds(23, 182, 76, 76);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn8.getText();
				textField_1.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn8.setBounds(113, 182, 76, 76);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn9.getText();
				textField_1.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn9.setBounds(207, 182, 76, 76);
		frame.getContentPane().add(btn9);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operation="-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btnminus.setBounds(303, 180, 76, 76);
		frame.getContentPane().add(btnminus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn4.getText();
				textField_1.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn4.setBounds(23, 268, 76, 76);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn5.getText();
				textField_1.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn5.setBounds(113, 268, 76, 76);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn6.getText();
				textField_1.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn6.setBounds(207, 268, 76, 76);
		frame.getContentPane().add(btn6);
		
		JButton btnmulti = new JButton("*");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operation="*";
			}
		});
		btnmulti.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btnmulti.setBounds(303, 268, 76, 76);
		frame.getContentPane().add(btnmulti);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			private JTextComponent textField;

			public void actionPerformed(ActionEvent arg0) {
				String number=textField_1.getText()+btn1.getText();
				textField_1.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn1.setBounds(23, 354, 76, 76);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn2.getText();
				textField_1.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn2.setBounds(113, 354, 76, 76);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn3.getText();
				textField_1.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn3.setBounds(207, 354, 76, 76);
		frame.getContentPane().add(btn3);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operation="/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btndivide.setBounds(303, 354, 76, 76);
		frame.getContentPane().add(btndivide);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btn0.addActionListener(new ActionListener() {
			private JTextComponent textField;

			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btn0.getText();
				textField_1.setText(number);
			}
		});
		btn0.setBounds(23, 440, 76, 76);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+btndot.getText();
				textField_1.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btndot.setBounds(113, 440, 76, 76);
		frame.getContentPane().add(btndot);
		
		JButton btnequal = new JButton("=");
		btnequal.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second =Double.parseDouble(textField_1.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
				else if(operation=="-"){
					result=first-second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
				else if(operation=="*"){
					result=first*second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
				else if(operation=="/"){
					result=first/second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
				else if(operation=="%"){
					result=first%second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
			}
		});
		btnequal.setBounds(207, 440, 76, 76);
		frame.getContentPane().add(btnequal);
		
		JButton btnmodulus = new JButton("%");
		btnmodulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operation="%";
			}
		});
		btnmodulus.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnmodulus.setBounds(303, 440, 76, 76);
		frame.getContentPane().add(btnmodulus);
	}
}
