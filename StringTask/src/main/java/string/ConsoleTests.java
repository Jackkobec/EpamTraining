package string;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jack on 24.11.2016.
 */
public class ConsoleTests {

    public static void main(String[] args) {

        IStringUtils iStringUtils = new StringUtils();
        String string = "kkkkkkk";
        String string2 = "KKKKKKK";
        String string3 = "kkgoodeigoodlgood";
        String string4 = "good, vasa, dcev, fev, good, vasa, vasa,   good,good,   vasa, good,good, good, love, love,   love";

        //System.out.println(new StringBuffer(string3).indexOf("good", 3));

//        System.out.println(iStringUtils.letterCount(string));
//        System.out.println(iStringUtils.compareTwoStringsWithIgnoreCase(string, string2));
//        System.out.println(iStringUtils.toTheUpperCase(string));
//          System.out.println(iStringUtils.allIndexesOfTheWord(string3, "good"));
        System.out.println(iStringUtils.countOfTheRepeatedWords(string4));

    }

}
