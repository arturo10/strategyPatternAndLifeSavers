package mx.iteso.strategy.balls;

import mx.iteso.strategy.TestUtils;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AmericanFootballBallTest {
    @Test
    public void testAmericanFootballBall() {
        AmericanFootballBall americanFootballBall = new AmericanFootballBall();
        assertEquals(TestUtils.IRREGULARBOUNCE, americanFootballBall.performBounce());
        assertEquals(TestUtils.DEFLATING, americanFootballBall.performDeflate());
        assertEquals(TestUtils.INFLATING, americanFootballBall.performInflate());
        assertEquals(TestUtils.AMERICANROLLING, americanFootballBall.roll());
        assertEquals(TestUtils.EXPLODE, americanFootballBall.performExploitable());
    }
}
