import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Furnished implements ActionListener{	
	
 JFrame jf=new JFrame("Complaint Window");
 JPanel jp=new JPanel();
 JMenuBar jb=new JMenuBar();
 JLabel jl1=new JLabel("Name:  ");
 JLabel jl3=new JLabel("Select category of handset:  ");
 JLabel jl2=new JLabel("Phone number:  ");
 JLabel jl4=new JLabel("Product problem :  ");
 JLabel jl6=new JLabel("Purchase date :  ");
 JLabel jl5=new JLabel("Product problem Description :  ");
 JCheckBox jc=new JCheckBox("I agree to terms & conditions");
 JButton jb1=new JButton("Submit");
 JButton jb2=new JButton("Cancel");
 
	     Furnished(){
	    	 
	       jf.setVisible(true);
           jf.setSize(700,500); 
	       jp.add(jb);
	         
	       JMenu jm1=new JMenu("Home");//Navigation bar functions
           JMenu jm2=new JMenu("Check Status");
           JMenu jm3=new JMenu("New complaint");
           jm3.setSelected(true);
           
           jb.add(jm1);
           jb.add(jm2);
           jb.add(jm3);
           
           JMenuItem jmi1=new JMenuItem("Headphones"); //Options of Home
           JMenuItem jmi2=new JMenuItem("Earphones");
           JMenuItem jmi3=new JMenuItem("Limited editon");
           jm1.add(jmi1);jm1.add(jmi2);jm1.add(jmi3);
           
           JMenuItem jmi6=new JMenuItem("Shipped within india"); //Options of status
           JMenuItem jmi7=new JMenuItem("Shipped Internationally");
           jm2.add(jmi6);jm2.add(jmi7);
           
           JMenuItem jmi4=new JMenuItem("Within warranty period"); //Options of new complaint
           JMenuItem jmi5=new JMenuItem("NO warranty period");
           jm3.add(jmi4);jm3.add(jmi5);
           
           //Input area for name
           jl1.setVisible(true);
           JTextField jf1=new JTextField(20);
           jp.add(jl1);
           jp.add(jf1);
           
           //Input area for phone number
           jl2.setVisible(true);
           JTextField jf2=new JTextField(20);
           jf2.setToolTipText("Please enter pin code of country in brackets too.");
           jp.add(jl2);
           jp.add(jf2);

           //selection options for type of handset
           jl1.setVisible(true);
           String s[]= {"Headphone","Earphone","Limited endition"};
           JComboBox jcb=new JComboBox(s);
           jp.add(jl3); 
           jp.add(jcb);
          
           //Input area for problem type
           jl1.setVisible(true);
           JTextField jf3=new JTextField(20);
           jp.add(jl4);
           jp.add(jf3);
           
           //Input area for Purchase date
           jl6.setVisible(true);
           JTextField jf4=new JTextField(10);
           jf4.setToolTipText("DD-MM-YYYY");
           jp.add(jl6);
           jp.add(jf4);
           
           //Input area for problem Description
           jl1.setVisible(true);
           JTextArea ja1=new JTextArea(3, 20);
           jp.add(jl5);
           jp.add(ja1);
           
           jc.setVisible(true);
           jc.setSelected(true);
           jp.add(jc);
                      
           jb1.setVisible(true);
           
           jb2.setVisible(true);
           jp.add(jb1);jp.add(jb2);
           jb1.addActionListener(this);
           jb2.addActionListener(this);     
           jf.add(jp);
	     }
	 public static void main(String[] args)
		 {
		 Furnished f=new Furnished();
		 }

		@Override
		public void actionPerformed(ActionEvent arg0) {

			
		}
		
	}
