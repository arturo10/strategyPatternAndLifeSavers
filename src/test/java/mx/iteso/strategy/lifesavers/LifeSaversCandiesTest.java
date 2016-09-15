package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class LifeSaversCandiesTest {
    @Test
    public void  testLifeSaversCandiesTest(){
        LifeSaversCandies lifeSaversCandies = new LifeSaversCandies();
        assertEquals(DeflateBehavior.NOTDEFLATE, lifeSaversCandies.deflating());
        assertEquals(DeflateBehavior.NOTINFLATE, lifeSaversCandies.inflating());
        assertEquals(FlotationBehavior.NOTFLOATING, lifeSaversCandies.floating());
    }
}
