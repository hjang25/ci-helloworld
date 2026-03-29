import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLastNull() {
        assertThrows(NullPointerException.class, () -> {
            ArrayUtils.findLast(null, 3);
        });
    }

    @Test
    public void testFindLastEmpty() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    public void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testFindLastReturnsLastMatchingIndex() {
        assertEquals(3, ArrayUtils.findLast(new int[]{1, 2, 1, 2}, 2));
    }

    @Test
    public void testOddOrPosNull() {
        assertThrows(NullPointerException.class, () -> {
            ArrayUtils.oddOrPos(null);
        });
    }

    @Test
    public void testOddOrPosMixedValues() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    public void testOddOrPosAllFalse() {
        assertEquals(0, ArrayUtils.oddOrPos(new int[]{-2, 0, -4}));
    }

//    @Test
//    public void testCountOfEmpty() {
//        assertEquals(0, ArrayUtils.countOf(new int[]{}, 7));
//    }
//
//    @Test
//    public void testCountOfSomeMatches() {
//        assertEquals(2, ArrayUtils.countOf(new int[]{1, 2, 1, 3}, 1));
//    }
//
//    @Test
//    public void testCountOfNoMatches() {
//        assertEquals(0, ArrayUtils.countOf(new int[]{4, 5, 6}, 1));
//    }
}
