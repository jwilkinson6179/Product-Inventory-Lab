package services;

import models.Candy;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyServiceTest {

    //@Before
    // TODO: Learn @Before to properly configure this test file

    @Test
    public void CandyServiceTest(){

        // (1)
        String expectedName = "Whatchamacallit";
        String expectedBrand = "Nestle";
        Integer expectedSku = 140955;
        Double expectedWeightInOunces = 8.2;
        Integer expectedQty = 112;
        Double expectedPrice = 1.89;

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
    public void CandyServiceTestFind()
    {
        CandyService candyService = new CandyService();


        candyService.create("Gobstoppers", "Wonka",
                170655, 7.1, 19, 1.49);
        Candy actual = candyService.create("Snickers", "Hershey",
                551042, 4.9, 88, 0.89);
        candyService.create("Big Red", "Wrigley",
                667302, 4.1, 64, 0.39);
        candyService.create("Reese's Peanut Butter Cups", "Hershey",
                552301, 5.2, 4, 1.39);
        Candy expected = candyService.find(2);

        assertEquals(expected, actual);
    }

    @Test
    public void CandyServiceTestFindTwo()
    {
        CandyService candyService = new CandyService();


        candyService.create("Gobstoppers", "Wonka",
                170655, 7.1, 19, 1.49);
        candyService.create("Snickers", "Hershey",
                551042, 4.9, 88, 0.89);
        candyService.create("Big Red", "Wrigley",
                667302, 4.1, 64, 0.39);
        Candy actual = candyService.create("Reese's Peanut Butter Cups", "Hershey",
                552301, 5.2, 4, 1.39);
        Candy expected = candyService.find(4);

        assertEquals(expected, actual);
    }

    @Test
    public void CandyServiceTestFindAll()
    {
        CandyService CandyService = new CandyService();


        Candy actualCandy0 = CandyService.create("Gobstoppers", "Wonka",
                170655, 7.1, 19, 1.49);
        Candy actualCandy1 = CandyService.create("Snickers", "Hershey",
                551042, 4.9, 88, 0.89);
        Candy actualCandy2 = CandyService.create("Big Red", "Wrigley",
                667302, 4.1, 64, 0.39);
        Candy actualCandy3 = CandyService.create("Reese's Peanut Butter Cups", "Hershey",
                552301, 5.2, 4, 1.39);
        Candy[] expected = { actualCandy0, actualCandy1, actualCandy2, actualCandy3 };
        Candy[] actual = CandyService.findAll();

        assertEquals(expected, actual);
    }
/*
    @Test
    public void CandyServiceTestDeleteFail()
    {
        delete(1);
        findAll()
    }

    @Test
*/
}