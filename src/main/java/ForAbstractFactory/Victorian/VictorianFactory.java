package ForAbstractFactory.Victorian;

import ForAbstractFactory.AbstractFactory;
import ForAbstractFactory.Chair;
import ForAbstractFactory.CoffeeTable;
import ForAbstractFactory.Table;

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
