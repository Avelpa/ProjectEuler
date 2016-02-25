/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perplexedcodefest16;

import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class PrimeCouple {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numTests = in.nextInt();
        while(numTests-- > 0){
            solve();
        }
    }
    
    private static void solve()
    {
        int n = in.nextInt();
        
        int primeLow = n;
        int primeHigh = n;
        
        while (!isPrime(primeLow)){
            primeLow --;
        }
        while (!isPrime(primeHigh)){
            primeHigh ++;
        }
        
        if (n-primeLow <= primeHigh-n)
            System.out.println(primeLow);
        else
            System.out.println(primeHigh);
    }
    
    private static boolean isPrime(int n)
    {
        if (n == 2)
            return true;
        if (n%2 == 0 || n == 1)
            return false;
        
        boolean isPrime = true;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
