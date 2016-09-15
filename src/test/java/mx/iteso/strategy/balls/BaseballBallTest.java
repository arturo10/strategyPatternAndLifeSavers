package mx.iteso.strategy.balls;

import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class BaseballBallTest {
    @Test
    public void testBaseballBall() {
        BaseballBall baseBall = new BaseballBall();
        assertEquals(TestUtils.IRREGULARBOUNCE, baseBall.performBounce());
        assertEquals(TestUtils.NOTDEFLATING, baseBall.performDeflate());
        assertEquals(TestUtils.NOTINFLATING, baseBall.performInflate());
        assertEquals(TestUtils.BASEBALLROLLING, baseBall.roll());
        assertEquals(TestUtils.NOTEXPLODE, baseBall.performExploitable());
    }

}
