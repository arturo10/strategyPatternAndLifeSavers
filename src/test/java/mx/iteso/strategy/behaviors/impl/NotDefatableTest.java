package mx.iteso.strategy.behaviors.impl;
import mx.iteso.strategy.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 14/9/2016.
 */
public class NotDefatableTest {

    @Test
    public void testDeflatableDeflate() {
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals(TestUtils.NOTDEFLATING,notDeflatable.deflate());

    }

    @Test
    public void testDeflatableInflate() {
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals(TestUtils.NOTINFLATING,notDeflatable.inflate());

    }
}
