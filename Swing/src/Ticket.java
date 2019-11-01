import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ticket {

	private JFrame frame;
	private JTextField Tax;
	private JTextField Sub;
	private JTextField Total;
	private JTextField From;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 74));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1191, 938);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(273, 23, 615, 81);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(413, 8, 0, 0);
		panel.add(label);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblTicketBooking.setBounds(27, 8, 559, 60);
		panel.add(lblTicketBooking);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 219, 395, -14);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 219, 450, 19);
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(separator_1);
		
		JRadioButton Std = new JRadioButton("Standard");
		Std.setBounds(32, 247, 127, 25);
		Std.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(Std);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(484, 143, 677, 560);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(12, 177, 98, 25);
		panel_1.add(lblFrom);
		
		From = new JTextField();
		From.setFont(new Font("Tahoma", Font.BOLD, 20));
		From.setColumns(10);
		From.setBounds(176, 170, 154, 38);
		panel_1.add(From);
		
		JLabel To = new JLabel("To");
		To.setFont(new Font("Tahoma", Font.BOLD, 20));
		To.setBounds(12, 238, 98, 25);
		panel_1.add(To);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(176, 231, 154, 38);
		panel_1.add(textField_5);
		
		JLabel Date = new JLabel("Date");
		Date.setFont(new Font("Tahoma", Font.BOLD, 20));
		Date.setBounds(12, 301, 98, 25);
		panel_1.add(Date);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(176, 294, 154, 38);
		panel_1.add(textField_6);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTime.setBounds(12, 362, 98, 25);
		panel_1.add(lblTime);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(176, 355, 154, 38);
		panel_1.add(textField_7);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketNo.setBounds(468, 170, 98, 25);
		panel_1.add(lblTicketNo);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(448, 197, 150, 38);
		panel_1.add(textField_8);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(468, 244, 98, 25);
		panel_1.add(lblPrice);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(448, 271, 150, 38);
		panel_1.add(textField_9);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoute.setBounds(468, 322, 98, 25);
		panel_1.add(lblRoute);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(448, 349, 150, 38);
		panel_1.add(textField_10);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_1.setBounds(12, 71, 130, 36);
		panel_1.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(149, 71, 181, 36);
		panel_1.add(textField_1);
		
		JButton btnCon = new JButton("Comfirm");
		btnCon.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCon.setBounds(255, 476, 144, 38);
		panel_1.add(btnCon);
		
		JRadioButton FirstClass = new JRadioButton("First Class");
		FirstClass.setBounds(32, 305, 150, 25);
		FirstClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(FirstClass);
		
		JRadioButton Sin = new JRadioButton("Single Ticket");
		Sin.setBounds(186, 250, 164, 25);
		Sin.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(Sin);
		
		JRadioButton Return = new JRadioButton("AC");
		Return.setBounds(186, 305, 62, 25);
		Return.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(Return);
		
		JRadioButton Child = new JRadioButton("Child");
		Child.setBounds(375, 305, 79, 25);
		Child.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(Child);
		
		JRadioButton Adult = new JRadioButton("Adult");
		Adult.setBounds(366, 247, 98, 25);
		Adult.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(Adult);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(22, 355, 152, 38);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Start..", "", "Assam (Dispur)", "Bihar (Patna)", "Chhattisgarh (Raipur)", "Goa (Panaji)", "Jharkhand (Ranchi)", "Karnataka (Bangalore)", "Kerala ", "Madhya Pradesh (Bhopal)", "Maharashtra (Mumbai)", "Manipur (Imphal)", "Meghalaya (Shillong)", "Mizoram (Aizawl)", "Nagaland (Kohima)", "Odisha (Bhubaneshwar)", "Punjab (Chandigarh)", "Rajasthan (Jaipur)", "Sikkim (Gangtok)", "Tamil Nadu (Chennai)"}));
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"End..", "Start..", "", "Assam (Dispur)", "Bihar (Patna)", "Chhattisgarh (Raipur)", "Goa (Panaji)", "Jharkhand (Ranchi)", "Karnataka (Bangalore)", "Kerala ", "Madhya Pradesh (Bhopal)", "Maharashtra (Mumbai)", "Manipur (Imphal)", "Meghalaya (Shillong)", "Mizoram (Aizawl)", "Nagaland (Kohima)", "Odisha (Bhubaneshwar)", "Punjab (Chandigarh)", "Rajasthan (Jaipur)", "Sikkim (Gangtok)", "Tamil Nadu (Chennai)"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setBounds(186, 355, 127, 38);
		frame.getContentPane().add(comboBox_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(469, 407, -444, -14);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(22, 406, 450, 19);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		frame.getContentPane().add(separator_3);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(32, 438, 98, 25);
		frame.getContentPane().add(lblTax);
		
		
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(32, 492, 98, 25);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(32, 549, 98, 25);
		frame.getContentPane().add(lblTotal);
		
		Tax = new JTextField();
		Tax.setFont(new Font("Tahoma", Font.BOLD, 20));
		Tax.setBounds(196, 431, 154, 38);
		frame.getContentPane().add(Tax);
		Tax.setColumns(10);
		
		Sub = new JTextField();
		Sub.setFont(new Font("Tahoma", Font.BOLD, 20));
		Sub.setColumns(10);
		Sub.setBounds(196, 486, 154, 38);
		frame.getContentPane().add(Sub);
		
		Total = new JTextField();
		Total.setFont(new Font("Tahoma", Font.BOLD, 20));
		Total.setColumns(10);
		Total.setBounds(196, 543, 154, 38);
		frame.getContentPane().add(Total);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnSleeper.setBounds(252, 305, 110, 25);
		frame.getContentPane().add(rdbtnSleeper);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(22, 598, 450, 19);
		frame.getContentPane().add(separator_4);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Time
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				textField_7.setText(tTime.format(timer.getTime()));
				//Date
				SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
				textField_6.setText(tdate.format(timer.getTime()));
				
				From.setText((String)comboBox_1.getSelectedItem());
				textField_5.setText((String)comboBox.getSelectedItem());
				
	
				String s="";
				 String tx="";
				double tot;
				Random random = new Random();
				int randomInt = random.nextInt(10000);
				s=s+randomInt;
				textField_8.setText(s);
				textField_10.setText("Any");
				int h;
				double t=0;
				String m="";
				if(Sin.isSelected()) {
					t=t+500;
				}
				else {
					t=t+300;
				}
				if(Return.isSelected())
				{
					
					t=t+500;
				}
				else {
					t=t+300;
				}
				if(Return.isSelected())
				{
					 h=200;
				    
				     tx=tx+h;
					Tax.setText(tx);
				}
				else {
					h=100;
				     
				     tx=tx+h;
					Tax.setText(tx);
				}
				
				if(rdbtnSleeper.isSelected())
				{

					t=t+500;
				}
				else {
					t=t+300;
				}
				m=m+t;
				Sub.setText(m);
				tot=h+t;
				
				Total.setText(null);
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnTotal.setBounds(33, 648, 109, 38);
		frame.getContentPane().add(btnTotal);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tax.setText(null);
				Sub.setText(null);
				Total.setText(null);
				Std.setSelected(false);
				Sin.setSelected(false);
				Adult.setSelected(false);
			
				FirstClass.setSelected(false);
				Return.setSelected(false);
				Child.setSelected(false);
				comboBox.setSelectedItem("Select Your State..");
				lblRoute.setText(null);
				Date.setText(null);
				To.setText(null);
				lblTime.setText(null);
				From.setText(null);
				lblPrice.setText(null);
				lblTicketNo.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBounds(179, 648, 109, 38);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Comfirm","Exit",
						JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION){   
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(326, 648, 109, 38);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.BLACK);
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(476, 218, 7, 485);
		frame.getContentPane().add(separator_5);
		
		
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"No.Seate", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_2.setBounds(320, 355, 134, 38);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblName.setBounds(29, 170, 130, 36);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(197, 170, 181, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(35, 743, 1115, 135);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "TO", "No.of seate", "Time", "Date", "AC/Non-AC", "Price"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(12, 13, 1022, 109);
		panel_2.add(table);
		
		
	}
}
