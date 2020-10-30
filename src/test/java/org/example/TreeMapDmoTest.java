package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TreeMapDmoTest {
private HashMap mapDmo;
    @Before
    public void setUp() throws Exception {
        mapDmo = new HashMap();
    }
    @Test
    public void testMapInit(){
        assertTrue(mapDmo.isEmpty());
        assertTrue(mapDmo.size() == 0);
    }
    @Test
    public void testAddElements(){
        mapDmo.put(20,"Manyati");
        mapDmo.put(1, "Munya");
        mapDmo.put(200, "Bob");


        assertEquals(mapDmo.containsKey(1), mapDmo.containsValue("Nyasha") );


        mapDmo.put(85, "Nyasha");

        assertTrue(mapDmo.size()==4);
    }
    @Test
    public void testRemoveElement(){
        mapDmo.put(20,"Manyati");
        mapDmo.put(1, "Munya");
        mapDmo.put(200, "Bob");

        mapDmo.remove(2);
        Assert.assertTrue(mapDmo.size() == 2);

        if (true){
            System.out.println("Successfully removed");
        }

    }
    @Test
    public void FailTest(){
        Assert.fail("FailTest Reached");


    }

}