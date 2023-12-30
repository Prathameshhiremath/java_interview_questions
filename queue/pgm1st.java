package queue;

import java.util.LinkedList;
import java.util.Queue;

public class pgm1st {
    public static void main(String[] args) {
        Queue <Integer> q= new  LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        Queue <Integer> q1=new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            q1.add(q.poll());
            
            
        }
        // System.out.println(q1);
        while(q1.size()>0){
            q.add(q1.poll());
        }
        System.out.println(q);


    }
}
