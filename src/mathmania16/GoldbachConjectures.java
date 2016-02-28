/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathmania16;

/**
 *
 * @author Dmitry
 */
public class GoldbachConjectures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long maxProduct = 0;
        
        long n = 94345468;
        
        if (isPrime(n-2))
            maxProduct = 2*(n-2);
        
        for (int i = 3; i <= n-i; i++)
        {
            if (isPrime(i) && isPrime(n-i))
            {
                if (maxProduct < i*(n-i))
                    maxProduct = i*(n-i);
            }
        }
        
        System.out.println(maxProduct);
        
    }
    //2225266833016531
    private static boolean isPrime(long n)
    {
        if (n == 2)
            return true;
        if (n%2 == 0)
            return false;
        
        for (int i = 3; i <= Math.sqrt(n); i ++)
        {
            if (n%i == 0)
                return false;
        }
        
        return true;
    }
    
}
