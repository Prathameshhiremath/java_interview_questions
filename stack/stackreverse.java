package stack;
import java.util.*;
public class stackreverse {
    public static void bottom(Stack<Integer>s,int x){
        if(s.size()==0){
            s.push(x);
            return;
        }
        int top=s.pop();
        bottom(s, x);
        s.push(top);
    }

public static void rev(Stack<Integer>s){
    if(s.size()==0){
        return;
    }
    int top=s.pop();
    System.out.print(top);
    rev(s);
    bottom(s,top);
    

}

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //int b=s.remove(1);//remove element bases of index
        //int c=s.search(1);//element searches
        //int a=s.elementAt(0);//element searches bas of index
        //System.out.println(a); //last element will comsider as 1st elemet
        
       rev(s);

    }
         
         

 }

