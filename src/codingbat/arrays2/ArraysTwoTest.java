package codingbat.arrays2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTwoTest {
    @Test
    void countEvensShouldEqualsThree() {
        ArraysTwo arraysTwo = new ArraysTwo();
        assertEquals(3, arraysTwo.countEvens(List.of(3, 4, 5, 6, 7, 8, 2, 4)));
    }
}