package Operation;

import Interface.StMainInterface;

public class StMain {
    private StMainInterface stMainInterface;

    public void StMainOperation(){
        stMainInterface = new StMainInterface();
        stMainInterface.CreateStMainFrame();
    }

}
