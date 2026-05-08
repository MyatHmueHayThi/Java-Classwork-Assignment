package chapter13Exe;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class JCheckBoxTesting extends JFrame implements ActionListener {
	    JCheckBox chkOnion, chkMush, chkSau;
	    JButton btnOk;
	    Container Co;

	    public JCheckBoxTesting() {
	     
	        chkOnion = new JCheckBox("Onion");
	        chkMush = new JCheckBox("Mushroom");
	        chkSau = new JCheckBox("Sausage");
	        btnOk = new JButton("OK");

	        Co = getContentPane();
	        Co.setLayout(new FlowLayout());

	      
	        Co.add(chkOnion);
	        Co.add(chkMush);
	        Co.add(chkSau);
	        Co.add(btnOk);

	        btnOk.addActionListener(this);

	        
	        this.setTitle("JCheckBox Test");
	        this.setLocation(100, 100);
	        this.setSize(450, 150);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        String str = ""; 
	        
	        if (e.getSource() == btnOk) {
	            
	            if (chkOnion.isSelected()) { str = str + " Onion\n"; }
	            if (chkMush.isSelected()) { str = str + " Mushroom\n"; }
	            if (chkSau.isSelected()) { str = str + " Sausage\n"; }

	            
	            if (str.equals("")) {
	                JOptionPane.showMessageDialog(null, "Your order has no topping", "Your Order", JOptionPane.INFORMATION_MESSAGE);
	            } else {
	                JOptionPane.showMessageDialog(this, "You ordered:\n" + str, "Your Order", JOptionPane.INFORMATION_MESSAGE);
	            }

	            chkOnion.setSelected(false);
	            chkMush.setSelected(false);
	            chkSau.setSelected(false);
	        }
	    }

	    public static void main(String[] args) {
	        new JCheckBoxTesting();
	    }
	}

