package chapter13Exe;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class JRadioButtonTest extends JFrame implements ActionListener {
	    JLabel lblMajor;
	    JRadioButton rdoCt, rdoCs;
	    JButton btnOk, btnCancel;
	    ButtonGroup bg;
	    Container C;

	    public JRadioButtonTest() {
	        lblMajor = new JLabel("Major");
	        rdoCt = new JRadioButton("CT", false);
	        rdoCs = new JRadioButton("CS", false);
	        btnOk = new JButton("OK");
	        btnCancel = new JButton("Cancel");

	        C = getContentPane();
	        C.setLayout(new FlowLayout());

	        C.add(lblMajor);
	        C.add(rdoCt);
	        C.add(rdoCs);
	        bg = new ButtonGroup(); 
	        bg.add(rdoCt);
	        bg.add(rdoCs);

	        C.add(btnOk);
	        C.add(btnCancel);

	  
	        btnOk.addActionListener(this);
	        btnCancel.addActionListener(this);

	        
	        this.setSize(400, 200);
	        this.setTitle("JRadioButton Test");
	        this.setLocation(100, 100);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnOk) {
	            String msg = "No major selected.";
	            
	            if (rdoCt.isSelected()) {
	                msg = "Major is CT.";
	            } else if (rdoCs.isSelected()) {
	                msg = "Major is CS.";
	            }
	            
	            JOptionPane.showMessageDialog(null, msg);
	        } 
	        else if (e.getSource() == btnCancel) {
	           
	            bg.clearSelection();
	        }
	    }

	    public static void main(String[] args) {
	        new JRadioButtonTest();
	    }
	}

