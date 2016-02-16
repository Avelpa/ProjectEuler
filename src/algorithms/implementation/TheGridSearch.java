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
public class TheGridSearch {

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
        // grid
        int gH = in.nextInt();
        int gW = in.nextInt();
        in.nextLine();
        
        char[][] grid = new char[gH][gW];
        for (int i = 0; i < gH; i ++)
        {
            grid[i] = in.nextLine().toCharArray();
        }
        // pattern
        int pH = in.nextInt();
        int pW = in.nextInt();
        in.nextLine();
        char[][] pattern = new char[pH][pW];
        for (int i = 0; i < pH; i ++)
        {
            pattern[i] = in.nextLine().toCharArray();
        }
        
        int row = 0;
        int col = 0;
        boolean yes = false;
        for (int i = 0; i <= gH-pattern.length; i ++)
        {
            for (int j = 0; j <= gW-pattern[0].length; j ++)
            {
                if (grid[i][j] == pattern[0][0])
                {
                    boolean good = true;
                    for (int m = 1; m < pattern.length; m ++)
                    {
                        for (int n = 0; n < pattern[0].length; n ++)
                        {
                            if (grid[i+m][j+n] != pattern[m][n])
                            {
                                good = false;
                                break;
                            }
                        }
                        if (!good)
                            break;
                    }
                    if (good)
                    {
                        yes = true;
                        break;
                    }
                }
            }
            if (yes)
                break;
        }
        if (yes)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
