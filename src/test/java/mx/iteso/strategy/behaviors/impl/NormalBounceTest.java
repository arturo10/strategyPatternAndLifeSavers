package mx.iteso.strategy.behaviors.impl;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class NormalBounceTest {
    @Test
    public void testNormalBounce() {
        NormalBounce normal = new NormalBounce();
        assertEquals(TestUtils.NORMALBOUNCE,normal.bounce());

    }
}

