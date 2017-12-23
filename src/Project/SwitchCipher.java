package Project;

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

    public static void show(String sentence){
        podziel(mergedWordsInChars(mergeWords(SubstitutionCipher.getSplitSentence(sentence))), sentence);
    }

    private static int losowaLiczba(){
        return (int) Math.floor(Math.random()* 5) + 3;
    }

    private static int dzielnik(String sentence){
        int amountOfLetters = countLetters(sentence);
        int dzielnik;

        return dzielnik = amountOfLetters / losowaLiczba();
    }

    private static void podziel(char[] mergedWordsInChars, String sentence){
        int dzielnik = dzielnik(sentence);
        int counter = dzielnik;
        char[][] switchedSentence = new char[dzielnik][dzielnik + 1];
        int index = 0;
       
        }
    }
}

