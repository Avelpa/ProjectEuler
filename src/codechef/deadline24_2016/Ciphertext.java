/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef.deadline24_2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class Ciphertext {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int C = in.nextInt();
        int M = in.nextInt();
        int T = in.nextInt();
        
        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> s = new ArrayList();
        
        a.add(1);
        a.add(1);
        s.add(1);
        s.add(2);
        
        int tempN = 0;
        while (T-- > 0)
        {
            int n = in.nextInt();
            
            while (s.size() < n)
            {
                tempN = a.size()-2;
                a.add(a.get(tempN+1)*C+a.get(tempN));
                
                s.add(s.get(s.size()-1)+a.get(a.size()-1));
            }
            
            System.out.println(s.get(n-1)%M);
        }
    }
}
