package mx.iteso.strategy.balls;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class GolfballBallTest {
    @Test
    public void testgolfBall() {
        GolfBall golfBall = new GolfBall();
        assertEquals(TestUtils.IRREGULARBOUNCE, golfBall.performBounce());
        assertEquals(TestUtils.NOTDEFLATING, golfBall.performDeflate());
        assertEquals(TestUtils.NOTINFLATING, golfBall.performInflate());
        assertEquals(TestUtils.GOLFBALLROLLING, golfBall.roll());
        assertEquals(TestUtils.NOTEXPLODE, golfBall.performExploitable());
    }
}
