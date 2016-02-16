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
public class TaumAndBday {

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
        long black = in.nextInt();
        long white = in.nextInt();
        long b = in.nextInt();
        long w = in.nextInt();
        long c = in.nextInt();
        
        long total = 0;
        if ((w+c)*black < b*black)
            total += (w+c)*black;
        else
            total += b*black;
        if ((b+c)*white < w*white)
            total += (b+c)*white;
        else
            total += w*white;
        
        System.out.println(total);
    }
}
