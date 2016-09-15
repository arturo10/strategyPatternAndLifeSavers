package mx.iteso.strategy.balls;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class SoccerBallTest {
    @Test
    public void testSoccerBall() {
        SoccerBall soccerBall = new SoccerBall();
        assertEquals(TestUtils.NORMALBOUNCE, soccerBall.performBounce());
        assertEquals(TestUtils.DEFLATING, soccerBall.performDeflate());
        assertEquals(TestUtils.INFLATING, soccerBall.performInflate());
        assertEquals(TestUtils.SOCCERBALLROLLING, soccerBall.roll());
        assertEquals(TestUtils.EXPLODE, soccerBall.performExploitable());
    }
}
