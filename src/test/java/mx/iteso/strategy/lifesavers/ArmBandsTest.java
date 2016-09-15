package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.TestUtils;
import mx.iteso.strategy.balls.AmericanFootballBall;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class ArmBandsTest {

    @Test
    public void testArmBands() {
        ArmBands armBands = new ArmBands();
        assertEquals(DeflateBehavior.DEFLATE, armBands.deflating());
        assertEquals(DeflateBehavior.INFLATE, armBands.inflating());
        assertEquals(FlotationBehavior.FLOATING, armBands.floating());

    }
}
