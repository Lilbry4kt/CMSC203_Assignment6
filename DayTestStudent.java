package bev2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DayTestStudent {

    @Test
    void testDayToString() {
        // Assuming you have implemented toString() method in the Day enum
        String expectedString = "MONDAY";
        String actualString = Day.MONDAY.toString();

        assertEquals(expectedString, actualString);
    }

    // @Test
    // void testDayValues() {
    //     // Assuming you have implemented values() method in the Day enum
    //     Day[] expectedDays = { Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY };
    //     Day[] actualDays = Day.values();

    //     assertArrayEquals(expectedDays, actualDays);
    // }

    // Add more test cases as needed

    @Test
    void testDay() {
        // Your additional test cases go here
    }

    @Test
    public void Day()
    {
    }
}