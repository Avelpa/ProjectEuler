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
public class FunnyString {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numTests = in.nextInt();
        while(numTests-- > 0){
            solve();
        }
    }
    
    private static void solve()
    {
        char[] word = in.next().toCharArray();
        
        boolean funny = true;
        int diff1 = 0;
        int diff2 = 0;
        for (int i = 1; i < word.length; i ++)
        {
            diff1 = Math.abs(word[i]-word[i-1]);
            diff2 = Math.abs(word[word.length-i-1]-word[word.length-i]);
            if (diff1 != diff2)
            {
                funny = false;
                break;
            }
        }
        
        if (funny)
            System.out.println("Funny");
        else
            System.out.println("Not Funny");
    }
}
