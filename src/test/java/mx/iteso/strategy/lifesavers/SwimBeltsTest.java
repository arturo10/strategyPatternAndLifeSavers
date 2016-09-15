package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class SwimBeltsTest {
    @Test
    public void  testSwimBeltsTest(){
        SwimBelts swimBelts = new SwimBelts();
        assertEquals(DeflateBehavior.NOTDEFLATE, swimBelts.deflating());
        assertEquals(DeflateBehavior.NOTINFLATE, swimBelts.inflating());
        assertEquals(FlotationBehavior.FLOATING, swimBelts.floating());
    }
}
