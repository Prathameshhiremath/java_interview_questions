import java.util.*;

public class insertpos {

    public static class Node{
        int data;
        Node next;
        Node head;

    }
    public static int pos(Node head,int pos,int n){
        if(pos==1){
            n.next=head;
            n=head;
            
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> n=new LinkedList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        System.out.println(n); 
        
    }
}
