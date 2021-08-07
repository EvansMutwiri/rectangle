import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    void newRectangleTest_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    void newRectangleTest_getsLength_2() {
        Rectangle testRectangle = new Rectangle(2,4);
        assertEquals(2, testRectangle.getLength());
    }

    @Test
    void newRectangleTest_getsWidth_4() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(4, testRectangle.getWidth());
    }

    @Test
    void newRectangleTest_equalSides_true() {
        Rectangle testRectangle = new Rectangle(2,2);
        assertEquals(true, testRectangle.isSquare());
    }
}