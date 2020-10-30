package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetsTest {
    private Set<Integer> num;
    @Before
    public void setUp() throws Exception {

        num= new HashSet<>();
    }
    @Test
    public void testListInit(){
        assertTrue(num.isEmpty());
        assertTrue(num.size() == 0);
    }
    @Test
    public void testAddElements(){
        num.add(20);
        num.add(1);
        num.add(200);


        assertEquals(num.contains(20), true );
        assertEquals(num.contains(1), true);
        assertEquals(num.contains(200), true);

        num.add(85);

        assertEquals(num.contains(20), true );
        assertEquals(num.contains(1), true);
        assertEquals(num.contains(200), true);
        assertEquals(num.contains(85), true);

        assertTrue(num.size()==4);
    }
    @Test
    public void testRemoveElement(){
        num.add(20);
        num.add(1);
        num.add(200);

        Assert.assertEquals(num.remove(200) , true );
        Assert.assertTrue(num.size() == 2);
    }

    @Test
    public void FailTest(){
        Assert.fail("FailTest Reached");
        // System.out.println("This is my fail test");

    }

    @After
    public void tearDown() throws Exception {
    }
}