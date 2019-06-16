package Operation;

import Interface.StudentLoginInterface;
import Operation.ChangePw;
import Operation.StMain;

import javax.swing.*;

public class StudentLogin {
    private static StudentLoginInterface studentLoginInterface;
    public void Operation(){
        studentLoginInterface = new StudentLoginInterface();
        studentLoginInterface.CreateFrame();
        LoginActionListener(studentLoginInterface.getButton1());
        ChangePwActionListener(studentLoginInterface.getButton2());
    }

    private static void LoginActionListener(JButton button){
        button.addActionListener(e -> {
            studentLoginInterface.getLabel3().setText("登陆按钮");
            studentLoginInterface.getjFrame().dispose();
            StMain stMain = new StMain();
            stMain.StMainOperation();
        });
    }

    private static void ChangePwActionListener(JButton button){
        button.addActionListener(e -> {
            studentLoginInterface.getLabel3().setText("修改密码");
            studentLoginInterface.getjFrame().setVisible(false);
            ChangePw changePw = new ChangePw();
            changePw.setStudentLoginInterface(studentLoginInterface);
            changePw.ChgPwOperation();
        });
    }
}
