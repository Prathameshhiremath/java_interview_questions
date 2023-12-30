package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Iprogram2 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack <Integer>s=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int val=3;
        while(q.size()>=val){
            s.add(q.remove());
        }
        System.out.println(s);
        while(s.size()!=0){
            q.add(s.pop());
        }
        System.out.println(q);
        // q.remove();
        // q.remove();
        // q.add(4);
        // q.add(5);
        for(int i=0;i<=1;i++){
            // int a=q.remove();
            // q.add(a);
            q.add(q.remove());
        }
        System.out.println(q);

    }
}
