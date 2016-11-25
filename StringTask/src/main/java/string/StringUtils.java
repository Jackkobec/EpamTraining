package string;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Task String. StringUtils.
 *
 * @author Evgeniy Kobec
 * @Skype skypejs77
 * @email jackkobec@gmail.com
 * <p>
 * Created by Jack on 22.11.2016.
 */
public class StringUtils implements IStringUtils {


    /**
     * Input Data validation
     *
     * @param args
     */
    private boolean checkStringForNullAndEmptyCondition(String... args) {

        for (String string : args) {

            if (null == string || string.isEmpty()) {
                throw new NullPointerException("Передано Null значение или пустая строка.");
            }
        }

        return false;
    }

    /**
     * checkStringForNullAndEmptyConditionJava8
     *
     * @param args
     * @return
     */
    private boolean checkStringForNullAndEmptyConditionJava8(String... args) {

        Arrays.stream(args)
               /*can be map*/.filter(str -> {
            if (str == null || str.isEmpty()) {
                throw new NullPointerException("Передано Null значение или пустая строка.");
            }
            return true;
        });

        return false;
    }

    /**
     * checkStringForNullAndEmptyConditionJava8Alt
     *
     * @param args
     * @return
     */
    private boolean checkStringForNullAndEmptyConditionJava8Alt(String... args) {

        Arrays.stream(args)
                .map(str -> (str == null || str.isEmpty()) ? new NullPointerException("Передано Null значение или пустая строка.") : true);

        return false;
    }

    /**
     * checkIsLetter
     *
     * @param string
     * @return
     */
    public boolean checkIsLetter(String string) {

        Pattern pattern = Pattern.compile("[a-zA-Z]");
        return pattern.matcher(string).matches();
    }

    /**
     * letterCount
     *
     * @param string
     * @return
     */
    @Override
    public int letterCount(String string) {

        checkStringForNullAndEmptyCondition(string);

        int count = 0;
        for (char ch : string.toCharArray()) {
            if (checkIsLetter(String.valueOf(ch))) {
                count++;
            }
        }

        return count;
    }

    /**
     * letterCountAlt
     *
     * @param string
     * @return
     */
    @Override
    public int letterCountAlt(String string) {

        checkStringForNullAndEmptyCondition(string);

        int count = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }

        return count;
    }

    /**
     * letterCountJava8
     *
     * @param string
     * @return
     */
    @Override
    public int letterCountJava8(String string) {

        checkStringForNullAndEmptyCondition(string);

        //return (int) string.chars().filter(ch -> Character.isLetter(ch)).count(); or next line
        return (int) string.chars().filter(Character::isLetter).count();//working
    }


    /**
     * compareTwoStringsWithIgnoreCase
     *
     * @param string1
     * @param string2
     * @return
     */
    @Override
    public boolean compareTwoStringsWithIgnoreCase(String string1, String string2) {

        return string1.equalsIgnoreCase(string2);
    }

    /**
     * compareTwoStringsWithIgnoreCaseJava8
     *
     * @param string1
     * @param string2
     * @return
     */
    @Override
    public boolean compareTwoStringsWithIgnoreCaseJava8(String string1, String string2) {

        return Stream.of(string1).allMatch(s -> s.equalsIgnoreCase(string2));
    }

    /**
     * toTheUpperCase
     *
     * @param string
     * @return
     */
    @Override
    public String toTheUpperCase(String string) {

        return string.toUpperCase();
    }

    /**
     * toTheUpperCaseJava8
     *
     * @param string
     * @return
     */
    @Override
    public String toTheUpperCaseJava8(String string) {

        //return Stream.of(string).map(s -> s.toUpperCase()).collect(Collectors.joining()); or next line
        return Stream.of(string).map(String::toUpperCase).collect(Collectors.joining());
    }


    /**
     * toTheLowerCase
     *
     * @param string
     * @return
     */
    @Override
    public String toTheLowerCase(String string) {

        return string.toLowerCase();
    }

    /**
     * toTheLowerCaseJava8
     *
     * @param string
     * @return
     */
    @Override
    public String toTheLowerCaseJava8(String string) {

        //return Stream.of(string).map(s -> s.toLowerCase()).collect(Collectors.joining()); or next line
        return Stream.of(string).map(String::toLowerCase).collect(Collectors.joining());
    }

    /**
     * allIndexesOfTheWord
     *
     * @param string
     * @param wold
     * @return
     */
    @Override
    public List<Integer> allIndexesOfTheWord(String string, String wold) {


        checkStringForNullAndEmptyCondition(string, wold);

        List<Integer> list = new ArrayList<>();
        int offset = 0;//start from 0 index

        //-7 means that next substring after wold match is empty or don't contains word
        while (offset != -7) {

            int currentIndex = string.indexOf(wold, offset);//index of wold match

            list.add(currentIndex);                         //add to result list because can be more then one match
            int newOffset = currentIndex + wold.length();   //calculate newOffset for move next on the string
            String subString = string.substring(newOffset); //local variable for usage

            offset = subString.contains(wold) && subString.length() >= wold.length() ? newOffset : -7; //for loop step
        }

        return list;
    }

    /**
     * changeWord
     *
     * @param string
     * @param wordForChange
     * @param newWord
     * @return
     */
    @Override
    public String changeWord(String string, String wordForChange, String newWord) {

        checkStringForNullAndEmptyCondition(string, wordForChange, newWord);

        return string.contains(wordForChange) ? string.replaceAll(wordForChange, newWord) : string;
    }

    /**
     * changeWordJava8
     *
     * @param string
     * @param wordForChange
     * @param newWord
     * @return
     */
    @Override
    public String changeWordJava8(String string, String wordForChange, String newWord) {

        checkStringForNullAndEmptyCondition(string, wordForChange, newWord);

        return Stream.of(string).map(str -> {

            if (str.contains(wordForChange)) {
                return str.replaceAll(wordForChange, newWord);
            }

            return str;

        }).collect(Collectors.joining());
    }

    /**
     * countOfTheRepeatedWords
     *
     * @param string
     * @return
     */
    @Override
    public Map<String, Integer> countOfTheRepeatedWords(String string) {

        checkStringForNullAndEmptyCondition(string);
        String trimed = string.replaceAll("\\s*", "");

        //String pattern = "[\\s+|,\\s*]";
        String pattern = "[,]";//pattern for separate string in array elements

        //String[] strings = string.split(pattern);
        List<String> listOfAllWords = new ArrayList<>(Arrays.asList(trimed.split(pattern)));

        Set<String> words = new LinkedHashSet<>();//set for add any word and check is it unique
        Set<String> uniqueRepeatedWords = new LinkedHashSet<>();//set for save unique repeated words
        int count = 0;

        System.out.println("listOfAllWords: " + listOfAllWords);
        for (String s : listOfAllWords) {

            if (words.add(s)) {

            } else {
                uniqueRepeatedWords.add(s);
                count++;
            }
        }

        System.out.println("Count of repeated words = " + (count + uniqueRepeatedWords.size()));
        System.out.println("uniqueRepeatedWords" + uniqueRepeatedWords);

        return countRepeatsForEachWordFromList(listOfAllWords, uniqueRepeatedWords);
    }

    /**
     * countOfTheRepeatedWordsJava8
     *
     * @param string
     * @return
     */
    @Override
    public Map<String, Integer> countOfTheRepeatedWordsJava8(String string) {

        checkStringForNullAndEmptyCondition(string);
        String trimed = string.replaceAll("\\s*", "");

        String pattern = "[,]";//pattern for separate string in array elements

        List<String> listOfAllWords = new ArrayList<>(Arrays.asList(trimed.split(pattern)));

        Set<String> words = new LinkedHashSet<>();
        Set<String> uniqueRepeatedWords = new LinkedHashSet<>();
        int[] countJ8 = {0};//use array element cause anonymous class or stream have access only to the final variables -> ins huck

        System.out.println("listOfAllWords: " + listOfAllWords);

        listOfAllWords.stream().forEach(str -> {
            if (words.add(str)) {

            } else {
                uniqueRepeatedWords.add(str);
                countJ8[0]++;
            }
        });

        System.out.println("Count of repeated words = " + (countJ8[0] + uniqueRepeatedWords.size()));
        System.out.println("uniqueRepeatedWords " + uniqueRepeatedWords);

        return countRepeatsForEachWordFromList(listOfAllWords, uniqueRepeatedWords);
    }

    /**
     * countRepeatsForEachWordFromList
     *
     * @param listOfAllWords
     * @param uniqueRepeatedWords
     * @return
     */
    public Map<String, Integer> countRepeatsForEachWordFromList(List<String> listOfAllWords, Set<String> uniqueRepeatedWords) {

        Map<String, Integer> wordsWithCountMap = new LinkedHashMap<>();

//        for (String key : uniqueRepeatedWords) {
//            wordsWithCountMap.put(key, (int) listOfAllWords.stream().filter(el -> el.equals(key)).count());
//        }
        uniqueRepeatedWords.forEach(k -> wordsWithCountMap.put(k, (int) listOfAllWords.stream().filter(el -> el.equals(k)).count()));

        return wordsWithCountMap;
    }
}
