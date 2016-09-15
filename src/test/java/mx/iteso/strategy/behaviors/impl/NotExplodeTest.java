package mx.iteso.strategy.behaviors.impl;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class NotExplodeTest {

    @Test
    public void testNotExplode() {
        NotExplode notExplode = new NotExplode();
        assertEquals(TestUtils.NOTEXPLODE,notExplode.explode());

    }
}
