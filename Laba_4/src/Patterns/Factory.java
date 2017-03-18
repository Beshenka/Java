package Patterns;

import Interface.Client;
import Model.ClientLinuxImpl;
import Model.ClientWinImpl;

public class Factory {

    public Client getClient(String currentOS){
        if(currentOS.equals("win"))
            return new ClientWinImpl();
        else if(currentOS.equals("linux"))
            return new ClientLinuxImpl();
        return null;
    }
}
