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
public class Q2 {
    
    private static long getIndex(long fibNum)
    {
        fibNum*=Math.sqrt(5);
        fibNum += 0.5;
        
        return Math.round(Math.log(fibNum)/Math.log(Phi()));
    }
    private static long getNumber(long index)
    {
        return (long)((Math.pow(Phi(), index)-Math.pow(phi(), index))/Math.sqrt(5));
    }

    private static double phi()
    {
        return (1-Math.sqrt(5))/2;
    }
    private static double Phi()
    {
        return (1+Math.sqrt(5))/2;
    }
    
    /**
     * BROKEn
     */
    public static void efficient()
    {
        long index = getIndex(in.nextLong());
        index = 3*(long)Math.floor(index/3);
        
        long sum = 0;
        
        for (long i = index; i > 0; i-=3)
        {
            sum += getNumber(i);
        }
        System.out.println(sum);
    }
    
    /**
     * This simply uses an iterative approach [O(n)], which cycles through all the Fibonacci numbers less than
     * or equal to the input, and increases the total sum if the given Fibonacci number is even. A "better" solution [O(1)]
     * would take advantage of the Fibonacci index and value formulas...
    /**
     * Computes the sum of all the even Fibonacci numbers less than or equal to a specified input
     */
    public static void inefficient()
    {
        long largestInclusive = in.nextLong();
        
        long prev = 0;
        long cur = 1;
        long sum = 0;
        
        while (cur <= largestInclusive)
        {
            if (cur % 2 == 0)
                sum += cur;
            
            long temp = prev;
            prev = cur;
            cur += temp;
        }
        System.out.println(sum);
    }
}
