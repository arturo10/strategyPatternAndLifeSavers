package mx.iteso.strategy.balls;

import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class TennisBallTest {

    @Test
    public void testTennisBall() {
     TennisBall tennisBall = new TennisBall();
        assertEquals(TestUtils.NORMALBOUNCE, tennisBall.performBounce());
        assertEquals(TestUtils.NOTDEFLATING, tennisBall.performDeflate());
        assertEquals(TestUtils.NOTINFLATING, tennisBall.performInflate());
        assertEquals(TestUtils.TENNISROLLING, tennisBall.roll());
        assertEquals(TestUtils.NOTEXPLODE, tennisBall.performExploitable());
    }
}
