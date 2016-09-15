package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class FoamFloatTest {

    @Test
    public void  testFoamFloatTest(){
        FoamFloat foamFloat = new FoamFloat();
        assertEquals(DeflateBehavior.DEFLATE, foamFloat.deflating());
        assertEquals(DeflateBehavior.INFLATE, foamFloat.inflating());
        assertEquals(FlotationBehavior.FLOATING, foamFloat.floating());
    }
}
