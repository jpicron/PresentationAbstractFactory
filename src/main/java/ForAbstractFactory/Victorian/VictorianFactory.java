package ForAbstractFactory.Victorian;

import ForAbstractFactory.interfaces.AbstractFactory;
import ForAbstractFactory.interfaces.Chair;
import ForAbstractFactory.interfaces.CoffeeTable;
import ForAbstractFactory.interfaces.Table;

public class VictorianFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
