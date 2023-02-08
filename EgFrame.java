import javax.swing.*;
import java.lang.Exception;
class EgFrame
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Frame");
   		JButton b=new JButton("Frame Login");

		f.setLayout(null);
		f.setSize(909,500);
		b.setBounds(400,400,200,100);
		f.setVisible(true);
		b.setVisible(true);
		f.add(b);
		 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
