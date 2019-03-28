import javax.swing.*;
import java.awt.*;

public class userFile 
{
    private JFrame base;
    private JPanel foreBase;
    private JButton logIn;
    private JButton createU;
    private JLabel user;
    private JLabel Pass;
    
    public userFile()
    {
        gui();
    }
    
    public void gui()
    {
        //base build
        base = new JFrame("userFile");
        base.setVisible(true);
        base.setSize(550,950);
        base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //panel build
        foreBase = new JPanel();
        foreBase.setBackground(Color.BLUE);
        
        //button build
        
        //labels build
        
        //text field build
        
        
        
        //adding panel to the frame
        base.add(foreBase);
        
        
        //adding buttons to the panel
        
        //adding labels to the panel
        
        //adding textfields to the panel
        
    }
    
    public static void main(String[] args)
    {
        new userFile();
        
    }
}
