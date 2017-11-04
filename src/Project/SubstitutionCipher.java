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
        //divideSentence(sentence);
        //Arrays.asList(divideSentence(sentence)).forEach(System.out::println);
        substitutionWithAscii(divideSentence(sentence));
    }

    private static String[] divideSentence(String sentence)
    {
        return sentence.split(" ");
    }

    private static void substitutionWithAscii (String[] separatedWords)
    {
        for(int i = 0; i < separatedWords.length; i++)
        {
            int sum = 0;

            char firstChar = separatedWords[i].charAt(0);

            int firstCharInInt = (int) firstChar;


            //String.valueOf przerabia na stringa, chars() rozdziela stringa na znaki , toArray dodaje te znaki do tablicy
            //int[] firstCharAsIntArray = String.valueOf(firstCharInInt).chars().mapToObj(integer -> (char)integer).toArray();
            LinkedList<Integer> listWithFirstChar = new LinkedList<Integer>();
            while (firstCharInInt > 0)
            {
                listWithFirstChar.push(firstCharInInt % 10);
                firstCharInInt = firstCharInInt / 10;
            }

            for(int j = 0; j < listWithFirstChar.size(); j++)
            {
                sum = sum + listWithFirstChar.get(j);
                //System.out.print("znak: " + listWithFirstChar.get(j) + " ");
            }

            ///////////////////////////////////////////////////////////////////////////////
            char[] separatedChars = new char[separatedWords[i].length()];
            for(int m = 0; m < separatedChars.length; m++)
            {
                separatedChars[m] = separatedWords[i].charAt(m);
                System.out.print(separatedChars[m] + " ");
            }
            System.out.print("\n");

            int[] separatedCharsInInt = new int[separatedChars.length];
            for(int n = 0; n < separatedCharsInInt.length; n++)
            {
                separatedCharsInInt[n] = (int) separatedChars[n];
                System.out.print(n + " = " + separatedCharsInInt[n] + "\n");
            }
            System.out.print("\n");

            /////////////////////////////////////////////////////////////////
            
            for(int k = 1; k < separatedCharsInInt.length; k++)
            {
                separatedCharsInInt[k] += sum;
                System.out.print(sum + " - " + k + " = "+ separatedCharsInInt[k] + " " + "\n");
                sum++;
            }



            ////////////////////////////////////////


        }
    }
}
