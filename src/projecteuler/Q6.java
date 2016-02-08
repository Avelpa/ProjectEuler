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

    public static void efficient()
    {
        long max = in.nextLong();
        long diff = (3*pow(max, 4)+2*pow(max, 3)-3*pow(max, 2)-2*max)/12;
        System.out.println(diff);
    }
    
    private static long pow(long num, int power)
    {
        long original = num;
        for (int i = 0; i < power-1; i ++)
        {
            num *= original;
        }
        return num;
    }
    
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
