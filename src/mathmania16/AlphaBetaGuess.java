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
public class AlphaBetaGuess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long[] alpha = {1911, 2016, 1999, 4001, 1857};
        long[] beta = {167, 272, 255, 2257, 113};
        long n = 0L;
        
        boolean done = false;
        
        while (!done){
            n ++;
            done = true;
            for (int i = 0; i < alpha.length; i++)
            {
                if (n%alpha[i] != beta[i])
                    done = false;
            }
        }
        
        System.out.println(n%(1000000007));
    }
    
}
