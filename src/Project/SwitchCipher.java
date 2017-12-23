package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MyszkaMartynka on 2017-12-19.
 */
public class SwitchCipher
{
    private static String mergeWords(String[] words){
        String mergedWords;

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < words.length; i++)
        {
            builder.append(words[i]);
        }
        return mergedWords = builder.toString();
    }

    private static char[] mergedWordsInChars(String mergeWords){
        char[] chars = new char[mergeWords.length()];
        for(int i = 0; i < chars.length; i++) {
            chars[i] = mergeWords.charAt(i);
        }
        return chars;
    }

    private static int countLetters (String sentence){
        int amountOfLetters;
        return amountOfLetters = sentence.length();
    }

//    public static void showme(String sentence){
//        System.out.print("to cos : ");
//        mergedWordsInChars(mergeWords(SubstitutionCipher.getSplitSentence(sentence)));
//    }

//    public static void show(String sentence){
//        podziel(mergedWordsInChars(mergeWords(SubstitutionCipher.getSplitSentence(sentence))), sentence);
//    }

    private static int losowaLiczba(){
        return (int) Math.floor(Math.random()* 5) + 3;
    }

    private static int dzielnik(String sentence){
        int amountOfLetters = countLetters(sentence);
        int dzielnik;

        return dzielnik = amountOfLetters / losowaLiczba();
    }

    private static String[] podziel(String mergedWords, String sentence){
        int dzielnik = dzielnik(sentence);
        List<String> parts = new ArrayList<>();

        int length = mergedWords.length();
        for (int i = 0; i < length; i += dzielnik) {
            parts.add(mergedWords.substring(i, Math.min(length, i + dzielnik)));
        }
        return parts.toArray(new String[0]);
    }

//    public static void maina(String sentence){
//
//        System.out.println("to: " + Arrays.toString(podziel(mergeWords(SubstitutionCipher.getSplitSentence(sentence)), sentence)));
//    }
}

