/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.strings;

import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class MakeItAnagram {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int[] letters = new int[26];
        
        char[] first = in.next().toCharArray();
        for (Character c: first)
        {
            letters[c-'a'] ++;
        }
        char[] second = in.next().toCharArray();
        for (Character c: second)
        {
            letters[c-'a'] --;
        }
        
        int numDeletions = 0;
        
        for (Integer i: letters)
        {
            numDeletions += Math.abs(i);
        }
        System.out.println(numDeletions);
    }
}
