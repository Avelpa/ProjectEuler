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
public class SherlockAndSquares {

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
        int min = in.nextInt();
        int max = in.nextInt()+1;
        
        min = (int)Math.ceil(Math.sqrt(min));
        max = (int)Math.ceil(Math.sqrt(max));
        
        System.out.println(max-min);
    }
    
}
