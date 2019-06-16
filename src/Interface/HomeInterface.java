package Interface;

import javax.swing.*;
import java.awt.*;

public class HomeInterface {

    JFrame jFrame ;
    JButton button1;
    JButton button2;

    public void CreateHI(){
        jFrame = new JFrame("学生通讯录");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(500,500);
        jFrame.setLocation(600,400);

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        jPanel.setLayout(null);

        Font fnt = new Font("楷体",Font.PLAIN,24);
        button1 = new JButton("学生");
        button1.setBounds(190,140,120,40);
        button1.setBackground(Color.lightGray);
        button1.setFont(fnt);
        jPanel.add(button1);

        button2 = new JButton("管理员");
        button2.setBounds(190,230,120,40);
        button2.setBackground(Color.lightGray);
        button2.setFont(fnt);
        jPanel.add(button2);

        jFrame.setVisible(true);
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public static void main(String [] args){
        HomeInterface h = new HomeInterface();
        h.CreateHI();
    }
}
