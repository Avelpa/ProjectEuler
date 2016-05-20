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
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 1; i <= arr.length; i ++)
        {
            for (int j = i-1; j < arr.length; j ++)
            {
                if (arr[j] == i && !bringToIndex(i-1, j, arr))
                {
                    System.out.println("NO");
                    printArray(arr);
                    return;
                }
                if (arr[j] == 1)
                    printArray(arr);
            }
        }
        System.out.println("YES");
//        System.out.println(bringToIndex(0, 2, arr));
        printArray(arr);
    }
    
    private static boolean bringToIndex(int targetIndex, int curIndex, int[] arr)
    {
        int rotIndex = 0;
        int prevRotIndex = rotIndex;
        int loopCount = 0;
        while (curIndex > targetIndex && loopCount < 3)
        {
            if (curIndex >= arr.length-3)
            {
                rotIndex = arr.length-3;
            } else if (curIndex <= targetIndex+3)
            {
                rotIndex = targetIndex+1;
            }
            
            if (rotIndex == prevRotIndex)
                loopCount ++;
            else
                loopCount = 0;
            
            rotateArray(arr, rotIndex);
            curIndex --;
            
            prevRotIndex = rotIndex;
        }
        
        if (loopCount == 3)
            return false;
        return true;
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
