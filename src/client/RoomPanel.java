import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
public class RoomPanel extends JPanel {

    private int roomId;
    private Dimension dimension;
    private JScrollPane scrollPane;
    private JTextArea chatWindow;
    private JList<String> userList;

    public RoomPanel(int roomId, int width, int height) {
        this.dimension = new Dimension(width, height);
        initComponents();
        this.roomId = roomId;
        this.setPreferredSize(this.dimension);
    }

    private void initComponents() {
	//this.add(new JLabel(new ImageIcon("chat3.png")));
        //this.chatWindow = new JTextArea();
	this.chatWindow = new MyTextArea();
	this.chatWindow.setFont(this.chatWindow.getFont().deriveFont(14.0f));
        Color color1 = new Color(255,255,255);
        this.chatWindow.setFont(new java.awt.Font("Ink Free", 1, 18));
        this.chatWindow.setForeground(color1);
        //this.chatWindow.setBackground(color1);
	this.chatWindow.setBackground(new Color(1,1,1, (float) 0.01));
        this.chatWindow.setEditable(false);
        this.chatWindow.setLineWrap(true);

        this.scrollPane = new JScrollPane(chatWindow);
        this.scrollPane.setPreferredSize(this.dimension);
        this.scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.add(scrollPane);
    }

    public void append(String message) {
        this.chatWindow.append(message);
        JScrollBar sb = this.scrollPane.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());
    }
}
class MyTextArea extends JTextArea {

    private Image img;

    public MyTextArea() {
        //super(a,b);
        try{
            img = ImageIO.read(new File("chat_page.jpg"));
        } catch(IOException e) {
            System.out.println(e.toString());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img,0,0,null);
        super.paintComponent(g);
    }
}
