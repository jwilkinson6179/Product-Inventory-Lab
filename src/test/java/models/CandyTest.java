package models;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

    @Test
    public void constructorTest() {
        Integer expectedId = 6;
        String expectedName = "Milky Way";
        String expectedBrand = "Mars";
        Integer expectedSku = 14253482;
        Double expectedWeightInOunces = 6.4;
        Integer expectedQty = 108;
        Double expectedPrice = 1.69;

        Candy testCandy = new Candy(6, "Milky Way", "Mars",
                14253482, 6.4, 108, 1.69);
        testCandy.getId();

        Integer actualId = testCandy.getId();
        String actualName = testCandy.getName();
        String actualBrand = testCandy.getBrand();
        Integer actualSku = testCandy.getSku();
        Double actualWeightInOunces = testCandy.getWeightInOunces();
        Integer actualQty = testCandy.getQty();
        Double actualPrice = testCandy.getPrice();

        assertEquals(expectedId, actualId);
        assertEquals(expectedName, actualName);
        assertEquals(expectedBrand, actualBrand);
        assertEquals(expectedSku, actualSku);
        assertEquals(expectedWeightInOunces, actualWeightInOunces);
        assertEquals(expectedQty, actualQty);
        assertEquals(expectedPrice, actualPrice);
    }
}