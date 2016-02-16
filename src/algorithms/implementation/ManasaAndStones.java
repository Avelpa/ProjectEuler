/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class ManasaAndStones {

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
        int numStones = in.nextInt()-1;
        int a = in.nextInt();
        int b = in.nextInt();
        
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        int difference = max-min;
        
        min *= numStones;
        max *= numStones;
        
        if (min == max)
            System.out.println(min);
        else
        {
            while (min < max)
            {
                System.out.print(min + " ");
                min += difference;
            }
            System.out.println(max);
        }
    }
    
}
