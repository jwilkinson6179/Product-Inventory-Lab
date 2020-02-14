package services;

import models.Candy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CandyServiceTest {
    @Test
    public void CandyServiceTest() {

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

    @Test
    public void CandyServiceTestFind() {

        CandyService CandyService = new CandyService();


        CandyService.create("Gobstoppers", "Wonka",
                170655, 7.1, 19, 1.49);
        Candy actualCandy = CandyService.create("Snickers", "Hershey",
                551042, 4.9, 88, 0.89);
        CandyService.create("Big Red", "Wrigley",
                667302, 4.1, 64, 0.39);
        CandyService.create("Reese's Peanut Butter Cups", "Hershey",
                552301, 5.2, 4, 1.39);
        Candy testCandy = CandyService.findCandy(2);

        assertEquals(actualCandy, testCandy);
    }
/*
    @Test
    public void CandyServiceTestFindAll()
    {

        findAll()
    }

    @Test
    public void CandyServiceTestDeleteFail()
    {
        delete(1);
        findAll()
    }

    @Test
*/
}