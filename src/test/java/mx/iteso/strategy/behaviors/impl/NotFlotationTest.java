package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationBehavior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 15/9/2016.
 */
public class NotFlotationTest {
    @Test
    public void testNotFlotation() {
        NotFlotation floating = new NotFlotation();
        assertEquals(FlotationBehavior.NOTFLOATING,floating.floating());

    }
}
