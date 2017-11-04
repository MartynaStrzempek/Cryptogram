package Project;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by MyszkaMartynka on 2017-10-31.
 */
public class SubstitutionCipher
{
    public static void encryption(String sentence)
    {
        System.out.print("encrypted sentence: " + combineWords(substitutionWithAscii(divideSentence(sentence))));
    }

    private static String[] divideSentence(String sentence)
    {
        return sentence.split(" ");
    }

    private static String[] substitutionWithAscii (String[] separatedWords)
    {
        for(int i = 0; i < separatedWords.length; i++)
        {
            int sum = 0;

            char firstChar = separatedWords[i].charAt(0);

            int firstCharInInt = (int) firstChar;

            LinkedList<Integer> listWithFirstChar = new LinkedList<Integer>();
            while (firstCharInInt > 0)
            {
                listWithFirstChar.push(firstCharInInt % 10);
                firstCharInInt = firstCharInInt / 10;
            }

            for(int j = 0; j < listWithFirstChar.size(); j++)
            {
                sum = sum + listWithFirstChar.get(j);
            }

            ///////////////////////////////////////////////////////////////////////////////
            char[] separatedChars = new char[separatedWords[i].length()];
            for(int j = 0; j < separatedChars.length; j++)
            {
                separatedChars[j] = separatedWords[i].charAt(j);
            }

            int[] separatedCharsInInt = new int[separatedChars.length];
            for(int j = 0; j < separatedCharsInInt.length; j++)
            {
                separatedCharsInInt[j] = (int) separatedChars[j];
            }

            /////////////////////////////////////////////////////////////////

            for(int j = 1; j < separatedCharsInInt.length; j++)
            {
                separatedCharsInInt[j] += sum;
                sum++;
            }

            ////////////////////////////////////////
            for(int j = 0; j < separatedChars.length; j++)
            {
                separatedChars[j] = (char) separatedCharsInInt[j];
            }

            StringBuilder builder = new StringBuilder();
            for(int j = 0; j < separatedChars.length; j++)
            {
                builder.append(separatedChars[j]);
            }
            separatedWords[i] = builder.toString();
        }
        return separatedWords;
    }

    private static String combineWords(String[] separatedWords)
    {
        String encryptedSentence;

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < separatedWords.length; i++)
        {
            builder.append(separatedWords[i]);
            builder.append(" ");
        }
        encryptedSentence = builder.toString();
        return encryptedSentence;
    }
}
