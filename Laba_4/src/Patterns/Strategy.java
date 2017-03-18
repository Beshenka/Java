package Patterns;

import Interface.Operation;

public class Strategy {
    private Operation operation;

    public Strategy(){}

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void executeOperation(int num1, int num2){
        System.out.println(operation.doOperation(num1, num2));
    }
}