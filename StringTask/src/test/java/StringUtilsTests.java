import org.junit.Assert;
import org.junit.Test;
import string.IStringUtils;
import string.StringUtils;

/**
 * Created by Jack on 24.11.2016.
 */
public class StringUtilsTests {

    private IStringUtils iStringUtils = new StringUtils();

    @Test
    public void testLetterCountPositive() {

        int expected = 7;
        String string = "kkkkkkk77777---///???&";

        Assert.assertEquals(expected, iStringUtils.letterCount(string));
    }

    @Test
    public void testLetterCountNegative() {

        int expected = 3;
        String string = "kkkkkkk77777---///???&";

        Assert.assertNotEquals(expected, iStringUtils.letterCount(string));
    }

}
