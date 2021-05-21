package edu.umb.cs680.hw014;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class ParetoComparatorTest {

    ArrayList<Car> ListOfCars = new ArrayList<Car>();

    @Test
    public void verifyparetocomparator() {
        ListOfCars.add(new Car("Hyundai", "i20", 17, 2017, 21000));
        ListOfCars.add(new Car("mahindra", "xuv500", 19, 2013, 12000));

        for (Car car : ListOfCars) {
            car.setDominationCount(ListOfCars);
        }

        Collections.sort(ListOfCars, (Car car1, Car car2) -> car1.getDominationCount() - car2.getDominationCount());

        assertEquals(10000, ListOfCars.get(0).getPrice());
        assertEquals(12000, ListOfCars.get(1).getPrice());

    }

    @Test
    public void error_ParetoComparator() {
        ListOfCars.add(new Car("Hyundai", "i20", 17, 2017, 21000));
        ListOfCars.add(new Car("mahindra", "xuv500", 19, 2013, 12000));

        for (Car car : ListOfCars) {
            car.setDominationCount(ListOfCars);
        }

        Collections.sort(ListOfCars, (Car car1, Car car2) -> car1.getDominationCount() - car2.getDominationCount());

        assertNotEquals(3000, ListOfCars.get(0).getPrice());
        assertNotEquals(1000, ListOfCars.get(1).getPrice());

    }

}