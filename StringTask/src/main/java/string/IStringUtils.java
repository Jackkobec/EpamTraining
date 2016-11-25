package string;

import java.util.List;
import java.util.Map;

/**
 * Task String. IStringUtils.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 22.11.2016.
 */
public interface IStringUtils {

    int letterCount(String string);

    int letterCountAlt(String string);

    int letterCountJava8(String string);

    boolean compareTwoStringsWithIgnoreCase(String string1, String string2);

    boolean compareTwoStringsWithIgnoreCaseJava8(String string1, String string2);

    String toTheUpperCase(String string);

    String toTheUpperCaseJava8(String string);

    String toTheLowerCase(String string);

    String toTheLowerCaseJava8(String string);

    List<Integer> allIndexesOfTheWord(String string, String wold);

    String changeWord(String string, String wordForChange, String newWord);

    String changeWordJava8(String string, String wordForChange, String newWord);

    Map<String, Integer> countOfTheRepeatedWords(String string);

    Map<String, Integer> countOfTheRepeatedWordsJava8(String string);

}
