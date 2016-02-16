/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codechef.feb16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Dmitry
 */
public class ChefDetective {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        solve();
    }
    
    private static void solve()
    {
        int numCriminals = in.nextInt();
        in.nextInt();
        
        Criminal[] criminals = new Criminal[numCriminals];
        criminals[0] = new Criminal(1);
        for (int i = 1; i < numCriminals; i ++)
        {
            criminals[i] = new Criminal(i+1);
            criminals[in.nextInt()-1].subordinates.add(criminals[i]);
        }
        
        Stack<Criminal> stack = new Stack();
        
        Criminal r = criminals[0];
        stack.push(r);
        
        Criminal cur = null;
        
        ArrayList<Integer> answer = new ArrayList();
        while (!stack.isEmpty())
        {
            cur = stack.peek();
            cur.visited = true;
            if (cur.subordinates.isEmpty())
            {
                answer.add(cur.id);
                stack.pop();
            }
            else
            {
                boolean allDone = true;
                for (Criminal c: cur.subordinates)
                {
                    if (!c.visited)
                    {
                        allDone = false;
                        stack.push(c);
                    }
                }
                if (allDone)
                {
                    stack.pop();
                }
            }
        }
        
        Collections.sort(answer);
        for (int i = 0; i < answer.size()-1; i ++)
        {
            System.out.print(answer.get(i) + " ");
        }
        System.out.print(answer.get(answer.size()-1));
    }
    
    static class Criminal{
        final int id;
        ArrayList<Criminal> subordinates;
        boolean visited;
        public Criminal(int id)
        {
            this.id = id;
            subordinates = new ArrayList();
            visited = false;
        }
    }
}
