package services;

import models.Candy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyServiceTest {
    @Test
    public void CandyServiceTest(){

        // (1)
        String expectedName = "Gobstoppers";
        String expectedBrand = "Wonka";
        Integer expectedSku = 1037177;
        Double expectedWeightInOunces = 6.0;
        Integer expectedQty = 6700;
        Double expectedPrice = 1.19;

        // (2)
        CandyService CandyService = new CandyService();
        Candy testCandy = CandyService.create(expectedName, expectedBrand,
                expectedSku, expectedWeightInOunces, expectedQty, expectedPrice);

        // (3)
        Integer actualId = testCandy.getId();
        String actualName = testCandy.getName();
        String actualBrand = testCandy.getBrand();
        Integer actualSku = testCandy.getSku();
        Double actualWeightInOunces = testCandy.getWeightInOunces();
        Integer actualQty = testCandy.getQty();
        Double actualPrice = testCandy.getPrice();

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
