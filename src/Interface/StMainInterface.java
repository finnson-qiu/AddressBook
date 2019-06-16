package Interface;

import javax.swing.*;
import java.awt.*;

public class StMainInterface {

        JFrame jFrame;
        private JTextArea textArea;

        public JFrame getjFrame() {
            return jFrame;
        }

        public void CreateStMainFrame(){
            jFrame = new JFrame("学生通讯录");
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

            JTextField textField1 = new JTextField();
            textField1.setFont(fnt);
            textField1.setBounds(110,40,180,35);
            jPanel.add(textField1);

            JLabel label2 = new JLabel("电话号码:");
            label2.setFont(fnt);
            label2.setBounds(310,40,100,30);
            jPanel.add(label2);

            JTextField textField2 = new JTextField();
            textField2.setFont(fnt);
            textField2.setBounds(410,40,220,35);
            jPanel.add(textField2);

            JLabel label3 = new JLabel("姓名:");
            label3.setFont(fnt);
            label3.setBounds(40,100,60,30);
            jPanel.add(label3);

            JTextField textField3 = new JTextField();
            textField3.setFont(fnt);
            textField3.setBounds(110,100,180,35);
            jPanel.add(textField3);

            JLabel label4 = new JLabel("家庭地址:");
            label4.setFont(fnt);
            label4.setBounds(310,100,100,30);
            jPanel.add(label4);

            JTextField textField4 = new JTextField();
            textField4.setFont(fnt);
            textField4.setBounds(410,100,220,35);
            jPanel.add(textField4);

            JButton button1 = new JButton("增加");
            button1.setBackground(Color.lightGray);
            button1.setFont(fnt);
            button1.setBounds(60,200,100,40);
            jPanel.add(button1);

            JButton button2 = new JButton("修改");
            button2.setBackground(Color.lightGray);
            button2.setFont(fnt);
            button2.setBounds(210,200,100,40);
            jPanel.add(button2);

            JButton button3 = new JButton("删除");
            button3.setBackground(Color.lightGray);
            button3.setFont(fnt);
            button3.setBounds(360,200,100,40);
            jPanel.add(button3);

            JButton button4 = new JButton("查询");
            button4.setBackground(Color.lightGray);
            button4.setFont(fnt);
            button4.setBounds(510,200,100,40);
            jPanel.add(button4);

            textArea = new JTextArea();
            textArea.setFont(fnt);
            textArea.setEditable(false);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setBounds(10,280,660,460);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            jPanel.add(scrollPane);

            jFrame.setVisible(true);
    }

    public static void main(String [] args){
            StMainInterface stMainInterface = new StMainInterface();
            stMainInterface.CreateStMainFrame();
    }
}
