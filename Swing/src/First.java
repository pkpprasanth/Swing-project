import javax.swing.*;  
public class First {  
public static void main(String[] args)
	{  
	JFrame f=new JFrame("First Swing Project");//creating instance of JFrame       
	JTextField tf=new JTextField();  
    tf.setBounds(100,150, 150,70);
	JButton b=new JButton("click");//creating instance of JButton  
	b.setBounds(130,100,100, 40);//x axis, y axis, width, height           
	f.add(b);f.add(tf); //adding button in JFrame  
    f.setSize(4000,500);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
	}  
} 