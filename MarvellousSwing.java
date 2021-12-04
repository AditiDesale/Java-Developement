import javax.swing.*;  

class Demo 
{  
	Demo()
	{  

		JFrame f = new JFrame("Marvellous Swing");  
		  
		JLabel SName = new JLabel("Students Name");  
		SName.setBounds(20, 50, 120, 20);  
		  
		JLabel BName = new JLabel("Batch Name");  
		BName.setBounds(20, 80, 120, 20);  
		  
		JTextField SNameTF = new JTextField();  
		SNameTF.setBounds(140, 50, 100, 20);  
		  
		JTextField BNameTF = new JTextField();  
		BNameTF.setBounds(140, 80, 100, 20);  
		  
		JButton sbmt = new JButton("Submit");  
		sbmt.setBounds(20, 160, 100, 30);  
		  
		JButton reset = new JButton("Reset");  
		reset.setBounds(120,160,100,30);  
		  
		f.add(SName);  
		f.add(BName);  
		f.add(SNameTF);  
		f.add(BNameTF);  
		f.add(sbmt);  
		f.add(reset);  
		  
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);  
	}  
}

class MarvellousSwing
{  
	public static void main(String[] args) 
	{  
		Demo s = new Demo();  
	}  
}  