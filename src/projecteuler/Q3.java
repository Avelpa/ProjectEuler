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
public class Q3 {
    
    /**
     * Go all the way down the right side of the prime factor tree
     */
    public static void efficient()
    {
        long n = in.nextLong();
        for (long i = 2; i <= Math.sqrt(n); i ++){
            while (n%i == 0 && n != i){
                n /= i;
            }
        }
        System.out.println(n);
    }
}
