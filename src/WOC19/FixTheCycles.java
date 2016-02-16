/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WOC19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class FixTheCycles {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        
        int s1 = a+b+f;
        int s2 = a+e+d;
        int s3 = a+b+c+d;
        
        int p = Math.min(s1, s2);
        p = Math.min(p, s3);
        
        if (p < 0)
            System.out.println(-p);
        else
            System.out.println(-1);
        
    }
    
//    private static void solve()
//    {
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int d = in.nextInt();
//        int e = in.nextInt();
//        int f = in.nextInt();
//        
//        int s1 = a+b+f;
//        int s2 = a+e+d;
//        int s3 = a+b+c+d;
//        
//        int increment = 1;
//        
//        int cycle = 0;
//        
//        boolean solved = false;
//        
//        while ((s1 < 0 || s2 < 0 || s3 < 0) && a <= 20 && b <= 20 && c <= 20 && d <= 20 && e <= 20 && f <= 20)
//        {
//            cycle ++;
//            if (cycle > 6){
//                cycle = 1;
//                increment ++;
//            }
//            switch (cycle)
//            {
//                case 1:
//                    a += increment;
//                    break;
//                case 2:
//                    b += increment;
//                    break;
//                case 3:
//                    c += increment;
//                    break;
//                case 4:
//                    d += increment;
//                    break;
//                case 5:
//                    e += increment;
//                    break;
//                case 6:
//                    f += increment;
//                    break;
//            }
//            
//            s1 = a+b+f;
//            s2 = a+e+d;
//            s3 = a+b+c+d;
//            
//            if (!(s1 < 0 || s2 < 0 || s3 < 0) && a <= 20 && b <= 20 && c <= 20 && d <= 20 && e <= 20 && f <= 20){
//                System.out.println(increment);
//                solved = true;
//                break;
//            }
//                
//            
//            switch (cycle)
//            {
//                case 1:
//                    a -= increment;
//                    break;
//                case 2:
//                    b -= increment;
//                    break;
//                case 3:
//                    c -= increment;
//                    break;
//                case 4:
//                    d -= increment;
//                    break;
//                case 5:
//                    e -= increment;
//                    break;
//                case 6:
//                    f -= increment;
//                    break;
//            }
//        }
//        if (!solved)
//            System.out.println(-1);
//    }
}
