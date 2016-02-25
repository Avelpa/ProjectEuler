/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author kobed6328
 */
public class SwapNodes {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        solve();
    }
    
    private static void solve()
    {
        int numNodes = in.nextInt();
        
        // Start the head node with a value of 1
        Node head = new Node(1);
        
        // Perform BFS to populate the tree
            // for every node (left to right), create its children as specified by the input
        Queue<Node> queue = new LinkedList();
        
        Node cur = null;
        
        queue.add(head);
        while (!queue.isEmpty())
        {
            cur = queue.remove();
            
            cur.left = createNode(in.nextInt());
            cur.right = createNode(in.nextInt());
            
            if (cur.left != null)
                queue.add(cur.left);
            if (cur.right != null)
                queue.add(cur.right);
        }
        
        
        // Swapping
        
        int T = in.nextInt();
        
        while (T-- > 0)
        {
            int k = in.nextInt();
            // flip the entire tree based on the head (starting depth is 1)
            flipTree(head, 1, k);
            
            printInorder(head);
            // add a newline for formatting
            System.out.println();
        }
        
    }
    
    // The order of nodes being flipped doesn't matter, so this is one possible solution
    private static void flipTree(Node head, int depth, int k)
    {
        if (head == null)
            return;
        
        // Swap left with right if the depth is a multiple of the k value
        if (depth % k == 0)
        {
            Node temp = head.right;
            head.right = head.left;
            head.left = temp;
        }
        // flip the left branch
        // flip the right branch
        flipTree(head.left, depth+1, k);
        flipTree(head.right, depth+1, k);
    }
    
    private static Node createNode(int value)
    {
        if (value == -1)
            return null;
        return new Node(value);
    }
    
    private static void printInorder(Node head)
    {
        if (head == null)
            return;
        
        printInorder(head.left);
        
        System.out.print(head.data + " ");
        
        printInorder(head.right);
    }
    
    static class Node{
        
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
        }
    }
}
