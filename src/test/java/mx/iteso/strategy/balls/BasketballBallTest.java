package mx.iteso.strategy.balls;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class BasketballBallTest {
    @Test
    public void testBasketBallBall() {
        BasketBallBall basketBall = new BasketBallBall();
        assertEquals(TestUtils.NORMALBOUNCE, basketBall.performBounce());
        assertEquals(TestUtils.DEFLATING, basketBall.performDeflate());
        assertEquals(TestUtils.INFLATING, basketBall.performInflate());
        assertEquals(TestUtils.BASKETBALLROLLING, basketBall.roll());
        assertEquals(TestUtils.EXPLODE, basketBall.performExploitable());
    }
}
