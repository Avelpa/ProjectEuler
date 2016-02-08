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
public class Q6 {

    public static void inefficient()
    {
        long max = in.nextLong();
        long diff = squareOfSum(max)-sumOfSquares(max);
        System.out.println(diff);
    }
    
    private static long sumOfSquares(long num)
    {
        long sum = (2*num*num*num+3*num*num+num)/6;
        return sum;
    }
    
    private static long squareOfSum(long num)
    {
        long sum = (long)(((double)num+1)/2*num);
        sum *= sum;
        return sum;
    }
    
}
