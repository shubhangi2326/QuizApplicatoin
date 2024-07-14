
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score)
    {
       setBounds(400,150,750,550);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
   ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/th.jpg"));
    Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
    ImageIcon i3 =  new ImageIcon(i2);
   JLabel image = new JLabel(i3);
       image.setBounds(0,200,300,250);
        add(image);  
        
            JLabel heading= new JLabel("Thankyou" + name + " for playing Simple Minds");
           heading.setBounds(45, 30, 700, 30);
           heading.setFont(new Font("Tahoma",Font.PLAIN,26));
           add(heading);
           
           JLabel lblscore= new JLabel("Your score is " + score);
           lblscore.setBounds(305, 200, 300, 30);
           lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
           add(lblscore);
           
       JButton sumit=new JButton("Play Again");
        sumit.setBounds(380,270,120,30);
        sumit.setBackground(new Color(30,144,255));
        sumit.setForeground(Color.WHITE);
        sumit.addActionListener(this);
       add(sumit);

           setVisible(true);
   }
     @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(true);
        new Login();
    }
    public static void main(String [] args)
    {
        new Score("User",0);
    }
}

   
    

