package Patterns;

import Interface.Client;
import Model.OperationAdd;
import Model.OperationMultiply;
import Model.OperationSubstract;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Factory factory;
    private Strategy strategy;

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
        factory = new Factory();
        strategy = new Strategy();
    }

    public void checkFactory(){
        Client client = factory.getClient("linux");
        System.out.println(client.getTargetOS());

        client = factory.getClient("win");
        System.out.println(client.getTargetOS());
    }

    public void checkStrategy(){
        strategy.setOperation(new OperationAdd());
        strategy.executeOperation(5, 3);

        strategy.setOperation(new OperationSubstract());
        strategy.executeOperation(5, 3);

        strategy.setOperation(new OperationMultiply());
        strategy.executeOperation(5, 3);
    }
}
