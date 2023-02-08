import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator// implements ActionListener
{
JFrame f;
JTextField tf1,tf2,restf;
JLabel l1,l2;
JButon btnadd,btnsub,btnmul,btndiv,btnmod;
JPanel p;
Calculator()
{
f=new JFrame("calculaqtor");
tf1=new JTextField();
tf2=new JTextField();
f.setSize(800,200);
f.setlayout(new GridLayout(1,1));
f.setVisible(true);
f.setDefaultclosepOeration(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
Calculator c=new Calculator();
}
}
 


