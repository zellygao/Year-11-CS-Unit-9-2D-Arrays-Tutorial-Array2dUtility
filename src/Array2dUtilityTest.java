import static org.junit.jupiter.api.Assertions.*;

public class Array2dUtilityTest {

    private int[][] array2d;
    private int[][] array2d2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        array2d =
                new int[][]{
                        {1, -2, 3, 4, 5},
                        {6, 7, -8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, -22, 23, 24, 25}
                };

        array2d2 =
                new int[][]{
                        {11, -2, 3, 14, 5},
                        {6, 71, 28, 9, 30},
                        {11, 123, -13, 14, 15},
                        {16, 17, 108, -29, 20},
                        {21, 22, 203, 24, 45}
                };

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        array2d = null;
        array2d2 = null;
    }

    @org.junit.jupiter.api.Test
    void sum() {
        assertTrue(Array2dUtility.sum(array2d) == 261);
        assertTrue(Array2dUtility.sum(array2d2) == 772);
    }

    @org.junit.jupiter.api.Test
    void average() {

    }

    @org.junit.jupiter.api.Test
    void minimum() {
        assertTrue(Array2dUtility.minimum(array2d) == -22);
        assertTrue(Array2dUtility.minimum(array2d2) == -29);
    }

    @org.junit.jupiter.api.Test
    void maximum() {
        assertTrue(Array2dUtility.maximum(array2d) == 25);
        assertTrue(Array2dUtility.maximum(array2d2) == 203);
    }

    @org.junit.jupiter.api.Test
    void evenCountStandard() {
        assertTrue(Array2dUtility.evenCountStandard(array2d) == 12);
        assertTrue(Array2dUtility.evenCountStandard(array2d2) == 11);
    }

    @org.junit.jupiter.api.Test
    void evenCountEnhanced() {
        assertTrue(Array2dUtility.evenCountEnhanced(array2d) == 12);
        assertTrue(Array2dUtility.evenCountEnhanced(array2d2) == 11);
    }

    @org.junit.jupiter.api.Test
    void allPositive() {

    }

    @org.junit.jupiter.api.Test
    void rowSums() {

    }

    @org.junit.jupiter.api.Test
    void colSums() {

    }

}
