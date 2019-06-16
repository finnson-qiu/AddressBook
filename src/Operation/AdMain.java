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

    private static void DeleteStudent(){
        String NO = adMainInterface.getTextField1().getText();
        String Name = adMainInterface.getTextField3().getText();

        int flag = 0;
        if(NO.isEmpty()){
            if(Name.isEmpty()){
            }
            else{
                flag = 3;
            }
        }
        else{
            if(Name.isEmpty()){
                flag = 1;
            }
            else{
                flag = 2;
            }
        }
        if(flag != 0){
            DbOperator db = new DbOperator();
            db.DeleteUserData(NO,Name,flag);
        }
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
}
