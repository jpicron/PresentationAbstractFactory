package ForAbstractFactory;

import ForAbstractFactory.Modern.ModernFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();

        Chair chair = factory.createChair();
        System.out.println(chair.toString());
    }
}
