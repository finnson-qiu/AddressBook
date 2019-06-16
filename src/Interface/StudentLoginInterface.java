package Interface;

import javax.swing.*;
import java.awt.*;

public class StudentLoginInterface {
    JFrame jFrame;

    JButton button1;
    JButton button2;
    JTextField textField1;
    JTextField textField2;
    JLabel label3;

    public void CreateFrame(){
        jFrame = new JFrame("登陆");
        jFrame.setLocation(600,300);
        jFrame.setSize(500,500);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jFrame.add(jPanel);

        Font fnt = new Font("楷体",Font.PLAIN,22);
        JLabel label1 = new JLabel("学号：");
        label1.setBounds(80,80,80,30);
        label1.setFont(fnt);
        jPanel.add(label1);

        textField1 = new JTextField();
        textField1.setFont(fnt);
        textField1.setBounds(160,80,220,35);
        jPanel.add(textField1);

        JLabel label2 = new JLabel("密码：");
        label2.setBounds(80,160,80,30);
        label2.setFont(fnt);
        jPanel.add(label2);

        textField2 = new JTextField();
        textField2.setFont(fnt);
        textField2.setBounds(160,160,220,35);
        jPanel.add(textField2);

        button1 = new JButton("登陆");
        button1.setBackground(Color.lightGray);
        button1.setFont(fnt);
        button1.setBounds(90,270,100,40);
        jPanel.add(button1);

        button2 = new JButton("修改密码");
        button2.setBackground(Color.lightGray);
        button2.setFont(fnt);
        button2.setBounds(260,270,140,40);
        jPanel.add(button2);

        label3 = new JLabel();
        label3.setFont(fnt);
        label3.setBounds(200,20,200,30);
        label3.setForeground(Color.blue);
        jPanel.add(label3);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public static void main(String [] args){
        StudentLoginInterface s = new StudentLoginInterface();
        s.CreateFrame();
    }

}
