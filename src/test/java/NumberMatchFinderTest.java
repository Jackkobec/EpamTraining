import com.jss.flow_control.task1.NumberMatchFinder;
import com.jss.flow_control.task3.DepositPercentCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Flow_control. Tests.
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 03.11.2016.
 */
public class NumberMatchFinderTest {
    private NumberMatchFinder numberMatchFinder;
    private int number;
    private int digit;

    @Before
    public void init() {
        numberMatchFinder = new NumberMatchFinder();
        number = 75775747;
        digit = 7;
    }

    @Test
    public void testNumberMatchFinderPositive() {
        int actual = 5;

        Assert.assertEquals(actual, numberMatchFinder.findNumberMatchCount(number, digit));
        Assert.assertEquals(actual, numberMatchFinder.findNumberMatchCount2(number + "", digit + ""));
        Assert.assertEquals(actual, numberMatchFinder.findNumberMatchCount3(number, digit));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test()
    public void testNumberMatchFinderNegative() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Передан 0");

        numberMatchFinder.findNumberMatchCount(0, digit);
        numberMatchFinder.findNumberMatchCount2(0 + "", digit + "");
        numberMatchFinder.findNumberMatchCount3(0, digit);
    }
}
