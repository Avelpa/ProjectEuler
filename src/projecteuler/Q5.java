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
public class Q5 {
    
    public static void inefficient()
    {
        int n = in.nextInt();
        
        if (n <= 2)
        {
            System.out.println(n);
            return;
        }
        
        int i = 2;
        while(!isDivisible(i, n))
        {
            i += 2;
        }
        System.out.println(i);
    }
    
    public static boolean isDivisible(int num, int max)
    {
        for (int i = max; i >= 2; i --)
        {
            if (num%i != 0)
                return false;
        }
        return true;
    }
    
}
