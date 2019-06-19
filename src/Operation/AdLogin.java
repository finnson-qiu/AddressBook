package Operation;

import Interface.AdLoginInterface;

import javax.swing.*;

public class AdLogin {

    private static AdLoginInterface adLoginInterface;

    public void AdLoginOperation(){
        adLoginInterface = new AdLoginInterface();
        adLoginInterface.CreateInput();
        AdLoginActionListener(adLoginInterface.getButton());
    }

    private static void CheckPassword(){
        //String password = adLoginInterface.getTextField().getText();
        String password = "666666";
        if(password.equals("666666")){
            adLoginInterface.getINframe().dispose();
            AdMain adMain = new AdMain();
            adMain.AdMainOperation();
        }
        else{
            adLoginInterface.getLabel().setText("口令错误");
        }
    }

    private static void AdLoginActionListener(JButton button){
        button.addActionListener(e -> {
            CheckPassword();
        });
    }
}
