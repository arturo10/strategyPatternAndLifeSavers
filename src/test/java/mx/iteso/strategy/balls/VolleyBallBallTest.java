package mx.iteso.strategy.balls;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class VolleyBallBallTest {

    @Test
    public void testVolleyBallBall() {
        VolleyBallBall volleyBall = new VolleyBallBall();
        assertEquals(TestUtils.NORMALBOUNCE, volleyBall.performBounce());
        assertEquals(TestUtils.DEFLATING, volleyBall.performDeflate());
        assertEquals(TestUtils.INFLATING, volleyBall.performInflate());
        assertEquals(TestUtils.VOLLEYBALLROLLING, volleyBall.roll());
        assertEquals(TestUtils.EXPLODE, volleyBall.performExploitable());
    }
}
