package stack;
import java.util.*;
//https://www.youtube.com/watch?v=1byexQBGhas
public class stack2revrecursion {
    public static void rev(Stack<Integer> s,int data,int pos){
      
      if(s.size()<pos){
         s.push(data);
         return;
      }
      int top=s.pop();
      System.out.print(top+" ");
      rev(s,data,pos);
      s.push(top);
    }
    //  public static void rev1(Stack<Integer> s){
    //     if(s.size()==0)return;
    //     int top=s.pop();
        
    //     rev1(s);
    //     System.out.println(top);
    //     // s.push(top);
    //     // System.out.println(s);
    //  }
    

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        rev(s,13,1);
        System.out.println(s);
        //System.out.println(s);
       // rev1(s);

    }
}
