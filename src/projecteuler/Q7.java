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
    public static void inefficient()
    {
        int index = in.nextInt();
        
        int tempIndex = 1;
        long num = 2L;
        
        while (tempIndex < index)
        {
            augmentNum(num);
            tempIndex ++;
        }
        
        System.out.println(num);
    }
    
    private static void augmentNum(long num)
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
    }
}
