package os;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Log extends JFrame {

public static void main(String[] args) {
Log frameTabel = new Log();
}

JButton blogin = new JButton("Login");
JButton btnReset = new JButton("Reset");

JPanel panel = new JPanel();
//JLabel label = new JLabel("Name: ");
JTextField txuser = new JTextField("",15);

JPasswordField pass = new JPasswordField("", 15);


public Log(){
super("Login Autentification");
setSize(487,292);
setLocation(450,280);
panel.setLayout (null);


txuser.setBounds(239,51,102,20);
pass.setBounds(239,82,102,20);
blogin.setBounds(139,143,80,20);

panel.add(blogin);

panel.add(txuser);
//label.setLabelFor(txuser);
panel.add(pass);

getContentPane().add(panel);
JLabel lblMiniOs = new JLabel("MINI OS");
lblMiniOs.setBounds(202, 12, 47, 28);
panel.add(lblMiniOs);
btnReset.setBounds(229, 143, 80, 20);
panel.add(btnReset);
JLabel lblUsername = new JLabel("USERNAME");
lblUsername.setBounds(126, 51, 114, 20);
panel.add(lblUsername);
JLabel lblPassword = new JLabel("PASSWORD");
lblPassword.setBounds(126, 82, 69, 20);
panel.add(lblPassword);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
actionlogin();
actionreset();
}

public void actionreset(){
btnReset.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent ae) {
		txuser.setText("");
		pass.setText("");
	}
});
}

public void actionlogin(){
blogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
    
String puname = txuser.getText();
String ppaswd = pass.getText();
if(puname.equals("mini-os") && ppaswd.equals("rockk")) {
//newframe regFace =new newframe();
//regFace.setVisible(true);
other.main(null);
dispose();
} else {

JOptionPane.showMessageDialog(null,"Wrong Password / Username");
//txuser.setText("Enter User name ");
//pass.setText("Password");
txuser.requestFocus();
}

}
});
}
}