/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms.implementation;

import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class LarrysArray {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int numTests = in.nextInt();
        while(numTests-- > 0){
            solve();
        }
    }
    
    private static void solve()
    {
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i ++)
        {
            arr[i] = in.nextInt();
        }
        
        int max = 0;
        for (int i = 0; i < arr.length; i ++)
        {
            if (!bringToIndex(arr[i]-1, i))
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
    private static boolean bringToIndex(int targetIndex, int curIndex)
    {
    }
    
    private static  void printArray(int[] arr)
    {
        for (Integer i: arr)
        {
            System.out.print(i + ",");
        }
        System.out.println();
    }
    
    private static void rotateArray(int[] arr, int startIndex)
    {
        int first = arr[startIndex];
        arr[startIndex] = arr[startIndex+1];
        arr[startIndex+1] = arr[startIndex+2];
        arr[startIndex+2] = first;
    }
    
}
