package models;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyTest {

    @Test
    public void testGetId() {
        int expected = 117;

        Candy testCandy = new Candy();
        testCandy.setId(117);
        int actual = testCandy.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        String expected = "Snickers";

        Candy testCandy = new Candy();
        testCandy.setName("Snickers");
        String actual = testCandy.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetBrand() {
        String expected = "Mars";

        Candy testCandy = new Candy();
        testCandy.setBrand("Mars");
        String actual = testCandy.getBrand();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSku() {
        int expected = 38253482;

        Candy testCandy = new Candy();
        testCandy.setSku(38253482);
        int actual = testCandy.getSku();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetWeightInOunces() {
        double expected = 10.7;

        Candy testCandy = new Candy();
        testCandy.setWeightInOunces(10.7);
        double actual = testCandy.getWeightInOunces();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetQty() {
        int expected = 72;

        Candy testCandy = new Candy();
        testCandy.setQty(72);
        int actual = testCandy.getQty();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetPrice() {
        double expected = 1.69;

        Candy testCandy = new Candy();
        testCandy.setPrice(1.69);
        double actual = testCandy.getPrice();

        assertEquals(expected, actual);
    }
}