package Model;

import Interface.Client;

public class ClientLinuxImpl implements Client {

    @Override
    public String getTargetOS() {
        return "Linux";
    }

}
