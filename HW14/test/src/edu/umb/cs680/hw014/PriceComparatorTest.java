package edu.umb.cs680.hw014;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;



class PriceComparatorTest {

    List<Car> ListOfCars = new ArrayList<Car>();
    @Test
    public void verify_MileageComparator() {

        ListOfCars.add(new Car("Hyundai", "i20", 17, 2017, 21000));
        ListOfCars.add(new Car("mahindra", "xuv500", 19, 2013, 12000));


        Collections.sort(ListOfCars,(Car car1, Car car2) -> (int) (car1.getPrice() - car2.getPrice()));


        assertEquals(34000,ListOfCars.get(0).getPrice());
        assertEquals(78000, ListOfCars.get(1).getPrice());
    }
    @Test
    public void error_MileageComparator() {

        ListOfCars.add(new Car("Hyundai", "i20", 17, 2017, 21000));
        ListOfCars.add(new Car("mahindra", "xuv500", 19, 2013, 12000));

        Collections.sort(ListOfCars,(Car car1, Car car2) -> (int) (car1.getPrice() - car2.getPrice()));


        assertNotEquals(3400,ListOfCars.get(0).getPrice());
        assertNotEquals(7000, ListOfCars.get(1).getPrice());
    }

}