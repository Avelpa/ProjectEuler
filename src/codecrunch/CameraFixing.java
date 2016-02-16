/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codecrunch;

import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class CameraFixing {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        double d = in.nextDouble()*2;
        double answer = Math.sqrt(d*d/(1-Math.cos(Math.toRadians(45)))/2);
        System.out.printf("%.2f", answer);
    }
    
}
