package Project;

import java.util.LinkedList;

public class DecryptionSubstitutionCipher
{
    public static String[] splitSentence (String sentence)
    {
        String encryptedSentence = SubstitutionCipher.getEncryptedSentence(sentence);
        return encryptedSentence.split(" ");
    }

    private static String[] substitutionWithAscii(String[] separatedWords)
    {
        for (int i = 0; i < separatedWords.length; i++)
        {
            int sum = 0;

            char firstChar = separatedWords[i].charAt(0);

            int firstCharInInt = (int) firstChar;
            //separation first char in ASCII to chars
            LinkedList<Integer> listWithFirstChar = new LinkedList<Integer>();
            while (firstCharInInt > 0)
            {
                listWithFirstChar.push(firstCharInInt % 10);
                firstCharInInt = firstCharInInt / 10;
            }

            //sum of chars in ASCII
            for (int j = 0; j < listWithFirstChar.size(); j++)
            {
                sum = sum + listWithFirstChar.get(j);
            }

            //separation chars in word
            char[] separatedChars = new char[separatedWords[i].length()];
            for (int j = 0; j < separatedChars.length; j++)
            {
                separatedChars[j] = separatedWords[i].charAt(j);
            }

            //change chars to ASCII
            int[] separatedCharsInInt = new int[separatedChars.length];
            for (int j = 0; j < separatedCharsInInt.length; j++)
            {
                separatedCharsInInt[j] = (int) separatedChars[j];
            }

            //encryption chars
            for (int j = 1; j < separatedCharsInInt.length; j++)
            {
                separatedCharsInInt[j] -= sum;
                sum++;
            }

            //change ASCII to chars
            for (int j = 0; j < separatedChars.length; j++)
            {
                separatedChars[j] = (char) separatedCharsInInt[j];
            }

            //building string from chars
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < separatedChars.length; j++)
            {
                builder.append(separatedChars[j]);
            }
            separatedWords[i] = builder.toString();
        }
        return separatedWords;
    }

    public static void decryption (String sentence)
    {
        System.out.println("Decrypted sentence : " + SubstitutionCipher.combineWords(substitutionWithAscii(splitSentence(sentence))));
    }
}
