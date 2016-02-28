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
public class SeriesResistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int index = 11021993;
        long base = 0;
        long exp = 0;
        
        for (int i = 1; i <= index; i ++)
        {
            exp += base;
            if (i%2 == 0)
            {
                base = 2;
            }
            else
            {
                base = 3;
            }
        }
        //5.087291284850963E235
        System.out.println(" " + base);
        System.out.println(" " + exp);
        System.out.println(Math.pow(2, 783));
        long num = (long)Math.pow(base, exp);
        System.out.println(num%1000000007);
    }
    
}
