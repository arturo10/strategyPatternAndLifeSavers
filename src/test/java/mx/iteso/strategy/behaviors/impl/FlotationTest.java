package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.TestUtils;
import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class FlotationTest {
    @Test
    public void testFlotation() {
        Flotation floating = new Flotation();
        assertEquals(FlotationBehavior.FLOATING,floating.floating());

    }
}
