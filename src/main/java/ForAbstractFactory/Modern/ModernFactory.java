package ForAbstractFactory.Modern;

import ForAbstractFactory.AbstractFactory;
import ForAbstractFactory.Chair;
import ForAbstractFactory.CoffeeTable;
import ForAbstractFactory.Table;

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
