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
public class Q1 {
    
    
    public static void inefficient()
    {
        long limit = in.nextLong();
        long sum = 0;
        
        for (long i = 1; i < limit; i ++)
        {
            for (long j = 1; j <= limit-i; j ++)
            {
                for (long k = 1; k <= limit-i-j; k ++)
                {
                    if (i + j + k == limit)
                    {
                        long sum2 = i * j * k;
                        if (sum2 > sum)
                        {
                            sum = sum2;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
    
    public static void efficient()
    {
        long limit = in.nextLong();
        long sum = 0;

        sum += findSum(limit, 3);
        sum += findSum(limit, 5);
        sum -= findSum(limit, 15);

        System.out.println(sum);
    }
    
    private static long findSum(long n, long multiple)
    {
        n = (n-1)/multiple*multiple;
        return (n/multiple)*(multiple+n)/2;
    }
    
}
