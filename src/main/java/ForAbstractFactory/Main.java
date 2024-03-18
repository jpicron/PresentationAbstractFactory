package ForAbstractFactory;

import ForAbstractFactory.Modern.ModernFactory;
import ForAbstractFactory.Victorian.VictorianFactory;
import ForAbstractFactory.interfaces.AbstractFactory;
import ForAbstractFactory.interfaces.Chair;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();
        System.out.println(factory.createChair().toString());
        System.out.println(factory.createTable().toString());
        System.out.println(factory.createCoffeeTable().toString());
        factory = new VictorianFactory();
        System.out.println(factory.createChair().toString());
        System.out.println(factory.createTable().toString());
        System.out.println(factory.createCoffeeTable().toString());
    }
}
