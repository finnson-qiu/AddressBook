package Interface;

import javax.swing.*;
import java.awt.*;

public class ErrorInterface {

    JLabel jLabel = new JLabel();

    public void CreateFrame() {
        JFrame jFrame = new JFrame("错误");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jFrame.setLocation(700,600);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jFrame.add(jPanel);

        Font fnt = new Font("楷体",Font.PLAIN,24);
        jLabel.setBounds(200,200,100,30);
        jLabel.setFont(fnt);

        jPanel.add(jLabel);

        jFrame.setVisible(true);
    }

    public JLabel getjLabel() {
        return jLabel;
    }
}
