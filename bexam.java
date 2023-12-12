import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener.*;
class bexam implements ActionListener
{
	double ans=0,a1=0,b1=0; 
	JTextField area;
	JButton a,b,c,d,d1,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u;
	JFrame f;
	JLabel label ;

 int number;
	static int cal=0;
	bexam(){
	label=new JLabel();
	f=new JFrame("Calculator");	
	area=new JTextField();
 	b=new JButton("/");
	c=new JButton("*");
	d=new JButton("-");
   d1=new JButton("+");
	g=new JButton("=");
	a=new JButton("1");
	 h=new JButton("2");
	 i=new JButton("3");
	 j=new JButton("4");
	 k=new JButton("5");
	 l=new JButton("6");
	 m=new JButton("7");
	 n=new JButton("8");
	 o=new JButton("9");
	 p=new JButton("0");
	 q=new JButton(".");
	 r=new JButton("+/-");
	 s=new JButton("c");
	 t=new JButton("%");
	 u=new JButton("x");
	area.setBounds(60,80,100,100);
//	area.setEditable(false);
	u.setBounds(220,160,70,30);
	b.setBounds(300,160,70,30);
	c.setBounds(300,200,70,30);
	d.setBounds(300,240,70,30);
	d1.setBounds(300,280,70,30);
	g.setBounds(300,320,70,30);
	a.setBounds(60,280,70,30);
	h.setBounds(140,280,70,30);
	i.setBounds(220,280,70,30);
	j.setBounds(60,240,70,30);
	k.setBounds(140,240,70,30);
	l.setBounds(220,240,70,30);
	m.setBounds(60,200,70,30);
	n.setBounds(140,200,70,30);
	o.setBounds(220,200,70,30);
	p.setBounds(140,320,70,30);
	q.setBounds(220,320,70,30);
	r.setBounds(60,320,70,30);
	s.setBounds(60,160,70,30);
	t.setBounds(140,160,70,30);
	f.add(u);
	f.add(label);
	f.add(t);
	f.add(b);	
	f.add(c);
	f.add(d);
	f.add(d1);
	f.add(g);
	f.add(a);
	f.add(h);
	f.add(i);
	f.add(j);
	f.add(k);
	f.add(l);
	f.add(m);
	f.add(n);
	f.add(o);
	f.add(p);
	f.add(q);
	f.add(r);
	f.add(s);
	f.add(area);
	f.setSize(400,400);
	area.setSize(310,40);
	label.setSize(100,100);
	// label.setEnabled(true);
	f.setLayout(null);
	f.setVisible(true);
	//
	f.setResizable(true);
	f.setResizable(false);
	g.addActionListener(this);
	b.addActionListener( this);
	a.addActionListener(this);
	c.addActionListener(this);
	d.addActionListener(this);
	d1.addActionListener(this);
	h.addActionListener(this);
	i.addActionListener(this);
	j.addActionListener(this);
	k.addActionListener(this);
	l.addActionListener(this);
	m.addActionListener(this);
	n.addActionListener(this);
	o.addActionListener(this);
	p.addActionListener(this);
	q.addActionListener(this);
	r.addActionListener(this);
	s.addActionListener(this);
	t.addActionListener(this);
	u.addActionListener(this);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==a)
	area.setText(area.getText().concat("1"));
	if(e.getSource()==h)
	area.setText(area.getText().concat("2"));
	if(e.getSource()==i)
	area.setText(area.getText().concat("3"));
	if(e.getSource()==j)
	area.setText(area.getText().concat("4"));
	if(e.getSource()==k)
	area.setText(area.getText().concat("5"));
	if(e.getSource()==l)
	area.setText(area.getText().concat("6"));
	if(e.getSource()==m)
	area.setText(area.getText().concat("7"));
	if(e.getSource()==n)
	area.setText(area.getText().concat("8"));
	if(e.getSource()==o)
	area.setText(area.getText().concat("9"));
	if(e.getSource()==p)
	area.setText(area.getText().concat("0"));
	if(e.getSource()==q)
	area.setText(area.getText().concat("."));
	if(e.getSource()==d1){   //d1="+"
		a1=Double.parseDouble(area.getText());
		cal=1;
		area.setText("");
		label.setText(a1+"+");
	}
	if(e.getSource()==d){
		a1=Double.parseDouble(area.getText());
		cal=2;
		area.setText("");
		label.setText(a1+"-");
	}
	if(e.getSource()==c){
		a1=Double.parseDouble(area.getText());
		cal=3;
		area.setText("");
		label.setText(a1+"*");
		
	}
	if(e.getSource()==b){
		a1=Double.parseDouble(area.getText());
		cal=4;
		area.setText("");
		label.setText(a1+"/");
	}
	if(e.getSource()==t){
		a1=Double.parseDouble(area.getText());
		cal=5;
		area.setText("");
		label.setText(a1+"%");
	}
	if(e.getSource()==s){
		label.setText("");
		area.setText("");
		//ans=0;
	}
	if(e.getSource()==g){ //g="="
			b1=Double.parseDouble(area.getText());
		switch(cal){
			case 1: ans=a1+b1;
					area.setText(a1+"+"+b1+"="+ans);
			//a1=ans;
			break;
			case 2: ans=a1-b1;
					area.setText(a1+"-"+b1+"="+ans);
			break;
			case 3: ans=a1*b1;
					area.setText(a1+"*"+b1+"="+ans);
			break;
			case  4: ans=a1/b1;
					area.setText(a1+"/"+b1+"="+ans);
			break;
			case 5: ans=a1%b1;
					area.setText(a1+"%"+b1+"="+ans);
			break;
			default: ans=0;
		}
	}
		if(e.getSource()==u){
		String del=area.getText();
		area.setText("");
		for(int i1=0; i1<del.length()-1; i1++)
		area.setText(area.getText()+del.charAt(i1));
	}
	}
	public static void main(String args[])
	{
		new bexam();
	}
}