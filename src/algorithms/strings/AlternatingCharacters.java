/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.strings;

import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class AlternatingCharacters {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numTests = in.nextInt();
        in.nextLine();
        while(numTests-- > 0){
            solve();
        }
    }
    
    private static void solve()
    {
        char[] test = in.next().toCharArray();
        int numDel = 0;
        for (int i = 0; i < test.length-1; i ++){
            if (test[i] == test[i+1])
                numDel ++;
        }
        System.out.println(numDel);
    }
    
    private static void solveBad()
    {
        char[] sequence = in.nextLine().toCharArray();
        int numDel = 0;
        char prev = sequence[0];
        int i = 0;
        do{
            prev = sequence[i];
            i ++;
            while (i < sequence.length && sequence[i] == prev)
            {
                numDel ++;
                i ++;
            }
        } while (i < sequence.length);
        System.out.println(numDel);
    }
}
