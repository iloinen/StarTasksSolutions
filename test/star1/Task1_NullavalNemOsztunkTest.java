package star1;

import org.junit.jupiter.api.Test;
import star3.Task4_Maximumkereses;

import static org.junit.jupiter.api.Assertions.*;

/*
    random szám intervallumát tesztelni
 */

class Task1_NullavalNemOsztunkTest {

    // JUnit 5. verzió

    @Test
    void divideNumbersTestDivide() {
        String result1 = Task1_NullavalNemOsztunk.divideNumbers(1, 1);
        assertEquals("1", result1);

        String result3 = Task1_NullavalNemOsztunk.divideNumbers(10, 2);
        assertEquals("5", result3);

        String result4 = Task1_NullavalNemOsztunk.divideNumbers(10, 3);
        assertEquals("3", result4);
    }

    @Test
    void divideNumbersTestDivideByZero() {
        String result2 = Task1_NullavalNemOsztunk.divideNumbers(1, 0);
        assertEquals("Nullával nem osztunk!", result2);
    }

    @Test
    void maxTest() {
        boolean throwExceptionWithNull = assertThrowException(null);
        assertTrue(throwExceptionWithNull);

        boolean throwExceptionWithZeroLength = assertThrowException(new int[0]);
        assertTrue(throwExceptionWithZeroLength);

        int[] arr1 = {1};
        /*boolean noException = assertThrowException(arr1);
        assertFalse(noException);*/
        int max1 = Task4_Maximumkereses.max(arr1);
        assertEquals(1, max1);

        int[] arr2 = {1, 0};
        int max2 = Task4_Maximumkereses.max(arr2);
        assertEquals(1, max2);

        int[] arr3 = {1, 10};
        int max3 = Task4_Maximumkereses.max(arr3);
        assertEquals(10, max3);

        int[] arr4 = {1, 10, 10, 1, 20, 42};
        int max4 = Task4_Maximumkereses.max(arr4);
        assertEquals(42, max4);

        int[] arr5 = {1, 10, 42, 10, 1, 20};
        int max5 = Task4_Maximumkereses.max(arr5);
        assertEquals(42, max5);
    }

    private boolean assertThrowException(int[] numbers) {
        try {
            int result1 = Task4_Maximumkereses.max(numbers);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

}