package edu.umb.cs680.hw014;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;



class MileageComparatorTest {

    List<Car> ListOfCars = new ArrayList<Car>();
    @Test
    public void verifymileagecomparator() {


        ListOfCars.add(new Car("mustang", "ford a ", 27, 2021, 98000));
        ListOfCars.add(new Car("porsche", "new taycan ", 21, 2018, 34000));


        Collections.sort(ListOfCars,(Car car1, Car car2) -> car1.getMileage()-car2.getMileage());


        assertEquals(21,ListOfCars.get(0).getMileage());
        assertEquals(22, ListOfCars.get(1).getMileage());

    }

    @Test
    public void errormileagecomparator() {


        ListOfCars.add(new Car("mustang", "ford a ", 27, 2021, 98000));
        ListOfCars.add(new Car("porsche", "new taycan ", 21, 2018, 34000));


        Collections.sort(ListOfCars,(Car car1, Car car2) -> car1.getMileage()-car2.getMileage());


        assertNotEquals(22,ListOfCars.get(0).getMileage());
        assertNotEquals(21, ListOfCars.get(1).getMileage());

    }

}