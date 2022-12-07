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

    @Test
    public void givenStringWithTwoNumbersWithCommaInBetweenReturnTheirSum() {
        assertEquals(3, instance.Add("1,2"));
    }

    @Test
    public void givenStringWithUnlimitedNumbersReturnsTheirSum() {
        assertEquals(10, instance.Add("2,3,5"));
    }

    @Test
    public void givenStringContainingNewLinesBetweenNumbersReturnsTheSum() {
        assertEquals(6, instance.Add("1\n2,3"));
    }

    @Test
    public void givenStringContainingNewLineFollowedByCommaOrViseVersa() {
        assertEquals(-1, instance.Add("1\n,"));
    }

    @Test
    public void givenStringContainingDelimeterReturnsTheSum() {
        assertEquals(3, instance.Add("//;\n1;2"));
    }
}
