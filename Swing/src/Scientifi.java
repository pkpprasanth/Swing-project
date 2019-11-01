 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class Scientifi {

	private JFrame frame;
	private JFrame frmCalculator;
	private JTextField textField;
	double num1,num2,result;
	String op,ans;
	double United=302.96;
	double Russia=11.52;
	double China=5.45;
	double India=100.68;
	double France=71.8;
	double Japan=156.6;
	double South=76.66;
	private JTextField con;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientifi window = new Scientifi();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scientifi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 903, 447);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 128, 128));
		menuBar.setBackground(new Color(0, 128, 128));
		frmCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnFile);
		
		JMenuItem mntmStanded = new JMenuItem("Standard");
		mntmStanded.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmStanded.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmCalculator.setTitle("Calculator");
				frmCalculator.setBounds(100, 100, 361, 447);
				textField.setBounds(12, 13, 319, 47);
			}
		});
		mnFile.add(mntmStanded);
		
		JMenuItem mntmSciec = new JMenuItem("Scientific");
		mntmSciec.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmSciec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmCalculator.setTitle("Sciec-Calculator");
				frmCalculator.setBounds(100, 100, 650, 447);
				textField.setBounds(12, 13, 450, 47);
			}
		});
		mnFile.add(mntmSciec);
		
		JMenuItem mntmUnit = new JMenuItem("Unit");
		mntmUnit.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculator.setTitle("unit-Calculator");
				frmCalculator.setBounds(100, 100, 880, 447);
				textField.setBounds(12, 13, 549, 47);
			}
		});
		mnFile.add(mntmUnit);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Comfirm","Exit",
						JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION){   
					System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(12, 13, 319, 47);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnB.setBounds(12, 87, 59, 39);
		frmCalculator.getContentPane().add(btnB);
		
		JButton btnCa = new JButton("CA");
		btnCa.setBounds(78, 87, 59, 39);
		frmCalculator.getContentPane().add(btnCa);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(144, 87, 59, 39);
		frmCalculator.getContentPane().add(btnC);
		
		JButton btnas = new JButton("+-");
		btnas.setBounds(210, 87, 59, 39);
		frmCalculator.getContentPane().add(btnas);
		
		JButton btns = new JButton("^");
		btns.setBounds(280, 87, 59, 39);
		frmCalculator.getContentPane().add(btns);
		
		JButton btnlog = new JButton("Log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(textField.getText());
				num1=Math.log(num1);
				textField.setText(String.valueOf(num1));
				
			}
		});
		btnlog.setBounds(350, 87, 59, 39);
		frmCalculator.getContentPane().add(btnlog);
		
		JButton btnsin = new JButton("Sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sin(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnsin.setBounds(420, 87, 59, 39);
		frmCalculator.getContentPane().add(btnsin);
		
		JButton btnsinh = new JButton("Sinh");
		frmCalculator.getContentPane().add(btnsinh);
		
		JButton btnmod = new JButton("Mod");
		btnmod.setBounds(560, 87, 59, 39);
		frmCalculator.getContentPane().add(btnmod);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn1.getText();
				textField.setText(Number);
			}
		});
		btn1.setBounds(12, 139, 59, 39);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn2.getText();
				textField.setText(Number);
			}
		});
		btn2.setBounds(78, 139, 59, 39);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Number=textField.getText()+btn3.getText();
				textField.setText(Number);
			}
		});
		btn3.setBounds(144, 139, 59, 39);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnp = new JButton("+");
		btnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnp.setBounds(210, 139, 59, 39);
		frmCalculator.getContentPane().add(btnp);
		
		JButton btnsn = new JButton("-");
		btnsn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
				
			}
		});
		btnsn.setBounds(280, 139, 59, 39);
		frmCalculator.getContentPane().add(btnsn);
		
		JButton btnxy = new JButton("X^Y");
		btnxy.setBounds(350, 139, 59, 39);
		frmCalculator.getContentPane().add(btnxy);
		
		JButton btnhex = new JButton("Hex");
		btnhex.setBounds(420, 139, 59, 39);
		frmCalculator.getContentPane().add(btnhex);
		
		JButton btnbin = new JButton("Bin");
		btnbin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
				
				

			}
		});
		btnbin.setBounds(490, 139, 59, 39);
		frmCalculator.getContentPane().add(btnbin);
		
		JButton btntan = new JButton("Tan");
		btntan.setBounds(560, 139, 59, 39);
		frmCalculator.getContentPane().add(btntan);
		
		JButton button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		button.setBounds(280, 287, 51, 74);
		frmCalculator.getContentPane().add(button);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(165, 42, 42), 6, true));
		panel.setForeground(Color.GREEN);
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(635, 36, 205, 241);
		frmCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select One..", "US", "Russia", "China", "India", "France", "Japan", "South Korea"}));
		comboBox.setBounds(29, 42, 108, 34);
		panel.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(29, 136, 116, 34);
		panel.add(label);
		
		JLabel lblConvetor = new JLabel("Convetor");
		lblConvetor.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblConvetor.setBounds(50, 13, 121, 25);
		panel.add(lblConvetor);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(con.getText());
				if(comboBox.getSelectedItem().equals("India"))
				{
					String c=String.format("Rs %.2f",bp*India);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("US"))
				{
					String c=String.format("$ %.2f",bp*United);
					label.setText(c);
				}
			}
		});
		btnConvert.setBounds(2, 203, 97, 25);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.setText(null);
				label.setText(null);
			}
		});
		btnClear.setBounds(101, 203, 97, 25);
		panel.add(btnClear);
		
		con = new JTextField();
		con.setFont(new Font("Tahoma", Font.PLAIN, 16));
		con.setBounds(29, 89, 116, 34);
		panel.add(con);
		con.setColumns(10);
		
	
			
		
	}
}
