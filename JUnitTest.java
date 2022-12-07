import java.beans.Transient;

import org.junit.Test;
import StringCalc;

public class JUnitTest {
    @Test
    public int givenAnEmptyStringReturnZero() {
        assertEquals(0, Add(""));

    }
}
