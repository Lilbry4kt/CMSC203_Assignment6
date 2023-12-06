package bev2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TypeTestStudent {

    @Test
    void testTypeToString() {
        // Assuming you have implemented toString() method in the Type enum
        String expectedString = "COFFEE";
        String actualString = Type.COFFEE.toString();

        assertEquals(expectedString, actualString);
    }

    @Test
    void testTypeValues() {
        // Assuming you have implemented values() method in the Type enum
        Type[] expectedTypes = { Type.COFFEE, Type.SMOOTHIE, Type.ALCOHOL };
        Type[] actualTypes = Type.values();

        assertArrayEquals(expectedTypes, actualTypes);
    }

    // Add more test cases as needed

    @Test
    public void TypeTestStudent()
    {
    }
}
