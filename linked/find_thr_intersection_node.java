import java.util.*;


public class find_thr_intersection_node {
       /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size=0;
        int size1=0;
        ListNode temp=headA;
        ListNode temp1=headB;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        while(temp1!=null){
            temp1=temp1.next;
            size1++;
        }
        temp=headA;
        temp1=headB;
        if(size>size1){
            int s=size-size1;
            for(int i=1;i<=s;i++){
                temp=temp.next;
            }
        }else{
            int s=size1-size;
            for(int i=1;i<=s;i++){
                temp1=temp1.next;
            }
        }
        while(temp!=temp1){
            temp=temp.next;
            temp1=temp1.next;
        }
        return temp;
        

    }
}




    public static void main(String[] args) {
        
    }
}
 