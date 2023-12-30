package queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackusingqueue {

    public int peek1(Queue<Integer>s){
        for(int i=0;i<s.size()-1;i++){
            s.add(s.remove());


        }
        int x=s.peek();
        s.add(s.remove());
        return x;
    }

    public static void main(String[] args) {
                Queue<Integer>s=new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        peek1(s)
        

    }
}
