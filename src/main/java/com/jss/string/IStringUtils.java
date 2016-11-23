package com.jss.string;

import java.util.List;

/**
 * Created by Jack on 23.11.2016.
 */
public interface IStringUtils {

    int letterCount(String string);

    boolean compareTwoStringsWithIgnoreCase(String string1, String string2);

    String toTheUperCase(String string);

    String toTheLowerCase(String string);

    List<Integer> allIndexesOfTheWord(String string, String wold);

    String changeWord(String string, String wordForChasnge, String newWord);

    int countOfTheRepitedWords(String string, String world);


}
