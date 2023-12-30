package stack;
import java.util.*;
//https://www.youtube.com/watch?v=1byexQBGhas  for this video amazing 
//https://www.youtube.com/watch?v=7m1DMYAbdiY&t=1860s  for apna clg video
public class stack1_Inserting1 {
    //using recursive of bottom inserting
    public static void bottom(int data,Stack<Integer> s){
        int i=0;  // for bottom 0 if any index u want then put any index value
        if(s.size()==i){                     // important it is applicable for if they ask to insert a value in middle
            s.push(data);
            return;
        }
        int top=s.pop();
        System.out.println("Before "+top);
        bottom(data, s);
        System.out.println("After "+top);
        s.push(top);        //this is used for add that value which is outside that

    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        bottom(10,s);
        System.out.println(s);
        // System.out.println(s.size());
        // System.out.println(s);                  //all data is in s now
        // Stack <Integer> temp=new Stack<>();     //created temp stack for inserting values
    //     int idx=0;
    //     int data=3;
    //     while(s.size()>idx){                    //till s of size will become > idx means condition will run till index will become false
    //         temp.push(s.pop());                // so push that values from s to temp stack 
    //     }
    //     s.push(data);                      // and add new value to s 
    //     while(temp.size()>0){               // and 
    //         s.push(temp.pop());
             

    //     }
    //    System.out.println(s);

    //Reverse using iterative
    // while(s.size()>0){
    //     temp.push(s.pop());
    // }
    // System.out.println(temp);



    

    }
}
