package Operation;

import Interface.HomeInterface;
import Operation.AdLogin;

import javax.swing.*;

public class Main {

    private static HomeInterface homeInterface;
    private static StudentLogin studentLogin;

    public static void main(String [] args){
        homeInterface = new HomeInterface();
        homeInterface.CreateHI();
        MainAdListen(homeInterface.getButton2());
        MainStListen(homeInterface.getButton1());
    }

    private static void MainAdListen(JButton button){
        button.addActionListener(e -> {
            homeInterface.getjFrame().dispose();
            AdLogin adLogin = new AdLogin();
            adLogin.AdLoginOperation();
        });
    }

    private static void MainStListen(JButton button){
        button.addActionListener(e -> {
            homeInterface.getjFrame().dispose();
            studentLogin = new StudentLogin();
            studentLogin.Operation();
        });
    }

}
