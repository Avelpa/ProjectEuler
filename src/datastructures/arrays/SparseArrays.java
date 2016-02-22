/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures.arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Dmitry   
 */
public class SparseArrays {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int n = in.nextInt();
        
        HashMap<String, Integer> strs = new HashMap();
        
        while (n-- > 0)
        {
            String word = in.next();
            if (strs.containsKey(word))
                strs.put(word, strs.get(word)+1);
            else
                strs.put(word, 1);
        }
        
        int q = in.nextInt();
        while (q-- > 0)
        {
            String search = in.next();
            if (strs.containsKey(search))
                System.out.println(strs.get(search));
            else
                System.out.println(0);
        }
    }
}
