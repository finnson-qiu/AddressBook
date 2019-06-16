package Interface;

import javax.swing.*;
import java.awt.*;

public class ChangePwInterface {

    private JFrame jFrame;

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label4;
    private JButton button1;
    private JButton button2;

    public void CreatePwFrame(){
        jFrame = new JFrame("修改密码");
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
        textField1.setBounds(170,80,220,35);
        jPanel.add(textField1);

        JLabel label2 = new JLabel("原密码：");
        label2.setBounds(80,160,100,30);
        label2.setFont(fnt);
        jPanel.add(label2);

        textField2 = new JTextField();
        textField2.setFont(fnt);
        textField2.setBounds(170,160,220,35);
        jPanel.add(textField2);

        JLabel label3 = new JLabel("新密码：");
        label3.setBounds(80,240,100,30);
        label3.setFont(fnt);
        jPanel.add(label3);

        textField3 = new JTextField();
        textField3.setFont(fnt);
        textField3.setBounds(170,240,220,35);
        jPanel.add(textField3);

        button1 = new JButton("确定");
        button1.setBackground(Color.lightGray);
        button1.setFont(fnt);
        button1.setBounds(90,320,100,40);
        jPanel.add(button1);

        button2 = new JButton("取消");
        button2.setBackground(Color.lightGray);
        button2.setFont(fnt);
        button2.setBounds(290,320,100,40);
        jPanel.add(button2);

        label4 = new JLabel("111");
        label4.setFont(fnt);
        label4.setBounds(200,20,200,30);
        label4.setForeground(Color.blue);
        jPanel.add(label4);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

    public JLabel getLabel4() {
        return label4;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public static void main(String [] args){
        ChangePwInterface changePwInterface = new ChangePwInterface();
        changePwInterface.CreatePwFrame();
    }
}
