/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class ProjectEuler {

    static Scanner in;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        in = new Scanner(System.in);
        
        System.out.print("Number of testcases: \n>> ");
        int numTestcases = in.nextInt();
        while (numTestcases-- > 0)
        {
            System.out.println(Q2Efficient(in.nextLong()));
        }
    }
    
    public static int Q2Efficient(long largestInclusive)
    {
     
//    public static int getIndex(int n)
//    {
//        
//        BigInteger index = BigInteger.valueOf(n);
//        index = index.multiply(Math.sqrt(5));
//        
//   var x = fib.multiply(Math.sqrt(5)).add((1/2));
//
//   return Math.round(x.log() / Math.log(phi()));
//}
//
//function phi()
//{
//   return (1 + Math.sqrt(5))/ 2;
//}
//    }   
        return 0;
    }
    
    /**
     * This simply uses an iterative approach [O(n)], which cycles through all the Fibonacci numbers less than
     * or equal to the input, and increases the total sum if the given Fibonacci number is even. A "better" solution [O(1)]
     * would take advantage of the Fibonacci index and value formulas...
     **/
    
    /**
     * Computes the sum of all the even Fibonacci numbers less than or equal to a specified input
     * @param largestInclusive the limit of the largest examined Fibonacci number
     * @return the 
     */
    public static int Q2Inefficient(int largestInclusive)
    {
        int prev = 0;
        int cur = 1;
        int sum = 0;
        
        while (cur <= largestInclusive)
        {
            if (cur % 2 == 0)
                sum += cur;
            
            int temp = prev;
            prev = cur;
            cur += temp;
        }
        return sum;
    }
}
