/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import static projecteuler.ProjectEuler.in;
/**
 *
 * @author Dmitry
 */
public class Q4 {

    
    public static void efficient()
    {
        long largest = in.nextLong();
        for (long i = largest; i >= 101101; i--)
        {
            if (isPalindrome(i) && isDivisible(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
    
    private static boolean isDivisible(long n)
    {
        for (int i = 100; i <= 999; i ++)
        {
            if (n%i == 0 && (int)Math.log10(n/i)+1 == 3)
                return true;
        }
        return false;
    }
    
    private static boolean isPalindrome(long n)
    {
        long original = n;
        long reverse = 0;
        while (n > 0)
        {
            reverse *= 10;
            reverse += n%10;
            n /= 10;
        }
        return reverse == original;
    }
    
}
