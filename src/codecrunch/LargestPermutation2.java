/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codecrunch;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class LargestPermutation2 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int size = in.nextInt();
        int k = in.nextInt();
        
        int largest = size;
        int nextIndex = 0;
        
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < size; i ++)
        {
            arr.add(in.nextInt());
        }
        
        while (k-- > 0)
        {
            while (arr.indexOf(largest) <= nextIndex && nextIndex < arr.size()){
                nextIndex ++;
                largest --;
            }
            if (nextIndex >= arr.size())
                break;
            int indexOfLargest = arr.indexOf(largest);
            arr.remove(indexOfLargest);
            
            arr.add(indexOfLargest, arr.get(nextIndex));
            arr.remove(nextIndex);
            arr.add(nextIndex, largest);
        }
        
        for (Integer i: arr)
            System.out.print(i + " ");
    }
    
}
