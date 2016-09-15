package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class LifeVestTest {
    @Test
    public void  testLifeVestTest(){
        LifeVest lifeVest = new LifeVest();
        assertEquals(DeflateBehavior.NOTDEFLATE, lifeVest.deflating());
        assertEquals(DeflateBehavior.NOTINFLATE, lifeVest.inflating());
        assertEquals(FlotationBehavior.FLOATING, lifeVest.floating());
    }
}
