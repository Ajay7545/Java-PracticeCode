import javax.swing.*;
import java.awt.event.*;

public class Lambda1
{
	public static void main(String[] args) 
	{
		new Thread(new Runnable()
		{
			public void run()
			{System.out.println("Before 8");}


	}).start();
 
	new Thread(()->System.out.println("Since 8")).start();

	JButton b=new JButton("");
	b.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			System.out.println(" ");
		}

	});
	b.addActionListener((m)->{System.out.println(" ");});

	}
}