/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms.implementation;

import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class LarrysArray {

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
        int size = in.nextInt();
        int prev = in.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i < size; i ++)
        {
            int next = in.nextInt();
            
            sum += next-prev;
            prev = next;
        }
        System.out.println("sum" + sum%2);
        
        boolean good = false;
        if (sum > 0)
        {
            if (sum%2 == 0)
                good = true;
        } else {
            if (Math.abs(sum)%2 == 1)
                good = true;
        }
        
        System.out.println(good ? "YES": "NO");
    }
    
}
