package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mocklist for my citylist
     */

    @Before
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     *increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize+1);
    }


    /**
     *create a new City object
     *add the object to the list
     *check if the hasCity method can detected that our newly added city is inside the list
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity));
    }

    /**
     *get the size of list
     *create a new City object
     *add the object to the list
     *delete the object
     *check if the the list size equals the initial size
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        list.deleteCity(newCity);
        assertEquals(list.getCount(), listSize);
    }


}
