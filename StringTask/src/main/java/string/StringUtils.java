package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by Jack on 23.11.2016.
 */
public class StringUtils implements IStringUtils {

//    @Override
//    public int letterCount(String string) {
//
//        int count = 0;
//        for (char ch : string.toCharArray()) {
//            if (checkIsLetter(String.valueOf(ch))) {
//                count++;
//            }
//        }
//        return count;
//    }


    @Override
    public int letterCount(String string) {

        int count = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }
//    @Override
//    public int letterCount(String string) {
//
//        //return (int)string.chars().filter(ch -> String.valueOf(ch).contains("k")).count();
//        //return (int) Pattern.compile("[a-zA-Z]").string.chars().filter(ch -> ch == 'k').count();
//        //return StreamSupport.stream(new SpliterMatcher(Pattern.compile("[a-zA-Z]").matcher(string)), false).count();
//
//
////        return (int) Stream.of(string).filter(s -> pattern.matcher(String.valueOf(s)).matches()).count();/*работает при полном совпадении
////        и только для одной буквы*/
//        //return (int) string.chars().filter(s -> pattern.matcher(String.valueOf(s)).matches()).count();
//        //Stream<String> stream = Pattern.compile("[k]").splitAsStream(string);
//
//        //return (int) string.chars().filter(ch -> pattern.matcher(String.valueOf(ch)).matches()).count();
//
//        // List<String> list2 = list.stream().map(str -> someCondition(str) ? doSomeThing(str) : doSomethingElse(str)).collect(toList());
//
//        //return (int) Stream.of(string).map(s -> s.substring(1)).filter(Predicate.isEqual("k")).count();
//        //string.chars().map(ch -> checkIsLetter(String.valueOf(ch)) ? count[0]++ : count[0]++);
//        //Stream.of(string).map(str -> checkIsLetter(str) ? ++count[0] : ++count[0]);
//        //ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(string));
////        string.chars().map(s -> {
////            System.out.println("map: " + s);
////
////            return ++count[0];
////        });
//
//
//        return (int) string.chars().filter(Character::isLetter).count();//working
//        //return (int) string.chars().filter(ch -> Character.isLetter(ch)).count();//working
//        //return (int) string.chars().filter(pattern.asPredicate()).count();
//    }


    public boolean checkIsLetter(String string) {

        Pattern pattern = Pattern.compile("[a-zA-Z]");
        return pattern.matcher(string).matches();
    }

//    @Override
//    public boolean compareTwoStringsWithIgnoreCase(String string1, String string2) {
//
//        return string1.equalsIgnoreCase(string2);
//    }

    @Override
    public boolean compareTwoStringsWithIgnoreCase(String string1, String string2) {

        return Stream.of(string1).allMatch(s -> s.equalsIgnoreCase(string2));
    }

//    @Override
//    public String toTheUperCase(String string) {
//
//        return string.toUpperCase();
//    }

    @Override
    public String toTheUperCase(String string) {

        //return Stream.of(string).map(s -> s.toUpperCase()).collect(Collectors.joining()); or next line
        return Stream.of(string).map(String::toUpperCase).collect(Collectors.joining());
    }


//    @Override
//    public String toTheLowerCase(String string) {
//
//        return string.toLowerCase();
//    }

    @Override
    public String toTheLowerCase(String string) {

        //return Stream.of(string).map(s -> s.toLowerCase()).collect(Collectors.joining()); or next line
        return Stream.of(string).map(String::toLowerCase).collect(Collectors.joining());
    }

//    @Override
//    public List<Integer> allIndexesOfTheWord(String string, String wold) {
//
//        Pattern p = Pattern.compile(wold);
//        List<Integer> list = new ArrayList<>();
//        List<Integer> subList = new ArrayList<>();
//        if (string.isEmpty()) {
//            return new ArrayList<>();
//        }
//
//        //List<Integer> list = new ArrayList<>();
//        int currentIndex = string.indexOf(wold);
//
//        //list.addAll(allIndexesOfTheWord(string.substring(currentIndex+1), wold));
//        //list.addAll(allIndexesOfTheWord(string.substring(currentIndex + wold.length()-1), wold));
//        //list.add(currentIndex);
//        list = Stream.of(string).filter(p.asPredicate()).map(s -> s.indexOf(wold)).collect(Collectors.toList());
//
//        if (!string.isEmpty()) {
//            list.addAll(allIndexesOfTheWord(string.substring(currentIndex + wold.length() - 1), wold));
////            list.addAll(allIndexesOfTheWord(string.substring(currentIndex + wold.length() - 1), wold));
////            subList.add(string.indexOf(wold));
//        }
//        if (list.size() != 1) {
////            int[] result = new int[list.size()];
////            result = list.toArray();
////                    IntStream.range(1, list.size()).map(i -> result[i]).toArray();
//            //List<Integer> subList = list.subList(1, list.size());
//            for (int i = 0; i < list.size(); i++) {
//                if (i >= 1) {
//                    list.set(i, list.get(i) + wold.length() + 1);
//                }
//            }
//            //list = list.stream().map(el -> el + wold.length() + 1).collect(Collectors.toList());
//
//        }
//
//        return list;
//    }

    @Override
    public List<Integer> allIndexesOfTheWord(String string, String wold) {


        if (null == string || wold == null) {
            throw new NullPointerException("Передано null значение!");
        }

        if (string.isEmpty() || string.length() < wold.length()) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        int offset = 0;

        while (offset != -7) {

            int currentIndex = string.indexOf(wold, offset);
            list.add(currentIndex);
            String subString = string.substring(currentIndex + wold.length());
            int additionToOffset = currentIndex + wold.length();
            offset = subString.contains(wold) && subString.length() >= wold.length() ? additionToOffset : -7;
        }

        return list;
    }

//    @Override
//    public List<Integer> allIndexesOfTheWord(String string, String wold) {
//
//        List<Integer> list = new ArrayList<>();
//
//        //Pattern p = Pattern.compile("\\b" + wold + "\\b", Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
//        Pattern p = Pattern.compile(wold);
//        Matcher m = p.matcher(string);
//
//        while (m.find()) {
//            int currentIndex = string.indexOf(wold);
//            //list.add(currentIndex);
//
//            string = string.substring(currentIndex+1);
//        }
//        //list = Stream.of(string).filter(p.asPredicate()).map(s -> s.indexOf(wold)).collect(Collectors.toList());
//
//        return list;
//    }

    @Override
    public String changeWord(String string, String wordForChange, String newWord) {

        return string.replaceAll(wordForChange, newWord);
    }

    @Override
    public int countOfTheRepitedWords(String string, String world) {
        return 0;
    }
}
