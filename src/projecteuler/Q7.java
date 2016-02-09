/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;
import static projecteuler.ProjectEuler.in;
/**
 *
 * @author kobed6328
 */
public class Q7 {
    
    static long[] first10000primes = new long[10000];
    
    static { 
        // put in two initially since it's the only even prime number which is kind of annoying
        first10000primes[0] = 2;
    }
    
    /**
     * The prime check is slightly better (uses sqrt(n) property for composite numbers)
     * The biggest increase in efficiency is that every prime number up to 10000 index is stored once it is needed the first time
     * this means that if the 10000th prime number is needed the first time, the efficiency is something like O(n^2) or close to nlog(n)???
     *  but AFTER, for the other potentially 999 test cases, it's O(1)
     */
    public static void efficient()
    {
        int index = in.nextInt()-1;
        
        // if the index has already been used, just print it out here and stop
        if (first10000primes[index] != 0)
        {
            System.out.println(first10000primes[index]);
            return;
        }
        
        
        // find the last known index
        int tempIndex = index;
        do {
            tempIndex --;
        } while (first10000primes[tempIndex] == 0);
        
        long prime = first10000primes[tempIndex];
        
        
        // populate the array while augmenting index to desired one
        while (tempIndex < index)
        {
            do {
                if (prime == 2L)
                    prime ++;
                else
                    prime += 2;
            } while (!isPrime(prime));
            tempIndex ++;
            
            first10000primes[tempIndex] = prime;
        }
        
        System.out.println(prime);
    }
    
    private static boolean isPrime(long n)
    {
        for (int i = 3; i <= (long)Math.sqrt(n); i ++)
        {
            if (n%i == 0)
                return false;
        }
        return true;
    }
    
    
    /**
     * Takes the index and starts with the prime number 2 at temp index 1. 
     * While the temp index isn't the desired index, find the next prime number
     */
    public static void inefficient()
    {
        int index = in.nextInt();
        
        int tempIndex = 1;
        long num = 2L;
        
        while (tempIndex < index)
        {
            num = augmentNum(num);
            tempIndex ++;
        }
        
        System.out.println(num);
    }
    
    private static long augmentNum(long num)
    {
        boolean prime = false;
        while (!prime)
        {
            num ++;
            prime = true;
            for (long i = 2; i < num; i ++)
            {
                if (num%i == 0)
                {
                    prime = false;
                    break;
                }
            }
        }
        return num;
    }
}
