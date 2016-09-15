package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class WaterTubesTest {
    @Test
    public void testWaterTubesTest(){
        WaterTubes waterTubes = new WaterTubes();
        assertEquals(DeflateBehavior.DEFLATE, waterTubes.deflating());
        assertEquals(DeflateBehavior.INFLATE, waterTubes.inflating());
        assertEquals(FlotationBehavior.FLOATING, waterTubes.floating());
    }
}
