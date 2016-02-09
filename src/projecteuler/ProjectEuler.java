/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class ProjectEuler {

    static Scanner in = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Number of testcases: \n>> ");
        int numTestcases = in.nextInt();
        while (numTestcases-- > 0)
        {
            Q7.efficient();
        }
    }
}
