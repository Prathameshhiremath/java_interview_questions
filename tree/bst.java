public class bst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
        }

    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);

    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        else if(root.data>key){//if root is greter then key
            return search(root.left, key);
        }
        else if(root.data==key){//if root is lesser then key
            return true;
        }
        else {
            return search(root.right,key);
        }

    }

    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{//root.data==val
            //case1 --if root has no child
            if(root.left==null &&root.right==null){
                return null;
            }
            //case2 if root has only one child in right or left!!
            else if(root.left==null){  //if root of left has null then return root of right
                return root.right;
            }
            else if(root.right==null){ //if root of right has null then returrn root of left
                return root.left;
            }
            //case3 if root has 2 child  
            Node is=inordersuccesor(root.right);  //get the inorder suucessor of right 
            root.data=is.data; //replace with the main root of is.data
            root.right=delete(root.right,val);//then delete the that root which we replace of right (original root)

        }
        return root;
    }
    public static Node inordersuccesor(Node root){ //inordersuccesor means we have to travel untilll root of left become empty ,right is ok but not left that is successor
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void printinrange(Node root ,int X,int Y){
        if(root==null){
           
            return;
        }
        if(root.data>=X && root.data<=Y){
            printinrange(root.left, X, Y);
            System.out.print(root.data+" ");
            printinrange(root.right, X, Y);
           

        }
        else if(root.data>=Y){
            printinrange(root.right, X, Y);
        }
        else{
            printinrange(root.left, X, Y);
        }

    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        // if(search(root, 8)){
        //     System.out.println("founded");
        // }
        // else{
        //     System.out.println("not founded");
        // }

        // delete(root,2);
        // inorder(root);
          
        printinrange(root, 2, 9);

    }
}
