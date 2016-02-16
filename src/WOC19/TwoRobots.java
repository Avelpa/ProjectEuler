/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WOC19;

import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class TwoRobots {
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
        int numBoxes = in.nextInt();
        int numQ = in.nextInt();
        
        int r1 = 0;
        int r2 = 0;
        
        for (int i = 1; i < numQ; i ++)
        {
            int start = in.nextInt();
            int end = in.nextInt();
        }
    }
}
