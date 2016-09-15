package mx.iteso.strategy.behaviors.impl;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class IrregularBounceTest {

    @Test
    public void testExplode() {
        IrregularBounce irregular = new IrregularBounce();
        assertEquals(TestUtils.IRREGULARBOUNCE,irregular.bounce());

    }
}
