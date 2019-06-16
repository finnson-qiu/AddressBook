package Interface;

import javax.swing.*;
import java.awt.*;

public class AdLoginInterface {

    private JFrame INframe;
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public void CreateInput(){
        INframe = new JFrame("管理员登陆");
        INframe.setLocation(700,400);
        INframe.setSize(400,400);
        INframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        INframe.add(panel);

        panel.setLayout(null);

        Font fnt1 = new Font("楷体",Font.PLAIN,20);
        textField = new JTextField();
        textField.setFont(fnt1);
        textField.setBounds(100,100,200,35);
        panel.add(textField);

        button = new JButton("登陆");
        button.setFont(fnt1);
        button.setBounds(155,160,80,30);
        button.setBackground(Color.lightGray);
        panel.add(button);

        label =new JLabel("请输入密码");
        label.setFont(fnt1);
        label.setBounds(150,60,100,30);
        panel.add(label);


        INframe.setVisible(true);
    }

    public JButton getButton(){
        return button;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JLabel getLabel() {
        return label;
    }

    public JFrame getINframe() {
        return INframe;
    }

    public static void main(String [] args){
        AdLoginInterface in = new AdLoginInterface();
        in.CreateInput();
    }
}
