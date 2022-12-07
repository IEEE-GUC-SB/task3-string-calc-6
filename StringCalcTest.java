import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class StringCalcTest {
    StringCalc instance = new StringCalc();

    @BeforeEach
    void setUp() {
        instance = new StringCalc();
    }

    @Test
    public void givenAnEmptyStringReturnZero() {
        assertEquals(0, instance.Add(""));

    }

    @Test
    public void givenStringWithOneNumberReturnThatNumber() {
        assertEquals(4, instance.Add("4"));

    }
}
