import java.awt.*;
import java.lang.Exception;
class LoginForm
{
	LoginForm
	{
		LoginFrame f=new LoginFrame();
		Label usernamelabel=new Label("user name");
		Label userpwdlabel=new Label("password");
		
		TextField usermanetext=new TextField("user name");
		TextField userpwdtext=new TextField("passworb");

		Button userlogin=new Button("Login");
		Button userforgetpwd= new Button("forget password");

		Panel p=new Panel(new GridLayout(3,1));
		p.add(usernamelabel);
		p.add(usermanetext);
		p.add(userpwdlabel);
		p.add(userpwdtext);
		p.add(userlogin);
		p.add(userforgetpwd);
		p.add(userforgetpwd);
		
		f.add(p,BoardLayout.CENTER);

		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(new GridLayout(1,1));
		f.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
	public static void main(String args[])
	{
		LoginForm lf=new LoginForm();                                      
	}	
}