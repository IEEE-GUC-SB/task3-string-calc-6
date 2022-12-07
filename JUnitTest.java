import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class JUnitTest {
    StringCalc instance;

    @BeforeEach
    void setUp() {
        instance = new StringCalc();
    }

    @Test
    public void givenAnEmptyStringReturnZero() {
        assertEquals(0, instance.Add(""));

    }
}
