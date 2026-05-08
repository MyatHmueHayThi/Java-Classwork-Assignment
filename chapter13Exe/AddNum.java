package chapter13Exe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AddNum extends JFrame implements ActionListener{
	JLabel lblNum1,lblNum2;
	JTextField txtNum1,txtNum2;
	JButton btnAdd,btnClear;
	Container con;
	
	public AddNum() {
		lblNum1= new JLabel("Number1");
		lblNum2= new JLabel("Number2");
		txtNum1= new JTextField (10);
		txtNum2= new JTextField (10);
		btnAdd = new JButton("Add");
		btnClear = new JButton("Clear");
		
		con=this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lblNum1);	con.add(lblNum2);
		con.add(txtNum1);	con.add(txtNum1);
		con.add(btnAdd);	con.add(btnClear);

		btnAdd.addActionListener(this);
		btnClear.addActionListener(this);
		
		this.setSize(400,300);
		this.setTitle("Sum of two number");
		this.setLocation(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String [] args) {
		new AddNum();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAdd) {
			int num1 = Integer.parseInt(txtNum1.getText());
			int num2 = Integer.parseInt(txtNum2.getText());
			int sum=num1+num2;
			JOptionPane.showMessageDialog(null,"Addition two numbers is "+sum);
			
			
		}
		else if(e.getSource()==btnClear) {
			txtNum1.setText(""); txtNum2.setText("");
		}
		
	}

}
