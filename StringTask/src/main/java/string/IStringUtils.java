package string;

import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Created by Jack on 23.11.2016.
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

    int countOfTheRepeatedWords(String string);


}
