

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;



public class ConnectionManager {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
		
		
		JFrame f = new JFrame("HOTEL");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel head;
		head = new JLabel("Hotel Management Systems");
		head.setForeground(Color.black);
		head.setFont(new Font("Serif", Font.BOLD, 25));
		head.setBounds(100, 10, 400, 50);
		f.getContentPane().add(head);
				
					JLabel label= new JLabel("");
					label.setBounds(5, 70, 350, 290);
				    Border border = BorderFactory.createLineBorder(Color.BLACK);
				    label.setBorder(border);
				    f.getContentPane().add(label);
				    
				    JLabel label2= new JLabel("");
					label2.setBounds(360, 70, 250, 290);
				    Border border2 = BorderFactory.createLineBorder(Color.BLACK);
				    label2.setBorder(border2);
				    f.getContentPane().add(label2);
				    
				    JLabel label3= new JLabel("");
					label3.setBounds(5, 370, 350, 170);
				    Border border3 = BorderFactory.createLineBorder(Color.BLACK);
				    label3.setBorder(border3);
				    f.getContentPane().add(label3);
				    
				    JLabel label4= new JLabel("");
					label4.setBounds(360, 370, 250, 170);
				    Border border4 = BorderFactory.createLineBorder(Color.BLACK);
				    label4.setBorder(border4);
				    f.getContentPane().add(label4);
				    
				    JLabel label5= new JLabel("");
					label5.setBounds(620, 70, 250, 470);
				    Border border5 = BorderFactory.createLineBorder(Color.BLACK);
				    label5.setBorder(border5);
				    f.getContentPane().add(label5);
				    
				    JLabel label6= new JLabel("");										
					label6.setBounds(630, 170, 230, 360);
				    Border border6 = BorderFactory.createLineBorder(Color.BLUE);
				    label6.setBorder(border6);
				    f.getContentPane().add(label6);
				    
				    JLabel label7= new JLabel("");										
					label7.setBounds(5, 550, 865, 80);
				    Border border7 = BorderFactory.createLineBorder(Color.BLACK);
				    label7.setBorder(border7);
				    f.getContentPane().add(label7);
		
		JLabel cb,cbm,csb;
		cb = new JLabel("Chicken Burger :");
		cb.setBounds(20, 110, 150, 30);
		final JTextField tcb = new JTextField();
		tcb.setBounds(150, 110, 170, 30);
		cbm = new JLabel("Chicken Burger Meal  :");
		cbm.setBounds(20, 150, 150, 30);
		final JTextField tcbm = new JTextField();
		tcbm.setBounds(150, 150, 170, 30);
		csb = new JLabel("Chineese Burger  :");
		csb.setBounds(20, 190, 150, 30);
		final JTextField tcsb = new JTextField();
		tcsb.setBounds(150, 190, 170, 30);
		f.getContentPane().add(cb);f.getContentPane().add(tcb);f.getContentPane().add(cbm);f.getContentPane().add(tcbm);f.getContentPane().add(csb);f.getContentPane().add(tcsb);
		
		
		JLabel drink;
		drink = new JLabel("Drink");
		drink.setForeground(Color.black);
		drink.setFont(new Font("Serif", Font.BOLD, 18));
		drink.setBounds(20, 230, 100, 50);
		f.getContentPane().add(drink);
		
		String drk[] = { "Tea", "Cofee", "Pepsi","Lime Juice" };
		JComboBox drkbox = new JComboBox(drk);
		drkbox.setBounds(20, 280, 150, 30);
		f.getContentPane().add(drkbox);
		
		JLabel qty;
		qty = new JLabel("Qty");
		qty.setForeground(Color.black);
		qty.setFont(new Font("Serif", Font.BOLD, 18));
		qty.setBounds(220, 230, 100, 50);
		f.getContentPane().add(qty);
		
		final JTextField tqty = new JTextField();
		tqty.setBounds(220, 280, 100, 30);
		f.getContentPane().add(tqty);
		
		JRadioButton hode= new JRadioButton("Home Delivery");
		hode.setBounds(20, 320, 150, 30);
		f.getContentPane().add(hode);
		
		JRadioButton tax= new JRadioButton("Tax");
		tax.setBounds(220, 320, 100, 30);
		f.getContentPane().add(tax);
		
					JLabel head2;
					head2 = new JLabel("Currency Converter");
					head2.setForeground(Color.black);
					head2.setFont(new Font("Serif", Font.BOLD, 18));
					head2.setBounds(370, 80, 200, 50);
					f.getContentPane().add(head2);
					
					String curr[] = { "India", "Canada", "Dubai","Singapoor" };
					JComboBox currbox = new JComboBox(curr);
					currbox.setBounds(390, 130, 180, 30);
					f.getContentPane().add(currbox);
					
					final JTextField tcurr = new JTextField();
					tcurr.setBounds(390, 180, 180, 30);
					f.getContentPane().add(tcurr);
					
					JButton bconvert= new JButton("Convert");
					bconvert.setBounds(390, 320, 80, 30);
					f.getContentPane().add(bconvert);
					JButton bclose= new JButton("Close");
					bclose.setBounds(500, 320, 80, 30);
					f.getContentPane().add(bclose);
					
					tcurr.addFocusListener(new FocusListener() {
						
						@Override
						public void focusLost(FocusEvent e) {
							// TODO Auto-generated method stub
							String countries=(String) currbox.getSelectedItem();
							String sql="Select rate from convertion where country='"+countries+"' ";
							ResultSet rs1=null;
														
						}
						
						@Override
						public void focusGained(FocusEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
		
		
		JLabel cod,com,codeli;
		cod = new JLabel("Cost of Drinks :");
		cod.setBounds(20, 410, 150, 30);
		final JTextField tcod = new JTextField();
		tcod.setBounds(150, 410, 170, 30);
		com = new JLabel("Cost of Meal  :");
		com.setBounds(20, 450, 150, 30);
		final JTextField tcom = new JTextField();
		tcom.setBounds(150, 450, 170, 30);
		codeli = new JLabel("Cost of Delivery  :");
		codeli.setBounds(20, 490, 150, 30);
		final JTextField tcodeli = new JTextField();
		tcodeli.setBounds(150, 490, 170, 30);
		f.getContentPane().add(cod);f.getContentPane().add(tcod);f.getContentPane().add(com);f.getContentPane().add(tcom);f.getContentPane().add(codeli);f.getContentPane().add(tcodeli);	
		
		
					JLabel taxs,stotal,total;
					taxs = new JLabel("Tax :");
					taxs.setBounds(370, 410, 150, 30);
					final JTextField ttaxs = new JTextField();
					tcod.setBounds(450, 410, 150, 30);
					stotal = new JLabel("Sub Total  :");
					stotal.setBounds(370, 450, 150, 30);
					final JTextField tstotal = new JTextField();
					tstotal.setBounds(450, 450, 150, 30);
					total = new JLabel("Total  :");
					total.setBounds(370, 490, 150, 30);
					final JTextField ttotal = new JTextField();
					ttotal.setBounds(450, 490, 150, 30);
					f.getContentPane().add(taxs);f.getContentPane().add(ttaxs);f.getContentPane().add(stotal);f.getContentPane().add(tstotal);f.getContentPane().add(total);f.getContentPane().add(ttotal);	
					final JTextField tadd = new JTextField();
					tadd.setBounds(150, 410, 170, 30);
					f.getContentPane().add(tadd);
					
					
					
		JButton b0= new JButton("0");
		b0.setBounds(650, 470, 45, 45);
		f.getContentPane().add(b0);
		
		JButton bdot= new JButton(".");
		bdot.setBounds(697, 470, 45, 45);
		f.getContentPane().add(bdot);
		
		JButton bddot= new JButton("...");
		bddot.setBounds(744, 470, 45, 45);
		f.getContentPane().add(bddot);

		JButton bequal= new JButton("=");
		bequal.setBounds(791, 470, 45, 45);
		f.getContentPane().add(bequal);
		
		JButton b1= new JButton("1");
		b1.setBounds(650, 423, 45, 45);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.setBounds(697, 423, 45, 45);
		f.getContentPane().add(b2);
		
		JButton b3= new JButton("3");
		b3.setBounds(744, 423, 45, 45);
		f.getContentPane().add(b3);

		JButton bdiv= new JButton("/");
		bdiv.setBounds(791, 423, 45, 45);
		f.getContentPane().add(bdiv);
		
		JButton b4= new JButton("4");
		b4.setBounds(650, 376, 45, 45);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.setBounds(697, 376, 45, 45);
		f.getContentPane().add(b5);
		
		JButton b6= new JButton("6");
		b6.setBounds(744, 376, 45, 45);
		f.getContentPane().add(b6);

		JButton bmul= new JButton("*");
		bmul.setBounds(791, 376, 45, 45);
		f.getContentPane().add(bmul);
		
		JButton b7= new JButton("7");
		b7.setBounds(650, 329, 45, 45);
		f.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.setBounds(697, 329, 45, 45);
		f.getContentPane().add(b8);
		
		JButton b9= new JButton("9");
		b9.setBounds(744, 329, 45, 45);
		f.getContentPane().add(b9);

		JButton bsub= new JButton("-");
		bsub.setBounds(791, 329, 45, 45);
		f.getContentPane().add(bsub);
		
		JButton bB= new JButton("B");
		bB.setBounds(650, 282, 45, 45);
		f.getContentPane().add(bB);
		
		JButton bC = new JButton("C");
		bC.setBounds(697, 282, 45, 45);
		f.getContentPane().add(bC);
		
		JButton btdot= new JButton("...");
		btdot.setBounds(744, 282, 45, 45);
		f.getContentPane().add(btdot);

		JButton badd= new JButton("+");
		badd.setBounds(791, 282, 45, 45);
		f.getContentPane().add(badd);

		final JTextField calctext = new JTextField();
		calctext.setBounds(650, 190, 190, 70);
		f.getContentPane().add(calctext);
		
		JButton bcalculator= new JButton("Calculator");
		bcalculator.setBounds(630, 140, 100, 30);
		f.getContentPane().add(bcalculator);
		
		JButton breciept = new JButton("Reciept");
		breciept.setBounds(730, 140, 100, 30);
		f.getContentPane().add(breciept);
		
					JButton btotal = new JButton("Total");
					btotal.setBounds(80, 570, 100, 30);
					f.getContentPane().add(btotal);
					
					JButton breceive = new JButton("Received");
					breceive.setBounds(220, 570, 100, 30);
					f.getContentPane().add(breceive);
					
					JButton breset = new JButton("Reset");
					breset.setBounds(360, 570, 100, 30);
					f.getContentPane().add(breset);
					
					JButton bexit = new JButton("Exit");
					bexit.setBounds(500, 570, 100, 30);
					f.getContentPane().add(bexit);

		JLabel head3 ;head3 = new JLabel("..");f.getContentPane().add(head3);
		
		
		
		
		
	    f.setVisible(true);
		f.setSize(900, 700);
		f.getContentPane().setLayout(null);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(620, 573, 97, 25);
		f.getContentPane().add(btnSave);
		f.setVisible(true);

	}
}
