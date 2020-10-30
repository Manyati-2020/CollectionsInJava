package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CollctionsTest {
    private List<String> list;


    @Before
    public void setUp() throws Exception {
        list = new ArrayList<String>();
    }

    @Test
    public void testListInit(){
        assertTrue(list.isEmpty());
        assertTrue(list.size() == 0);
        System.out.println("This is Empty success! ");
    }
    @Test
    public void testAddElements(){
        list.add(0, "Manyati");
        list.add(1, "Ronald");
        list.add(2, "Bob");

        assertEquals("Manyati", list.get(0));
        assertEquals("Ronald", list.get(1));
        assertEquals("Bob", list.get(2));


        list.add(1, "Nyasha");

        assertEquals("Manyati", list.get(0));
        assertEquals("Nyasha", list.get(1));
        assertEquals("Ronald", list.get(2));
        assertEquals("Bob", list.get(3));


        assertTrue(list.size()==4);
        System.out.println("This is my Add success! ");
    }

    @Test
    public void testSetElement(){
        list.add(0, "Manyati");
        list.add(1, "Ronald");
        list.add(2, "Bob");

        list.set(1, "South");

        Assert.assertEquals("Manyati", list.get(0));
        Assert.assertEquals("South", list.get(1));
        Assert.assertEquals("Bob", list.get(2));
        System.out.println("This is my Set success! ");
    }

    @Test
    public void testRemoveElement(){
        list.add(0, "Manyati");
        list.add(1, "Ronald");
        list.add(2, "Bob");

        Assert.assertEquals("Ronald", list.remove(1));
        Assert.assertTrue(list.size() == 2);
        System.out.println("This is my Remove success! ");
    }

    @Test
    public void FailTest(){
        fail();
        System.out.println("This is my fail test");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("This is my Finished TearDown test");
    }


}