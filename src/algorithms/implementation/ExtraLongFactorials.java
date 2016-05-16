/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class ExtraLongFactorials {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.print(solve(new BigInteger(in.next())));
    }
    
    private static BigInteger solve(BigInteger i)
    {
        if (i.equals(BigInteger.ZERO) || i.equals(BigInteger.ONE))
            return BigInteger.ONE;
        
        return i.multiply(solve(i.subtract(BigInteger.ONE)));
    }
}
