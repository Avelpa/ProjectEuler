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
    
    public static void efficient()
    {
        int index = in.nextInt();
        int tempIndex = 1;
        long num = 2L;
        
        while (tempIndex < index)
        {
            do {
                num ++;
            } while (!isPrime(num));
            tempIndex ++;
        }
        
        System.out.println(num);
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
    
    private static boolean isPrime(long n)
    {
        for (int i = 2; i <= (long)Math.sqrt(n); i ++)
        {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
