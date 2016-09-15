package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class SwimRingTest {
    @Test
    public void  testSwimRingTest(){
        SwimRing swimRing = new SwimRing();
        assertEquals(DeflateBehavior.DEFLATE, swimRing.deflating());
        assertEquals(DeflateBehavior.INFLATE, swimRing.inflating());
        assertEquals(FlotationBehavior.FLOATING, swimRing.floating());
    }
}
