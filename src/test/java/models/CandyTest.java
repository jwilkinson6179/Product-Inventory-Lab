package models;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyTest {

    @Test
    public void testGetId() {
        Integer expected = 117;

        Candy testCandy = new Candy();
        testCandy.setId(117);
        Integer actual = testCandy.getId();

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
        Integer expected = 38253482;

        Candy testCandy = new Candy();
        testCandy.setSku(38253482);
        Integer actual = testCandy.getSku();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetWeightInOunces() {
        Double expected = 10.7;

        Candy testCandy = new Candy();
        testCandy.setWeightInOunces(10.7);
        Double actual = testCandy.getWeightInOunces();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetQty() {
        Integer expected = 72;

        Candy testCandy = new Candy();
        testCandy.setQty(72);
        Integer actual = testCandy.getQty();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetPrice() {
        Double expected = 1.69;

        Candy testCandy = new Candy();
        testCandy.setPrice(1.69);
        Double actual = testCandy.getPrice();

        assertEquals(expected, actual);
    }
}