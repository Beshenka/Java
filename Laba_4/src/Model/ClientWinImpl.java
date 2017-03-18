package Model;

import Interface.Client;

public class ClientWinImpl implements Client {

    @Override
    public String getTargetOS() {
        return "Windows";
    }

}