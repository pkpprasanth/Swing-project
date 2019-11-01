import java.awt.event.*;  
import javax.swing.*;    
public class Second {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,50);  
    JButton b=new JButton(new ImageIcon("E://clickhere.png"));  
    b.setBounds(50,100,200,50);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to DDUGKY.");  
        }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  