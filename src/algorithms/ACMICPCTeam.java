/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithms;

import java.util.BitSet;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class ACMICPCTeam {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int numPeople = in.nextInt();
        int numTopics = in.nextInt();
        in.nextLine();
        
        char[][] people = new char[numPeople][numTopics];
        for (int i = 0; i < numPeople; i++)
        {
            people[i] = in.nextLine().toCharArray();
        }
        
        int maxTalents = 0;
        int numGroups = 0;
        
        for (int i = 0; i < people.length-1; i ++)
        {
            for (int j = i; j < people.length; j ++)
            {
                int combo = getCombo(people[i], people[j]);
                if (combo > maxTalents)
                {
                    maxTalents = combo;
                    numGroups = 1;
                }
                else if (combo == maxTalents)
                    numGroups ++;
            }
        }
        System.out.println(maxTalents);
        System.out.println(numGroups);
    }
    
    private static int getCombo(char[] p1, char[] p2)
    {
        int numTalents = 0;
        for (int i = 0; i < p1.length; i ++)
        {
            if (p1[i] == '1' || p2[i] == '1')
            {
                numTalents ++;
            }
        }
        return numTalents;
    }
    
}
