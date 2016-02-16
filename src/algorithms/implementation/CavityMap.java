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
public class CavityMap {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int length = in.nextInt();
        in.nextLine();
        char[][] tooth = new char[length][length];
        for (int i = 0; i < tooth.length; i ++)
        {
            tooth[i] = in.nextLine().toCharArray();
        }
        char[][] fillings = tooth;
        
        for (int i = 1; i < length-1; i++)
        {
            for (int j = 1; j < length-1; j ++)
            {
                int curDepth = tooth[i][j];
                if (tooth[i][j-1] < curDepth && tooth[i][j+1] < curDepth && tooth[i-1][j] < curDepth && tooth[i+1][j] < curDepth)
                {
                    fillings[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < length; i ++)
        {
            for (int j = 0; j < length; j ++)
            {
                System.out.print(fillings[i][j]);
            }
            if (i != length-1)
                System.out.println();
        }
    }
    
}
