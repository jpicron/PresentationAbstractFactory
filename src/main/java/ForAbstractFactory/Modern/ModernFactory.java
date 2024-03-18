package ForAbstractFactory.Modern;

import ForAbstractFactory.interfaces.AbstractFactory;
import ForAbstractFactory.interfaces.Chair;
import ForAbstractFactory.interfaces.CoffeeTable;
import ForAbstractFactory.interfaces.Table;

public class ModernFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
