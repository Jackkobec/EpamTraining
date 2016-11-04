import com.jss.flow_control.task2.InputNumbersOperations;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Flow_control. Tests.
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 03.11.2016.
 */
public class InputNumbersOperationTest {
    private InputNumbersOperations inputNumbersOperations;
    List<Integer> list;

    @Before
    public void init() {
        inputNumbersOperations = new InputNumbersOperations();
        list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
    }

    @Test
    public void testFindMaxEl() {
        int expected = 7;
        assertEquals(expected, inputNumbersOperations.findMaxEl(list));
        assertEquals(expected, inputNumbersOperations.findMaxElLoop(list));
    }

    @Test
    public void testFindMinEl() {
        int expected = 3;
        assertEquals(expected, inputNumbersOperations.findMinEl(list));
        assertEquals(expected, inputNumbersOperations.findMinEl(list));
    }

    @Test
    public void testAverageOfAllEl() {
        double expected = 5.0;
        assertEquals(true, (Double.compare(inputNumbersOperations.findAverageOfAllElLoop(list), expected) == 0));
        assertEquals(true, (Double.compare(inputNumbersOperations.findAverageOfAllEl(list), expected) == 0));

    }

}
