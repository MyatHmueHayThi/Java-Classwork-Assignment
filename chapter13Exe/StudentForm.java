package chapter13Exe;

	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;

	public class StudentForm extends JFrame implements ActionListener {
	    JLabel lblName, lblRno, lblMajor, lblAddr, lblInterest;
	    JButton btnRegister, btnReset;
	    JCheckBox chkGame, chkTravel, chkPlay;
	    JTextField txtName, txtRno;
	    JPanel mainPanel, buttonPanel, majorPanel, interestPanel;
	    JTextArea txtAddr;
	    JScrollPane scroll;
	    JRadioButton rdoCt, rdoCs;
	    ButtonGroup bg;

	    public StudentForm() {
	       
	        lblName = new JLabel("Student Name");
	        lblRno = new JLabel("Roll Number");
	        lblMajor = new JLabel("Major");
	        lblAddr = new JLabel("Address");
	        lblInterest = new JLabel("Interest");
	        txtName = new JTextField(20);
	        txtRno = new JTextField(20);
	        txtAddr = new JTextArea(5, 10);
	        scroll = new JScrollPane(txtAddr);

	        // Radio Buttons (Major)
	        rdoCt = new JRadioButton("CT", false);
	        rdoCs = new JRadioButton("CS", false);
	        bg = new ButtonGroup();
	        bg.add(rdoCt);
	        bg.add(rdoCs);

	        chkGame = new JCheckBox("Gaming");
	        chkTravel = new JCheckBox("Travelling");
	        chkPlay = new JCheckBox("Playing");

	        btnRegister = new JButton("Register");
	        btnReset = new JButton("Reset");

	        majorPanel = new JPanel();
	        majorPanel.add(rdoCt);
	        majorPanel.add(rdoCs);

	        interestPanel = new JPanel();
	        interestPanel.add(chkGame);
	        interestPanel.add(chkTravel);
	        interestPanel.add(chkPlay);

	        mainPanel = new JPanel();
	        mainPanel.setLayout(new GridLayout(5, 2));
	        mainPanel.add(lblName); mainPanel.add(txtName);
	        mainPanel.add(lblRno); mainPanel.add(txtRno);
	        mainPanel.add(lblMajor); mainPanel.add(majorPanel);
	        mainPanel.add(lblAddr); mainPanel.add(scroll);
	        mainPanel.add(lblInterest); mainPanel.add(interestPanel);

	        buttonPanel = new JPanel();
	        buttonPanel.add(btnRegister);
	        buttonPanel.add(btnReset);

	        // Content Pane setup
	        Container contentPane = this.getContentPane();
	        contentPane.add(mainPanel, BorderLayout.CENTER);
	        contentPane.add(buttonPanel, BorderLayout.SOUTH);

	        btnRegister.addActionListener(this);
	        btnReset.addActionListener(this);

	        // Window Settings
	        this.setTitle("Student Registration Form");
	        this.setLocation(100, 100);
	        this.setSize(600, 400); // Size ကို အနည်းငယ်ချဲ့ပေးထားပါတယ်
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnRegister) {
	            String name = txtName.getText();
	            String rno = txtRno.getText();
	            String addr = txtAddr.getText();
	            
	            String major = "";
	            if (rdoCt.isSelected()) major = "CT";
	            if (rdoCs.isSelected()) major = "CS";

	            String interest = "";
	            if (chkGame.isSelected()) interest += "Gaming ";
	            if (chkTravel.isSelected()) interest += "Travelling ";
	            if (chkPlay.isSelected()) interest += "Playing ";

	            String message = "Name : " + name + 
	                             "\nRoll No : " + rno + 
	                             "\nMajor : " + major + 
	                             "\nAddress : " + addr + 
	                             "\nInterest : " + interest;

	            JOptionPane.showMessageDialog(null, message, "Student Information", JOptionPane.INFORMATION_MESSAGE);
	        } 
	        else if (e.getSource() == btnReset) {
	            txtName.setText("");
	            txtRno.setText("");
	            txtAddr.setText("");
	            chkGame.setSelected(false);
	            chkTravel.setSelected(false);
	            chkPlay.setSelected(false);
	            bg.
	            clearSelection(); 
	        }
	    }

	    public static void main(String[] args) {
	        new StudentForm();
	    }
	}

