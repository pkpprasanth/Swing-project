import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;

public class New {

	private JFrame frame;
	private JTextField textField;
    double num1;
    double num2;
    double result;
    String op;
    String ans;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New window = new New();
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
	public New() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(45, 6, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.setBounds(45, 68, 49, 38);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}			
		});
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(106, 68, 51, 38);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
				
			}
		});
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("=");
		button_2.setBounds(45, 119, 49, 38);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);	
				}
			}
		});
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.setBounds(116, 119, 45, 38);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		frame.getContentPane().add(button_3);
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(112, 170, 49, 32);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
			}
		});
		frame.getContentPane().add(btnClear);
		
		JButton button_4 = new JButton("-");
		button_4.setBounds(43, 170, 51, 32);
		frame.getContentPane().add(button_4);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String b=null;
			if(textField.getText().length()>0)
			{
				StringBuilder strB=new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				b=strB.toString();
				textField.setText(b);
			}
			}
		});
		btnB.setBounds(24, 215, 97, 25);
		frame.getContentPane().add(btnB);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected())
				{
					JOptionPane.showMessageDialog(rdbtnNewRadioButton, "You are Male.");    

				}
			}
		});
		rdbtnNewRadioButton.setBounds(129, 211, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		  final JLabel label = new JLabel();            
	        label.setHorizontalAlignment(JLabel.CENTER);    
	        label.setSize(400,100);
	}
}
