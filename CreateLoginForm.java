import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class CreatLoginForm
{
	Frame f;
	Button logbutton,cacbutton;
	Label userlabel,passlabel;
	TextField textfield1,textfield2;
	Panel newp;
	CreatLoginForm()
	{
		f=new Frame("Login Form");
		logbutton=new Button("Login");
		cacbutton=new Button("cancel");
		userlabel=new Label("Enter the user name");
		passlabel=new Label("enter the password");
		textfield1=new TextField(15);
		textfield2=new TextField(15);

		newp=new Panel(new GridLayout(3,1));

		newp.add(userlabel);
		newp.add(textfield1);
		newp.add(passlabel);
		newp.add(textfield2);
		newp.add(logbutton);
		newp.add(cacbutton);

		//newp.setsize(700,250);
		f.add(newp,BorderLayout.CENTER);
		f.setSize(300,300);
		f.setLayout(new GridLayout(1,1));
		f.setVisible(true);	
	}
	//public void windowClosing(WindowE
	public static void main(String args[])
	{
		CreatLoginForm c=new CreatLoginForm();	
	}
		
}
