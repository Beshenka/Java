import Patterns.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.checkFactory();
        singleton.checkStrategy();

    }

}
