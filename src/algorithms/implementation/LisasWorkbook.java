/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class LisasWorkbook {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int chapters = in.nextInt();
        int maxProbs = in.nextInt();
        
        int special = 0;
        int page = 1;
        int leftOver = 0;
        
        for (int i = 0; i < chapters; i ++)
        {
            //2 , 1
            int numProbs = in.nextInt();
            page += (numProbs+leftOver)/maxProbs;
            leftOver = numProbs%maxProbs;
            
        }
        System.out.println(special);
    }
}
