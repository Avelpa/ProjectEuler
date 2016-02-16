/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.strings;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class Pangrams {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solveCool();
    }
    
    private static void solveCool()
    {
        char[] sentence = in.nextLine().replaceAll("\\s+", "").toLowerCase().toCharArray();
        BitSet letters = new BitSet();
        
        for (Character c: sentence)
        {
            if (Character.isAlphabetic(c))
                letters.set(c-'a');
        }
        
        System.out.println(letters.cardinality() == 26 ? "pangram" : "not pangram");
    }
    
    private static void solveOld()
    {
        boolean[] alphabet = new boolean[26];
        Arrays.fill(alphabet, false);
        char[] sentence = in.nextLine().toLowerCase().toCharArray();
        
        for (Character c: sentence)
        {
            if (Character.isAlphabetic(c))
                alphabet[c-'a'] = true;
        }
        
        boolean isPangram = true;
        for (Boolean b: alphabet)
        {
            if (!b)
            {
                isPangram = false;
                break;
            }
        }
        if (isPangram)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}
