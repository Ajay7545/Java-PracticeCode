import javax.swing.*;
import java.awt.event.*;

public class Anonymous

{
	public static void main(String[] args) 
	{
		new Thread(new Runnable()
		{
			public void run()
			{System.out.print("Till 7");}
		}).start();
		
JButton b=new JButton("");
b.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent ae)
	{
	}
});

	}
}
