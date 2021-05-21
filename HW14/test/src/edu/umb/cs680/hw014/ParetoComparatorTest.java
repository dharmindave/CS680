package edu.umb.cs680.hw014;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class ParetoComparatorTest {
    LinkedList<Car> carList = new LinkedList<Car>();


    @Test
    void test() {
        Car car1 = new Car("BMW", "X3", 2014, 23, 80000);
        Car car2 = new Car("Mercedes", "C300", 2013, 20, 95000);
        carList.add(car1);
        carList.add(car2);
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).setDominationCount(i);
        }
        Collections.sort(carList, (Car arg0, Car arg1) -> arg1.getDominationCount() - arg0.getDominationCount());
        assertSame(1, carList.get(0).getDominationCount());
        assertSame(0, carList.get(1).getDominationCount());
    }
}