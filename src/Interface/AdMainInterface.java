package Interface;

import javax.swing.*;
import java.awt.*;

public class AdMainInterface {
    JFrame jFrame;
    JLabel label4;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    private JTextArea textArea;

    public JFrame getjFrame() {
        return jFrame;
    }

    public void CreateAdMainFrame(){
        jFrame = new JFrame("管理员");
        jFrame.setLocation(500,200);
        jFrame.setSize(700,800);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setLayout(null);

        Font fnt = new Font("楷体",Font.PLAIN,22);
        JLabel label1 = new JLabel("学号:");
        label1.setFont(fnt);
        label1.setBounds(40,40,60,30);
        jPanel.add(label1);

        textField1 = new JTextField();
        textField1.setFont(fnt);
        textField1.setBounds(110,40,180,35);
        jPanel.add(textField1);

        JLabel label2 = new JLabel("密码:");
        label2.setFont(fnt);
        label2.setBounds(340,40,60,30);
        jPanel.add(label2);

        textField2 = new JTextField();
        textField2.setFont(fnt);
        textField2.setBounds(400,40,220,35);
        jPanel.add(textField2);

        label4 = new JLabel();
        label4.setForeground(Color.blue);
        label4.setFont(fnt);
        label4.setBounds(400,100,220,35);
        jPanel.add(label4);

        JLabel label3 = new JLabel("姓名:");
        label3.setFont(fnt);
        label3.setBounds(40,100,60,30);
        jPanel.add(label3);

        textField3 = new JTextField();
        textField3.setFont(fnt);
        textField3.setBounds(110,100,180,35);
        jPanel.add(textField3);

        button1 = new JButton("增加");
        button1.setBackground(Color.lightGray);
        button1.setFont(fnt);
        button1.setBounds(60,200,100,40);
        jPanel.add(button1);

        button2 = new JButton("修改");
        button2.setBackground(Color.lightGray);
        button2.setFont(fnt);
        button2.setBounds(210,200,100,40);
        jPanel.add(button2);

        button3 = new JButton("删除");
        button3.setBackground(Color.lightGray);
        button3.setFont(fnt);
        button3.setBounds(360,200,100,40);
        jPanel.add(button3);

        button4 = new JButton("查询");
        button4.setBackground(Color.lightGray);
        button4.setFont(fnt);
        button4.setBounds(510,200,100,40);
        jPanel.add(button4);

        Font fnt1 = new Font("楷体",Font.PLAIN,18);
        JLabel label5 = new JLabel("学号");
        label5.setFont(fnt1);
        label5.setForeground(Color.blue);
        label5.setBounds(160,255,40,20);
        jPanel.add(label5);

        JLabel label6 = new JLabel("姓名");
        label6.setFont(fnt1);
        label6.setForeground(Color.blue);
        label6.setBounds(290,255,40,20);
        jPanel.add(label6);

        JLabel label7 = new JLabel("密码");
        label7.setFont(fnt1);
        label7.setForeground(Color.blue);
        label7.setBounds(470,255,40,20);
        jPanel.add(label7);

        textArea = new JTextArea();
        textArea.setFont(fnt);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10,280,660,460);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jPanel.add(scrollPane);

        jFrame.setVisible(true);
    }

    public JTextArea getTextArea() {
        return textArea;
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

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public static void main(String [] args){
        AdMainInterface adMainInterface = new AdMainInterface();
        adMainInterface.CreateAdMainFrame();
        JTextArea jTextArea = adMainInterface.getTextArea();
        jTextArea.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhaha/n还换");
    }

}
