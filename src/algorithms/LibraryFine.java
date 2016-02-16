/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class LibraryFine {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int[] actual = {in.nextInt(), in.nextInt(), in.nextInt()};
        int[] due = {in.nextInt(), in.nextInt(), in.nextInt()};
        
        if (due[2] > actual[2])
        {
            System.out.println(0);
        }
        else if (due[2] < actual[2])
        {
            System.out.println(10000);
        }
        else if (due[1] > actual[1])
        {
            System.out.println(0);
        }
        else if (due[1] < actual[1])
        {
            System.out.println((actual[1]-due[1])*500);
        }
        else if (due[0] < actual[0])
        {
            System.out.println((actual[0]-due[0])*15);
        }
        else
        {
            System.out.println(0);
        }
    }
}
