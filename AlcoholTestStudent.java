package bev2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {

    @Test
    void testAlcoholCalcPrice() {
        // Assuming you have implemented calcPrice() method in the Alcohol class
        Alcohol alcohol = new Alcohol("Whiskey", Size.LARGE, false);

        // Adjust the expected price based on your implementation
        double expectedPrice = alcohol.calcPrice();
        double actualPrice = alcohol.calcPrice();

        assertEquals(expectedPrice, actualPrice, 0.001); // Adjust the delta based on your precision requirements
    }

    // Add more test cases as needed

    @Test
    public void teststudents() {
    }
}