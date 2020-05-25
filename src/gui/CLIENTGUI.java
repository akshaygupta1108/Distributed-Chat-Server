import javax.swing.*;  
import java.awt.event.*;
import java.io.IOException;  
import java.io.*;
import java.lang.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
public class CLIENTGUI implements ActionListener{  
    JTextField tf1,tf2,tf3;  
	JFrame f;
    JButton b1,b2;  
    CLIENTGUI(){  
        f= new JFrame("ADD CLIENT");  
        //JLabel label1 = new JLabel("Client Name");
        //label1.setBounds(50,50,150,20);
        JLabel label1 = new JLabel("CLIENT NAME");
	label1.setFont (label1.getFont ().deriveFont (20.0f));
        label1.setBounds(25,40,300,40);

        //tf1=new JTextField("");  
        //tf1.setBounds(350,50,150,20);
	tf1=new JTextField("");  
        tf1.setBounds(300,40,300,40);
	
	JLabel label3 = new JLabel("SERVER PORT");
	label3.setFont (label3.getFont ().deriveFont (20.0f));
        label3.setBounds(25,140,300,40);
	tf3=new JTextField("");  
        tf3.setBounds(300,140,300,40);

        //tf3.setEditable(false);   
	/*JLabel label4 = new JLabel("PUSH TO TALK");
	label4.setFont (label4.getFont ().deriveFont (20.0f));
        //label4.setBounds(50, 200, 150, 20);
	label4.setBounds(25,220,300,40);

        JLabel label5 = new JLabel("NUMPAD-(0)");
        //label5.setBounds(350,200,150,20);
	label5.setFont(label5.getFont ().deriveFont (20.0f));
        //label4.setBounds(50, 200, 150, 20);
	label5.setBounds(450,220,300,40);   */     

	b1=new JButton("Add CLIENT");  
        b1.setBounds(50,300,200,30);  
        JButton b2 = new JButton("BACK");
        b2.setBounds(385, 300, 200, 30);

	b1.setFont(new java.awt.Font("Ink Free", 1, 18));	
	b2.setFont(new java.awt.Font("Ink Free", 1, 18));        
  
        b1.addActionListener(this);  
        //b2.addActionListener(this); 
         
        b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
			f.dispose();
                        new Main();  
                    }  
                });  
         
	Color color1 = new Color(199, 212, 211);
        Color color2 = new Color(6, 69, 42);
	//heading.setForeground(color3);
	//heading1.setForeground(color3);
       	b1.setBackground(color1);
       	b2.setBackground(color1);
       	b1.setForeground(color2);
       	b2.setForeground(color2);
        f.add(label1);
        f.add(label3);
        /*f.add(label4);
        f.add(label5);*/
        f.add(tf1);f.add(tf3);f.add(b1);f.add(b2);  
        f.setSize(650,390);  
        f.add(new JLabel(new ImageIcon("client_page.png")));
	f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setLocationRelativeTo(null);
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e)   {  
        String Client_Name=tf1.getText();
        String Server_Port=tf3.getText(); 

        String str = "java -cp bin ChatClient "+Client_Name+" localhost "+Server_Port;
        System.out.println(str);
        try {
            Process proc = Runtime.getRuntime().exec(str);
            
            
            //Uncomment to see what's happening at the terminal
            
            /*
            BufferedReader reader =  
              new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = "";
            while((line = reader.readLine()) != null) {
                System.out.print(line + "\n");
            }

            proc.waitFor();
            */
            //OptionPane.showMessageDialog(f,"Client is Successfully Created\nClient Name: "+Client_Name+"\nHost Name: "+s2+"\nPasscode: "+Server_Port);
    
        }
        catch(Exception ex){
		JOptionPane.showMessageDialog(f,"Sorry, Client can not be added due to some error");
        }
    }  
    public static void main(String[] args) throws IOException , InterruptedException {  
        new CLIENTGUI();  
    }   
}
