package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChipsTest {

    @Test
    public void testGetId() {
        Integer expected = 41;

        Chips testChips = new Chips();
        testChips.setId(41);
        Integer actual = testChips.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        String expected = "Kettle Cooked Salt & Vinegar";

        Chips testChips = new Chips();
        testChips.setName("Kettle Cooked Salt & Vinegar");
        String actual = testChips.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetBrand() {
        String expected = "Utz";

        Chips testChips = new Chips();
        testChips.setBrand("Utz");
        String actual = testChips.getBrand();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSku() {
        Integer expected = 87195664;

        Chips testChips = new Chips();
        testChips.setSku(87195664);
        Integer actual = testChips.getSku();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetWeightInOunces() {
        Double expected = 10.7;

        Chips testChips = new Chips();
        testChips.setWeightInOunces(10.7);
        Double actual = testChips.getWeightInOunces();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetQty() {
        Integer expected = 72;

        Chips testChips = new Chips();
        testChips.setQty(72);
        Integer actual = testChips.getQty();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetPrice() {
        Double expected = 1.69;

        Chips testChips = new Chips();
        testChips.setPrice(1.69);
        Double actual = testChips.getPrice();

        assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        Integer expectedId = 110;
        String expectedName = "Kettle Cooked Chips";
        String expectedBrand = "Lays";
        Integer expectedSku = 14113482;
        Double expectedWeightInOunces = 14.2;
        Integer expectedQty = 0;
        Double expectedPrice = 3.89;

        Candy testCandy = new Candy(110, "Kettle Cooked Chips",
                "Lays",
                14113482, 14.2, 0, 3.89);
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
