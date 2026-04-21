package Linear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    LinearSearch ls = new LinearSearch();

    @Test
    void testElementFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, ls.search(arr, 3));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 2, 3};
        assertEquals(-1, ls.search(arr, 10));
    }
}