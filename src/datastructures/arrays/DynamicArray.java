/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class DynamicArray {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        final int N = in.nextInt();
        int q = in.nextInt();
        
        ArrayList<Integer>[] arrs = new ArrayList[N];
        for (int i = 0; i < arrs.length; i ++)
        {
            arrs[i] = new ArrayList();
        }
        
        int lastans = 0;
        while (q-- > 0)
        {
            int type = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            
            if (type == 1){
                arrs[(x^lastans)%N].add(y);
            }
            else if (type == 2)
            {
                lastans = arrs[(x^lastans)%N].get(y%arrs[(x^lastans)%N].size());
                System.out.println(lastans);
            }
        }
    }
}
