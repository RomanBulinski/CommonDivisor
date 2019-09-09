import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void testGc1() {
        assertEquals(6, Main.compute(30,12));
    }

    @Test
    public void testGc2() {
        assertEquals(1, Main.compute(8,9));
    }

    @Test
    public void testGcd3() {
        assertEquals(1, Main.compute(1,1));
    }


}
