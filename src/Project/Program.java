package Project;

import java.util.Scanner;

/**
 * Created by MyszkaMartynka on 2017-10-31.
 */
public class Program
{
    private String sentence;

    public static void main(String[] args)
    {
        new Program();
    }

    Program()
    {
        sentenceInput();
        System.out.print("Sentence: " + sentence);
        System.out.print("\n");
        SubstitutionCipher.encryption(sentence);
        SwitchCipher.maina(sentence);
    }

    private void sentenceInput()
    {
        System.out.print("Please, write the sentence, which you would like to cypher: ");
        Scanner reading = new Scanner(System.in);
        sentence = reading.nextLine();
        sentence = "Ala ma kota";
    }
}
