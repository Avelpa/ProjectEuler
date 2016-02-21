/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerearth.februaryclash16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class LightItUp {

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
        int numBuildings = in.nextInt();
        
//        Building[] buildings = new Building[numBuildings];
        HashMap<Integer, Wall> walls = new HashMap();
        
        Wall lWall = null;
        Wall rWall = null;
        
        int Li = 0, Ri = 0, H = 0;
        
        for (int i = 0; i < numBuildings; i++)
        {
            Li = in.nextInt();
            Ri = in.nextInt();
            H = in.nextInt();
            
            lWall = new Wall(Li, H);
            rWall = new Wall(Ri, H);
            
            walls.put(i, lWall);
            walls.put(i+1, rWall);
        }
        
        for (int i = 1; i < walls.size(); i+= 2)
        {
            walls.get(i).walls.add(i);
            for (int j = i+1; j <= walls.size(); j+= 2)
            {
                if (isValidPathRight(i, j, walls))
                    walls.get(i).walls.add(j);
                else
                    break;
            }
        }
        for (int i = walls.size()-2; i >= 0; i-= 2)
        {
            walls.get(i).walls.add(i);
            for (int j = i-1; j >= 0; j-= 2)
            {
                if (isValidPathLeft(i, j, walls))
                    walls.get(i).walls.add(j);
                else
                    break;
            }
        }
        
        HashSet<Integer> lightSources = new HashSet();
    }
    
    private static boolean isValidPathRight(double startingWall, double endingWall, HashMap<Integer, Wall> walls)
    {
        double slope = -startingWall/(endingWall-startingWall);
        for (double i = endingWall-1; i > startingWall; i-= 2)
        {
            double height = (i-endingWall)*slope;
            if (height < walls.get(i).y)
                return false;
        }
        return true;
    }
    private static boolean isValidPathLeft(double startingWall, double endingWall, HashMap<Integer, Wall> walls)
    {
        double slope = startingWall/(endingWall-startingWall);
        for (double i = endingWall+1; i < startingWall; i+= 2)
        {
            double height = (i-endingWall)*slope;
            if (height < walls.get(i).y)
                return false;
        }
        return true;
    }
    
    static class Building{
        
        Wall l, r;
        
        public Building(Wall l, Wall r)
        {
            this.l = l;
            this.r = r;
        }
    }
    
    static class Wall{
        
        int x, y;
        HashSet<Integer> walls = new HashSet();
        
        public Wall(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
}
