import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Sample1 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample1 window = new Sample1();
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
	public Sample1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStd = new JMenuItem("Std");
		mntmStd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 450, 441);
			}
		});
		mnFile.add(mntmStd);
		
		JMenuItem menuItem = new JMenuItem("2");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.setBounds(100, 100, 1050, 641);
				textField.setBounds(12, 13, 515, 98);
			}
		});
		mnFile.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("3");
		mnFile.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("4");
		mnFile.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("5");
		mnFile.add(menuItem_3);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 13, 315, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.setBounds(40, 81, 51, 25);
		frame.getContentPane().add(button);
	}
}
