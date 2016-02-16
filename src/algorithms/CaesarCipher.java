/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class CaesarCipher {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int n = in.nextInt();
        in.nextLine();
        char[] original = in.nextLine().toCharArray();
        int k = in.nextInt();
        
        char a;
        for (int i = 0; i < original.length; i ++)
        {
            if (Character.isAlphabetic(original[i]))
            {
                a = Character.isUpperCase(original[i]) ? 'A' : 'a';
                original[i] = (char)(a + (original[i]-a+k)%26);
            }
        }
        
        System.out.println(new String(original));
    }
    
}
