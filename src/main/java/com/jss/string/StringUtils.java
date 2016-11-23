package com.jss.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 23.11.2016.
 */
public class StringUtils implements IStringUtils {

    @Override
    public int letterCount(String string) {
        return 0;
    }

//    public boolean chakIsLetter(String string) {
//        Pattern pattern =
//    }

    @Override
    public boolean compareTwoStringsWithIgnoreCase(String string1, String string2) {

        return string1.equalsIgnoreCase(string2);
    }

    @Override
    public String toTheUperCase(String string) {

        return string.toUpperCase();
    }

    @Override
    public String toTheLowerCase(String string) {

        return string.toLowerCase();
    }

    @Override
    public List<Integer> allIndexesOfTheWord(String string, String wold) {

        List<Integer> list = new ArrayList<>();
        int currentIndex = string.indexOf(wold);
        list.add(currentIndex);

        return allIndexesOfTheWord(string.substring(currentIndex), wold);
    }

    @Override
    public String changeWord(String string, String wordForChange, String newWord) {

        return string.replaceAll(wordForChange, newWord);
    }

    @Override
    public int countOfTheRepitedWords(String string, String world) {
        return 0;
    }
}
