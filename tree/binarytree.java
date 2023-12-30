package tree;
import java.util.*;

import queue.reversekelements;
import stack.stack1_Inserting1;

public class binarytree{
    public static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
       


    }
    static class binaryT{
        static int idx=-1;
        public static Node buildT(int nodes[]){
            idx++;  //firstly from -1 it will be 0
            if(nodes[idx]==-1){ //if root node is -1 then return as null
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildT(nodes); //create first left nodes
            newnode.right=buildT(nodes);//create right nodes
            return newnode;
        }
    }
    public static void preorder(Node root){
        if(root == null){//base case
            return ;
        }
        System.out.print(root.data+" "); //print the root of data
        preorder(root.left);//recursively of left 
        preorder(root.right);//recursively of right
        
    }
    public static  void inorder(Node root){
        if(root==null){//base case
            return ;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }


    public static void levelorder(Node root){//O(n)
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);//firstly root will be out
        q.add(null);//store null becz for go to next line
        while(!q.isEmpty()){//travel to q becomes empty
            Node c=q.remove();//remove an elemnt untill it become null
            if(c==null){ //if next is null then go to next line
                System.out.println();//here it will print
                if(q.isEmpty()){ //if que become emty then beak
                    break;
                }
                else{ //otherwqise add null
                    q.add(null);
                }
            }else{//if c is  not null then add data of left and right
                System.out.print(c.data+" ");
                if(c.left!=null){//untill left become empty 
                    q.add(c.left);
                }
                if(c.right!=null){ //untill right become empty
                    q.add(c.right);
                }
            }

        }

    }
    public static int countofnode(Node root){//O(n)
        if(root==null){
            return 0;
        }
        int x=countofnode(root.left);
        int y=countofnode(root.right);
        return x+y+1;//for root count +1
        
    }
    public static int sumofnode(Node root){
        if(root==null){
            return 0;
        }
        int x=sumofnode(root.left);
        int y=sumofnode(root.right);
        return x+y+root.data; 
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int x=height(root.left);
        int y=height(root.right);
        int maxi=Math.max(x,y)+1;
        return maxi;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryT tree=new binaryT();
        Node root=tree.buildT(nodes);
        
        // preorder("preorder"+root); //O(n)
         //inorder("inorder"+root);//O(n)
        // postorder(root);O(n)
        levelorder(root);
        System.out.println("Count"+countofnode(root));
        System.out.println("sum"+sumofnode(root));
        System.out.println("height"+height(root));
       
    }
    
    
}
