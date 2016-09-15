package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class SwimSeatTest {
    @Test
    public void  testSwimSeatTest(){
        SwimSeat swimSeat = new SwimSeat();
        assertEquals(DeflateBehavior.NOTDEFLATE, swimSeat.deflating());
        assertEquals(DeflateBehavior.NOTINFLATE, swimSeat.inflating());
        assertEquals(FlotationBehavior.FLOATING, swimSeat.floating());
    }
}
