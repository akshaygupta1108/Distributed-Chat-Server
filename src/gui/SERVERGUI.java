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
public class SERVERGUI implements ActionListener{  
    JTextField tf1,tf2,tf3;  
	JFrame f;
    JButton b1,b2;  
    SERVERGUI(){  
        f= new JFrame("ADD SERVER");  
        JLabel label1 = new JLabel("SERVER PORT");
	label1.setFont (label1.getFont ().deriveFont (20.0f));
        label1.setBounds(25,40,300,40);
	
        
        tf1=new JTextField("");  
        tf1.setBounds(300,40,300,40);
        // JLabel label2 = new JLabel("Host Name");
        // label2.setBounds(50, 100, 150, 20);  
        // tf2=new JTextField("");  
        // tf2.setBounds(350,100,150,20);
        // JLabel label3 = new JLabel("PassCode");
        // label3.setBounds(50,150,150,20);  
        // tf3=new JTextField("");  
        // tf3.setBounds(350,150,150,20);  
        //tf3.setEditable(false);   
        /*JLabel label4 = new JLabel("PUSH TO TALK");
	label4.setFont (label4.getFont ().deriveFont (20.0f));
        //label4.setBounds(50, 200, 150, 20);
	label4.setBounds(25,200,300,40);

        JLabel label5 = new JLabel("NUMPAD-(0)");
        //label5.setBounds(350,200,150,20);
	label5.setFont(label5.getFont ().deriveFont (20.0f));
        //label4.setBounds(50, 200, 150, 20);
	label5.setBounds(450,200,300,40);*/

        b1=new JButton("Add SERVER");  
        b1.setBounds(50,300,200,30);  
        JButton b2 = new JButton("BACK");
        b2.setBounds(385, 300, 200, 30);

	b1.setFont(new java.awt.Font("Ink Free", 1, 18));	
	b2.setFont(new java.awt.Font("Ink Free", 1, 18));

        // b2=new JButton("-");  
        // b2.setBounds(120,200,50,50);  
        b1.addActionListener(this);  
        //b2.addActionListener(this);  
         
        b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
			f.dispose();
                        new Main();  
                    }  
                });  
        
        f.add(label1);
        //f.add(label2);
        //f.add(label3);
        //f.add(label4);
        //f.add(label5);
        f.add(tf1);
        //f.add(tf2);
        //f.add(tf3);
	Color color1 = new Color(199, 212, 211);
        Color color2 = new Color(6, 69, 42);
	//heading.setForeground(color3);
	//heading1.setForeground(color3);
       	b1.setBackground(color1);
       	b2.setBackground(color1);
       	b1.setForeground(color2);
       	b2.setForeground(color2);
        f.add(b1);
        f.add(b2);  
        f.setSize(650,390);  
        f.add(new JLabel(new ImageIcon("server_page.jpg")));
	f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setLocationRelativeTo(null);
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e)   {  
        String Server_Name=tf1.getText();  
        //String s2=tf2.getText(); 
        //String Server_Port=tf3.getText(); 

        String str = "java -cp bin ChatServer "+Server_Name;
        System.out.println(str);
        try {
            Process proc = Runtime.getRuntime().exec(str);

            
            
            //Uncomment this to see what's happening at the terminal
            
            
            /*
            BufferedReader reader =  
              new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = "";
            while((line = reader.readLine()) != null) {
                System.out.print(line + "\n");
            }

            proc.waitFor();
            */
            JOptionPane.showMessageDialog(f,"Server is Successfully Created\nServer Port: "+Server_Name);


        }
        catch(Exception ex){
		JOptionPane.showMessageDialog(f,"Sorry, Server can not be created due to some error");
        }
    }  
    public static void main(String[] args) throws IOException , InterruptedException {  
        new SERVERGUI();  
    }   
}
