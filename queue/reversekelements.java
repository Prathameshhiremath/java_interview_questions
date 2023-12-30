package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reversekelements {
    public static void main(String[] args) {
         Queue<Integer>s=new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        int k=3;
        Stack<Integer>s1=new Stack<>();
        while(s.size()>=k){
            s1.push(s.remove());
        }
        System.out.println(s);
        while(s1.size()>0){
            s.add(s1.pop());
        }
        int a=s.size();
        int r=a-k;
        for(int i=0;i<=r;i++){
            s.add(s.remove());
        }
        System.out.println(s);



    }
}
