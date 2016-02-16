/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms.strings;

import java.util.BitSet;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class Gemstones {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int numRocks = in.nextInt();
        
        int numGems = 0;
        int[] elements = new int[26];
        
        for (int i = 0; i < numRocks; i ++)
        {
            char[] rock = in.next().toCharArray();
            for (Character c: rock)
            {
                if (elements[c-'a'] == i)
                {
                    elements[c-'a'] ++;
                    if (elements[c-'a'] == numRocks)
                        numGems ++;
                }
            }
        }
        System.out.println(numGems);
    }
}
