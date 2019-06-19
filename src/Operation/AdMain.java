package Operation;

import DbOperation.DbOperator;
import Interface.AdMainInterface;

import javax.swing.*;

public class AdMain {

    private static AdMainInterface adMainInterface;

    public void AdMainOperation(){
        adMainInterface = new AdMainInterface();
        adMainInterface.CreateAdMainFrame();
        AddActionListener(adMainInterface.getButton1());
        DeleteActionListener(adMainInterface.getButton3());
        SelectActionListener(adMainInterface.getButton4());
    }

    private static void AddStudent(){
        String NO = adMainInterface.getTextField1().getText();
        String Password = adMainInterface.getTextField2().getText();
        String Name = adMainInterface.getTextField3().getText();

        if(NO.equals("") || Name.equals("") || Password.equals("")){
            adMainInterface.getLabel4().setText("全不能为空");
        }
        else if(NO.length() != 9){
            adMainInterface.getLabel4().setText("学号必须为9位");
        }
        else if(Password.length() > 18){
            adMainInterface.getLabel4().setText("密码不大于18位");
        }
        else if(Name.length() > 5){
            adMainInterface.getLabel4().setText("姓名不大于5汉字");
        }
        else{
            DbOperator db = new DbOperator();
            db.AddUserData(NO,Name,Password);
            adMainInterface.getLabel4().setText("添加学生信息成功");
        }
    }

    private static int JudgeFlag(String No,String Name){
        int flag = 0;
        if(No.isEmpty()){
            if(Name.isEmpty()){
            }                               //flag = 0代表No和Name都为空
            else{
                flag = 3;                   //flag = 3代表No为空，Name 不为空
            }
        }
        else{
            if(Name.isEmpty()){
                flag = 1;                   //flag = 1代表No不为空，Name为空
            }
            else{
                flag = 2;                   //flag = 2代表No和Name都不为空
            }
        }
        return flag;
    }

    private static void DeleteStudent(){
        String No = adMainInterface.getTextField1().getText();
        String Name = adMainInterface.getTextField3().getText();

        int flag = JudgeFlag(No,Name);
        if(flag != 0){
            DbOperator db = new DbOperator();
            db.DeleteUserData(No,Name,flag);
        }
    }

    private static void SelectStudent(){
        String No = adMainInterface.getTextField1().getText();
        String Name = adMainInterface.getTextField3().getText();

        int flag = JudgeFlag(No,Name);
        DbOperator db = new DbOperator();
        String display = db.Select(No,Name,flag);
        adMainInterface.getTextArea().setText(display);
    }

    private static void AddActionListener(JButton button){
        button.addActionListener(e -> {
            AddStudent();
        });
    }
    private static void DeleteActionListener(JButton button){
        button.addActionListener(e -> {
            DeleteStudent();
        });
    }

    private static void SelectActionListener(JButton button){
        button.addActionListener(e -> {
            SelectStudent();
        });
    }
}
