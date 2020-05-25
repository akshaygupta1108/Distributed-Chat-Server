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
public class Main implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2;  
	JLabel heading;
	JLabel heading1;
    Main(){  
        JFrame f= new JFrame("Welcome To Distributed Chat Server"); 
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	f.setSize(600,455);
        // JLabel label1 = new JLabel("SERVER PORT");
        // label1.setBounds(50,50,150,20);
        
        // tf1=new JTextField("");  
        // tf1.setBounds(350,50,150,20);
        // JLabel label2 = new JLabel("Host Name");
        // label2.setBounds(50, 100, 150, 20);  
        // tf2=new JTextField("");  
        // tf2.setBounds(350,100,150,20);
        // JLabel label3 = new JLabel("PassCode");
        // label3.setBounds(50,150,150,20);  
        // tf3=new JTextField("");  
        // tf3.setBounds(350,150,150,20);  
        //tf3.setEditable(false);   
        // JLabel label4 = new JLabel("Push to talk");
        // label4.setBounds(50, 200, 150, 20);
        // JLabel label5 = new JLabel("NUMPAD-(0)");
        // label5.setBounds(350,200,150,20);
	heading = new JLabel("Welcome To Distributed");
	heading1 = new JLabel("Chat Server");
	heading.setBounds(100,50,400,100);
	heading1.setBounds(200,150,400,100);
        b1=new JButton("Add SERVER");  
        //b1.setBounds(100,100,150,40);
 	b1.setBounds(25,300,200,30);
               
	

        //JButton b2=new JButton("-");  
        // b2.setBounds(120,200,50,50);  
        
        
        JButton b2 = new JButton("Add CLIENT");

        //b2.setBounds(100,200 , 150, 40);
	b2.setBounds(360,300,200,30);
	
	b1.setFont(new java.awt.Font("Ink Free", 1, 18));	
	b2.setFont(new java.awt.Font("Ink Free", 1, 18));
        heading.setFont(new java.awt.Font("Ink Free", 1, 27));
	heading1.setFont(new java.awt.Font("Ink Free", 1, 27));
	
	b1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
			f.dispose();
                        new SERVERGUI();  
                    }  
                });  
        b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
			f.dispose();
                        new CLIENTGUI();  
                    }  
                });  
          
        //f.add(label1);
        //f.add(label2);
        //f.add(label3);
        //f.add(label4);
        //f.add(label5);
        //f.add(tf1);
        //f.add(tf2);
        //f.add(tf3);
	Color color3 = new Color(0, 0, 0);
        Color color1 = new Color(199, 212, 211);
        Color color2 = new Color(6, 69, 42);
	heading.setForeground(color3);
	heading1.setForeground(color3);
       	b1.setBackground(color1);
       	b2.setBackground(color1);
       	b1.setForeground(color2);
       	b2.setForeground(color2);
        f.add(b1);
        f.add(b2);  
	f.add(heading);  
	f.add(heading1);  
	f.add(new JLabel(new ImageIcon("front_page.png")));
        f.setResizable(false);
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
            
            


        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }  
    public static void main(String[] args) throws IOException , InterruptedException {  
        new Main();  
    }   
}
