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
public class TheTimeInWords {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.print(solve());
    }
    
    
    private static final String[] lowNames = {
   "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
   "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    private static final String[] tensNames = {
   "twenty", "thirty", "forty", "fifty", "sixty"};
    
    private static String solve()
    {
        int hrs = in.nextInt();
        int mins = in.nextInt();
        
        String hours = numToWord(hrs);
        if (mins == 0)
            return hours + " o' clock";
        if (mins == 1)
            return numToWord(mins) + " minute past " + hours;
        if (mins == 15)
            return "quarter past " + hours;
        if (mins < 30)
            return numToWord(mins) + " minutes past " + hours;
        if (mins == 30)
            return "half past " + hours;
        if (mins == 45)
            return "quarter to " + numToWord(hrs+1);
        if (mins < 59)
            return numToWord(60-mins) + " minutes to " + numToWord(hrs+1);
        return numToWord(60-mins) + " minute to " + numToWord(hrs+1);
    }
    
    private static String numToWord(int n)
    {
        if (n < 20)
            return lowNames[n];
        
        String word = "";
        word += tensNames[n/10-2];
        word += " ";
        word += lowNames[n%10];
        return word;
    }
}
