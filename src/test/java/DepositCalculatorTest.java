import com.jss.flow_control.task3.DepositPercentCalculator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jack on 04.11.2016.
 */
public class DepositCalculatorTest {
    private DepositPercentCalculator depositPercentCalculator;
    double endSum;
    double startSum;
    double depositPercent;


    @Before
    public void init() {
        depositPercentCalculator = new DepositPercentCalculator();
        endSum = 77777;
        startSum = 7777;
        depositPercent = 22;
    }

    @Test
    public void teatYearCalculatePositive() throws DepositPercentCalculator.IncorrectInputDataException {
        int expected = 12;

        assertEquals(expected, depositPercentCalculator.calculateYearsWhile(endSum, startSum, depositPercent));
        assertEquals(expected, depositPercentCalculator.calculateYearsFor(endSum, startSum, depositPercent));

        assertEquals(expected, depositPercentCalculator.calculateYearsWhileInfinity(endSum, startSum, depositPercent));
        assertEquals(expected, depositPercentCalculator.calculateYearsForInfinity(endSum, startSum, depositPercent));

        assertEquals(expected, depositPercentCalculator.calculateYearsForInfinityWithLabel(endSum, startSum, depositPercent));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void teatYearCalculateNegative() throws DepositPercentCalculator.IncorrectInputDataException {
        expectedException.expect(DepositPercentCalculator.IncorrectInputDataException.class);
        expectedException.expectMessage("Переданные данные неверны.");

        depositPercentCalculator.calculateYearsWhile(0, startSum, depositPercent);
        depositPercentCalculator.calculateYearsFor(endSum, 0, depositPercent);

        depositPercentCalculator.calculateYearsWhileInfinity(endSum, 0, depositPercent);
        depositPercentCalculator.calculateYearsForInfinity(endSum, startSum, 0);

        depositPercentCalculator.calculateYearsForInfinityWithLabel(endSum, 0, depositPercent);
    }
}