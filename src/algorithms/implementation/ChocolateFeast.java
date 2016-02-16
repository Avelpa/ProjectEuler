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
public class ChocolateFeast {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numTests = in.nextInt();
        while(numTests-- > 0){
            solveLoop();
        }
    }
    
    private static void solveFormula()
    {
        int money = in.nextInt();
        int cost = in.nextInt();
        int limit = in.nextInt();
        
        int result =  money/cost + (money/cost-1)/(limit-1);
        System.out.println(result);
    }
    
    private static void solveLoop()
    {
        int money = in.nextInt();
        int cost = in.nextInt();
        int limit = in.nextInt();
        
        int wrappers = money/cost;
        int total = wrappers;
        
        while (wrappers >= limit)
        {
            total ++;
            wrappers -= limit;
            wrappers ++;
        }
        System.out.println(total);
    }
    
}
