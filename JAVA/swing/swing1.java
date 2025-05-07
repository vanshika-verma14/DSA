import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;

public class swing1 {
public static void main(String[] args) {

ImageIcon mimg = new ImageIcon("imm.png");
Image scaledImage = mimg.getImage().getScaledInstance(120, 120 , Image.SCALE_SMOOTH);
ImageIcon img = new ImageIcon(scaledImage);

JLabel lbl = new JLabel();
lbl.setText("hello my name is vanshika");
lbl.setIcon(img);
lbl.setHorizontalTextPosition(JLabel.CENTER);
lbl.setVerticalTextPosition(JLabel.TOP);





// myfrm frm = new myfrm();
JFrame frm = new JFrame();
frm.setSize(500,500);
frm.setTitle("hello");
frm.setVisible(true);
frm.add(lbl);


}
}




// frm.setTitle("hello");
// frm.setVisible(true);
// frm.setSize(420,420);
// frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application  or   do nothing on close to not to close even after clicking cross 
// frm.setResizable(false); //no longer resize frame
// // ImageIcon img = new ImageIcon(); //
// // frm.setIconImage(img.getImage());

// frm.getContentPane().setBackground(new Color(123,16,171));
