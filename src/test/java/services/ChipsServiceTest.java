package services;

import models.Chips;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChipsServiceTest {
    @Test
    public void ChipsServiceTest(){

        // (1)
        String expectedName = "Salt and Vinegar";
        String expectedBrand = "Utz";
        Integer expectedSku = 2332477;
        Double expectedWeightInOunces = 12.5;
        Integer expectedQty = 10;
        Double expectedPrice = 3.59;

        // (2)
        ChipsService ChipsService = new ChipsService();
        Chips testChips = ChipsService.create(expectedName, expectedBrand,
                expectedSku, expectedWeightInOunces, expectedQty, expectedPrice);

        // (3)
        Integer actualId = testChips.getId();
        String actualName = testChips.getName();
        String actualBrand = testChips.getBrand();
        Integer actualSku = testChips.getSku();
        Double actualWeightInOunces = testChips.getWeightInOunces();
        Integer actualQty = testChips.getQty();
        Double actualPrice = testChips.getPrice();

        // (4)
        assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        assertEquals(expectedName, actualName);
        assertEquals(expectedBrand, actualBrand);
        assertEquals(expectedSku, actualSku);
        assertEquals(expectedWeightInOunces, actualWeightInOunces);
        assertEquals(expectedQty, actualQty);
        assertEquals(expectedPrice, actualPrice);

    }
}