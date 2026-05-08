package chapter13Exe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CheckPosNeg extends JFrame implements ActionListener {
	JLabel lblNum;
	JTextField txtNum;
	JButton btnCheck;
	Container con;
	
	public CheckPosNeg() {
		lblNum = new JLabel("Number");
		txtNum = new JTextField(10);
		btnCheck = new JButton("Check");
		con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lblNum);con.add(txtNum);
		con.add(btnCheck);
		
		btnCheck.addActionListener(this);
		this.setTitle("Check Positive or Negative");
		this.setSize(300,200);
		this.setLocation(200,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String [] args) {
		new CheckPosNeg();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnCheck) {
			int num = Integer.parseInt(txtNum.getText());
			if (num>0) {
				JOptionPane.showMessageDialog(null,num + " positive number.");

			}
			else if (num<0) {
				JOptionPane.showMessageDialog(this, num+" negative number.");
			}
		}
		
	}

}
