package mx.iteso.strategy.balls;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class PingPongballTest{

        @Test
        public void testPingPongBall() {
            PingPongBall pingPongBall = new PingPongBall();
            assertEquals(TestUtils.IRREGULARBOUNCE, pingPongBall.performBounce());
            assertEquals(TestUtils.NOTDEFLATING, pingPongBall.performDeflate());
            assertEquals(TestUtils.NOTINFLATING, pingPongBall.performInflate());
            assertEquals(TestUtils.PINGPONGROLLING, pingPongBall.roll());
            assertEquals(TestUtils.NOTEXPLODE, pingPongBall.performExploitable());
        }
}
