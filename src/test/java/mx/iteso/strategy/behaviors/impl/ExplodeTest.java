package mx.iteso.strategy.behaviors.impl;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class ExplodeTest {

    @Test
    public void testExplode() {
        Explode explode = new Explode();
        assertEquals(TestUtils.EXPLODE,explode.explode());

    }
}
