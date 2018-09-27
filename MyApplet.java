/*<applet code="MyApplet" width=700 height=500></applet>*/
import java.awt.*; // class for font java.awt.Font;
import java.awt.event.*;	
import java.applet.*;
public class MyApplet extends Applet implements ActionListener
{
	Button r,g,y;
	TextField t;
	public void init()
	{
		//drawRect(10,10,80,30);
		Font f=new Font("Avial",Font.BOLD,15);
		
		t=new TextField();
		Label l =new Label("Select");
		r=new Button("Red");
		g=new Button("Green");
		Color c=new Color(170,80,52);
		//setBackground(Color.blue);
		setLayout(new BorderLayout());

		setBackground(c);
		t.setForeground(c);
		t.setBackground(Color.yellow);
		r.setForeground(c);
		
		//y=new Button("Yellow");		
		
		//r.addActionListener(this);
		g.addActionListener(this);
		//l.setBounds(10,15,85,30);
		//t.setBounds(130,15,85,30);
		//r.setBounds(10,100,85,30);
		//g.setBounds(130,100,85,30);
	t.setFont(f);
		//l.setFont(f);
		g.setFont(f);
	add(l,BorderLayout.NORTH);
	add(t,BorderLayout.SOUTH);
	add(r,BorderLayout.EAST);
	add(g,BorderLayout.WEST);

	}

	public void actionPerformed(ActionEvent ae)
	{
		String m=ae.getActionCommand();
		t.setText(m);
		Object ot=ae.getSource();
		if(ot==r)
			{
				setBackground(Color.red);
			}
		else
			setBackground(Color.GREEN);
	}
}

