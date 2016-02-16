package projecteuler;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class snakesandladders {
    
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int tests = in.nextInt();
        while(tests-- > 0)
        {
            
            GridPoint[] board = new GridPoint[100];
            for (int i = 0; i < board.length; i ++)
            {
                board[i] = new GridPoint();
                board[i].vertex = i;
            }
            
            //ladders
            int numLadders = in.nextInt();
            while (numLadders-- > 0)
            {
                board[in.nextInt()-1].vertex = in.nextInt()-1;
            }
            // snakes
            int numSnks = in.nextInt();
            while (numSnks-- > 0)
            {
                board[in.nextInt()-1].vertex = in.nextInt()-1;
            }
            System.out.println(minMoves(board));
            
        }
    }
    
    private static int minMoves(GridPoint[] board)
    {
        Queue<GridPoint> queue = new LinkedList();
        
        GridPoint s = new GridPoint();
        s.vertex = 0;
        s.distance = 0;
        s.visit();
        
        queue.add(s);
        
        GridPoint qe = new GridPoint();
        GridPoint cell = null;
        
        boolean good = false;
        while (!queue.isEmpty())
        {
            qe = queue.remove();
            
            if (qe.vertex == board.length-1)
            {
                good = true;
                break;
            }
            
            for (int i = qe.vertex+1; i < board.length && i <= (qe.vertex+6); i ++)
            {
                if (!board[i].isVisited())
                {
                    board[i].visit();
                    
                    cell = board[i];
                    cell.distance = qe.distance+1;
                    
                    queue.add(cell);
                }
            }
        }
        if (good)
        {
            return qe.distance;
        }
        return -1;
    }
    
    static class GridPoint
    {
        int vertex;
        int distance;
        boolean visited = false;
        
        boolean isVisited()
        {
            return visited;
        }
        void visit()
        {
            visited = true;
        }
    }
}
