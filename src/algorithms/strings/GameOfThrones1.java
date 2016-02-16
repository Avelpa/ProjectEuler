/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms.strings;

import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class GameOfThrones1 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int[] letters = new int[26];
        
        char[] str = in.next().toCharArray();
        for (Character c: str)
            letters[c-'a'] ++;
        
        int numOdds = 0;
        boolean one = false;
        for (Integer i: letters)
        {
            if (i % 2 != 0)
            {
                if (i == 1)
                {
                    if (!one)
                        one = true;
                    else
                    {
                        System.out.println("NO");
                        return;
                    }
                }
                numOdds ++;
            }
        }
        System.out.println((numOdds%2 != 0 || numOdds == 0 ? "YES" : "NO"));
    }
    
}
