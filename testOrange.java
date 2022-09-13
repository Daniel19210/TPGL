import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class testOrange {
    @Test
    public void testEquals() {
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        o2.setOrigine("France");
        assertNotEquals(o1, o2);
    }    
}
