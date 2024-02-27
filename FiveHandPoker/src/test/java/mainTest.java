import org.junit.Test;

import static org.junit.Assert.*;

public class mainTest {

    main main = new main();
    @Test
    public void testbed() {
        assertEquals("Hello World!", main.Testbed("Hello World!"));
    }
}