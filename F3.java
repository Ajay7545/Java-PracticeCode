package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JDialog implements ActionListener
{
	private JTextField u;
	private JPasswordField p;
	private JButton submit;
	private JButton cancel;

	public Login() 
	{
		setFont(new Font("Dialog", Font.BOLD, 13));
		setTitle("LOGIN....");
		getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("Username");
		lblUserName.setFont(new Font("Yu Gothic Medium", Font.BOLD | Font.ITALIC, 13));
		lblUserName.setBounds(32, 32, 79, 22);
		getContentPane().add(lblUserName);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(32, 79, 79, 16);
		getContentPane().add(lblNewLabel);
		
		u = new JTextField();
		u.setBounds(144, 33, 199, 20);
		getContentPane().add(u);
		u.setColumns(10);
		
		p = new JPasswordField();
		p.setForeground(Color.GRAY);
		p.setBounds(144, 79, 199, 20);
		getContentPane().add(p);
		
		submit = new JButton("  Login");
		submit.setMnemonic('L');
		submit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		submit.setBounds(92, 143, 89, 23);
		getContentPane().add(submit);
		
		cancel = new JButton("  Cancel");
		cancel.setMnemonic('C');
		cancel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		cancel.setBounds(230, 143, 89, 23);
		getContentPane().add(cancel);
		submit.addActionListener(this);
		cancel.addActionListener(this);
		setSize(400,278);
		setLocationRelativeTo(null);
		getRootPane().setDefaultButton(submit);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Login();

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object ob = e.getSource();
		if(ob==cancel)
		{
			System.exit(0);
		}
		else if(ob == submit)
		{
			String user = u.getText();
			String pass = new String(p.getPassword());
//			String s= "select * from login where username LIKE ? and password LIKE ?";
			String s= "select * from login";
			Connection con = MyConnection.connect();
			try
			{
				PreparedStatement ps = con.prepareStatement(s);
				//ps.setString(1,user);
				//ps.setString(2,pass);
				ResultSet rs= ps.executeQuery();
				//if(rs.next())
				int cnt=0;
				while(rs.next())
				{
					String q = rs.getString("username");
					String w = rs.getString("password");
					if(q.equals(user) && w.equals(pass))
					{	
						++cnt;
						new HomePage();
						dispose();
					}
					
				}
				if(cnt==0)
				{
						p.setText("");
						u.setText("");
						JOptionPane.showMessageDialog(null,"Invalid");
						u.requestFocusInWindow();
				}
			}
			catch (SQLException se)
			{
				se.printStackTrace();
			}
		}
	}
}
