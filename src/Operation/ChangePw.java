package Operation;

import Interface.ChangePwInterface;
import Interface.StudentLoginInterface;

import javax.swing.*;

public class ChangePw {

    private static ChangePwInterface changePwInterface;
    private static StudentLoginInterface studentLoginInterface;

    public void ChgPwOperation(){
        changePwInterface = new ChangePwInterface();
        changePwInterface.CreatePwFrame();
        CancelActionListener(changePwInterface.getButton2());
    }
    private static void ChangePassword(){

    }

    public void setStudentLoginInterface(StudentLoginInterface studentLoginInterface) {
        this.studentLoginInterface = studentLoginInterface;
    }

    private static void ConfirmActionListener(JButton button){
        button.addActionListener(e -> {
            ChangePassword();
        });
    }

    private static void CancelActionListener(JButton button){
        button.addActionListener(e -> {
            changePwInterface.getjFrame().dispose();
            studentLoginInterface.getjFrame().setVisible(true);
        });
    }
}
