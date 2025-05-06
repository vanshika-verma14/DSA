import javax.swing.JFrame;
import java.awt.Color;

public class myfrm extends JFrame{

myfrm(){
this.setTitle("hello");
this.setVisible(true);
this.setSize(420,420);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application  or   do nothing on close to not to close even after clicking cross 
this.setResizable(false); //no longer resize frame
// ImageIcon img = new ImageIcon(); //
// this.setIconImage(img.getImage());

this.getContentPane().setBackground(new Color(123,16,171));
}}