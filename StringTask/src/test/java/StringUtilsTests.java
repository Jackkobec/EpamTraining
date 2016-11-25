import org.junit.Assert;
import org.junit.Test;
import string.IStringUtils;
import string.StringUtils;


/**
 * Task String. StringUtilsTests.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 24.11.2016.
 */
public class StringUtilsTests {

    private IStringUtils iStringUtils = new StringUtils();

    @Test
    public void testLetterCountPositive() {

        int expected = 7;
        String string = "kkkkkkk77777---///???&";

        Assert.assertEquals(expected, iStringUtils.letterCount(string));
        Assert.assertEquals(expected, iStringUtils.letterCountAlt(string));
        Assert.assertEquals(expected, iStringUtils.letterCountJava8(string));
    }

    @Test
    public void testLetterCountNegative() {

        int expected = 3;
        String string = "kkkkkkk77777---///???&";

        Assert.assertNotEquals(expected, iStringUtils.letterCount(string));
        Assert.assertNotEquals(expected, iStringUtils.letterCountAlt(string));
        Assert.assertNotEquals(expected, iStringUtils.letterCountJava8(string));
    }

    @Test
    public void testCompareTwoStringsWithIgnoreCasePositive() {

        String string = "equalsIgnoreCase";
        String string2 = "EQUALSignoreCASE";

        Assert.assertTrue(iStringUtils.compareTwoStringsWithIgnoreCase(string, string2));
        Assert.assertTrue(iStringUtils.compareTwoStringsWithIgnoreCaseJava8(string, string2));
    }

    @Test
    public void testCompareTwoStringsWithIgnoreCaseNegative() {

        String string = "equalsIgnoreCase";
        String string2 = "Filer";

        Assert.assertFalse(iStringUtils.compareTwoStringsWithIgnoreCase(string, string2));
        Assert.assertFalse(iStringUtils.compareTwoStringsWithIgnoreCaseJava8(string, string2));

    }

    @Test
    public void testToTheUpperCasePositive() {

        String string = "uppercase";
        String expected = "UPPERCASE";

        Assert.assertEquals(expected, iStringUtils.toTheUpperCase(string));
        Assert.assertEquals(expected, iStringUtils.toTheUpperCaseJava8(string));


    }

    @Test
    public void testToTheUpperCaseNegative() {

        String string = "Failer";
        String expected = "UPPERCASE";

        Assert.assertNotEquals(expected, iStringUtils.toTheUpperCase(string));
        Assert.assertNotEquals(expected, iStringUtils.toTheUpperCaseJava8(string));
    }

    @Test
    public void testToTheLowerCasePositive() {

        String string = "LOWERCASE";
        String expected = "lowercase";

        Assert.assertEquals(expected, iStringUtils.toTheLowerCase(string));
        Assert.assertEquals(expected, iStringUtils.toTheLowerCaseJava8(string));


    }

    @Test
    public void testToTheLowerCaseNegative() {

        String string = "Failer";
        String expected = "lowercase";

        Assert.assertNotEquals(expected, iStringUtils.toTheLowerCase(string));
        Assert.assertNotEquals(expected, iStringUtils.toTheLowerCaseJava8(string));
    }

    @Test
    public void testAllIndexesOfTheWordPositive() {

        String string = "kkgoodeigoodligood";
        String word = "good";

        String expected = "[2, 8, 14]";

        Assert.assertEquals(expected, iStringUtils.allIndexesOfTheWord(string, word).toString());
    }

    @Test
    public void testAllIndexesOfTheWordNegative() {

        String string = "kkgoodeigoodligood";
        String word = "good";

        String expected = "Failer";

        Assert.assertNotEquals(expected, iStringUtils.allIndexesOfTheWord(string, word).toString());
    }

    @Test
    public void testChangeWordPositive() {

        String string = "good->sgood->good";
        String wordForChange = "good";
        String newWord = "love";
        String expected = "love->slove->love";

        Assert.assertEquals(expected, iStringUtils.changeWord(string, wordForChange, newWord));
        Assert.assertEquals(expected, iStringUtils.changeWordJava8(string, wordForChange, newWord));
    }

    @Test
    public void testChangeWordNegative() {

        String string = "good->sgood->good";
        String wordForChange = "good";
        String newWord = "love";
        String expected = "Filer";

        Assert.assertNotEquals(expected, iStringUtils.changeWord(string, wordForChange, newWord));
        Assert.assertNotEquals(expected, iStringUtils.changeWordJava8(string, wordForChange, newWord));
    }

    @Test
    public void testCountOfTheRepeatedWordsPositive() {

        String string = "good, vasa, dcev, fev, good, vasa, vasa,   good,good,   vasa, good,good, good, love, love,   love";
        int expectedCount = 14;//look on console

        String extectedCountForAllRepeatedWords = "{good=7, vasa=4, love=3}";

        Assert.assertEquals(extectedCountForAllRepeatedWords, iStringUtils.countOfTheRepeatedWords(string).toString());
        System.out.println("======================");
        Assert.assertEquals(extectedCountForAllRepeatedWords, iStringUtils.countOfTheRepeatedWordsJava8(string).toString());
    }

    @Test
    public void testCountOfTheRepeatedWordsNegative() {

        String string = "dfhtrtyuytrghjuyt";
        int expectedCount = 0;//look on console

        String extectedCountForAllRepeatedWords = "Failer";

        Assert.assertNotEquals(extectedCountForAllRepeatedWords, iStringUtils.countOfTheRepeatedWords(string).toString());
        System.out.println("======================");
        Assert.assertNotEquals(extectedCountForAllRepeatedWords, iStringUtils.countOfTheRepeatedWordsJava8(string).toString());
    }

}

