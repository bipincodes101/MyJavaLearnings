package banking.mangament.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;
//javax is extended class to java ,swing is a package where JFrame class is available .
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener {
	
	JButton signin,signup,clear;
	JTextField cardTextField;
	JPasswordField pinTextField;
	//Login class constructor
	Login(){
		
		//for adding image on the frame we used ImageIcon class.
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));//image size is very large so,
		
		Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//use the Image for size.
		
		ImageIcon i3=new ImageIcon(i2);//creating ImageIcon object to convert i2 into ImageIcon.
		
		JLabel label=new JLabel(i3);//for the adding image JLabel class is used.
		
		add(label);//add image on frame add method is used.
		
		label.setBounds(70,11,100,100);//set the location of image.
		setLayout(null);//to set default layout null.
		getContentPane().setBackground(Color.white);//getContentPane method select all frame .
		
		JLabel text=new JLabel("Welcome to ATM");//used to print heading .
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200,40,400,40);
		add(text);
		
		JLabel cardNo=new JLabel("Card No:");//used to print heading .
		cardNo.setFont(new Font("Raleway",Font.BOLD,38));
		cardNo.setBounds(120,150,190,40);
		add(cardNo);
		cardTextField=new JTextField();//create the box.
		cardTextField.setFont(new Font("Arial",Font.BOLD,15));
		add(cardTextField);
		cardTextField.setBounds(320,160,230,30);
		
		
		JLabel pinNo=new JLabel("Pin No:");//used to print heading .
		pinNo.setFont(new Font("Raleway",Font.BOLD,38));
		pinNo.setBounds(120,230,190,40);
		add(pinNo);
		pinTextField=new JPasswordField();//create the box.
		pinTextField.setFont(new Font("Arial",Font.BOLD,15));
		add(pinTextField);
		pinTextField.setBounds(320,235,230,30);
		
		
		//sign in button field.
		signin =new JButton("Sign IN");
		signin.setBackground(Color.black);
		signin.setForeground(Color.white);
		add(signin);
		signin.setBounds(320,300,90,40);
		signin.addActionListener(this);
		
		//clear button field.
		clear =new JButton("CLEAR");
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		add(clear);
		clear.setBounds(460,300,90,40);
		clear.addActionListener(this);
		//signup field
		signup =new JButton("SIGN UP");
		signup.setBackground(Color.black);
		signup.setForeground(Color.white);
		add(signup);
		signup.setBounds(310,360,250,40);
		signup.addActionListener(this);
		
		setSize(800,480);//used for set the size.
		setVisible(true);//used to set visibility of frame.
		setLocation(350,200);//used to set location in the screen.
		setTitle("Automated Teller Machine");//used to set the title on the frame.
	}
		//this is the work of action.
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==clear) {
				cardTextField.setText("");
				pinTextField.setText("");
			}else if(e.getSource()==signin) {
				
			}else if(e.getSource()==signup){
				
			}
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//creating the object of Login class.
		new Login();
	}
	

}
