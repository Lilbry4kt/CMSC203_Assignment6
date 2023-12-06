package bev2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SizeTestStudent {

    @Test
    void testSizeToString() {
        // Assuming you have implemented toString() method in the Size enum
        String expectedString = "SMALL";
        String actualString = Size.SMALL.toString();

        assertEquals(expectedString, actualString);
    }

    @Test
    void testSizeValues() {
        // Assuming you have implemented values() method in the Size enum
        Size[] expectedSizes = { Size.SMALL, Size.MEDIUM, Size.LARGE };
        Size[] actualSizes = Size.values();

        assertArrayEquals(expectedSizes, actualSizes);
    }

    // Add more test cases as needed

    @Test
    public void Size()
    {
    }
}
