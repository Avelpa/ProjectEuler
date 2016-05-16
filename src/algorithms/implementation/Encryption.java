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
public class Encryption {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        String input = in.nextLine();
        
        double sqrt = Math.sqrt(input.length());
        
        int cols, rows;
        if (input.length()%Math.floor(sqrt) > input.length()%Math.ceil(sqrt))
        {
            cols = (int)Math.floor(sqrt);
        } else {
            cols = (int)Math.ceil(sqrt);
        }
        
        rows = (int)Math.ceil((double)input.length()/cols);
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < cols; i ++)
        {
            for (int j = 0; j < rows; j ++)
            {
                if (i + j*cols < input.length())
                {
                    answer.append(input.charAt(i+j*cols));
                } else {
                    break;
                }
            }
            answer.append(" ");
        }
        
        System.out.println(answer);
    }
}
