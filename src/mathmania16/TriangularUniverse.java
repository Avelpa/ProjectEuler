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
public class TriangularUniverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 130304;
        double b = 221005;
        double c = 356987;
        
        long L = (long)(0.5*a*a + 1.5*a + 1);
        long R = (long)(0.5*c*c + 1.5*c + 1);
        
        long F = (long)((b+1)*(L+R));
        
        System.out.println(F%(1e9+7));
    }
    
}
