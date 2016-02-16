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
public class ModifiedKaprekarNumbers {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            solve();
    }
    
    private static void solve()
    {
        long lowest = in.nextInt();
        long highest = in.nextInt();
        
        boolean valid = false;
        for (long i = lowest; i <= highest; i ++)
        {
            if (isKaprekar(i))
            {
                valid = true;
                System.out.print(i + " ");
            }
        }
        if (!valid)
            System.out.println("INVALID RANGE");
    }
    
    private static boolean isKaprekar(long n)
    {
        long square = n*n;
        
        long[] digits = new long[(int)Math.log10(square)+1];
        
        int i = digits.length-1;
        while (square != 0)
        {
            digits[i] = square%10;
            square /= 10;
            i --;
        }
        
        long sum = 0;
        
        int left = digits.length/2;
        
        int power = left-1;
        for (int j = 0; j < left; j ++)
        {
            sum += digits[j]*Math.pow(10, power);
            power --;
        }
        
        power = digits.length-left-1;
        for (int j = left; j < digits.length; j ++)
        {
            sum += digits[j]*Math.pow(10, power);
            power --;
        }
        
        return sum == n;
    }
}
