/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codecrunch;

import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class AbsoluteValue {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        
        int extra = 0;
        
        int size = in.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i ++)
        {
            arr[i] = in.nextInt();
        }
        
        int numQ = in.nextInt();
        for (int i = 0; i < numQ; i ++)
        {
            extra += in.nextInt();
            System.out.println(getSum(arr, extra));
        }
    }
    
    private static int getSum(int[] arr, int extra)
    {
        int sum = 0;
        for (Integer i: arr)
            sum += Math.abs(i+extra);
        return sum;
    }
    
}
