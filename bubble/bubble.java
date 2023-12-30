package bubble;
class bubble {
   
    public static void main(String[] args) {
        int [] arr={5,8,2,1,1,3,10};
        //time complexity=O(n^2)
        for (int i=0;i<arr.length-1;i++){  //it will go to n-1
            for(int j=0;j<arr.length-i-1;j++){  //last element is alreday last so it dont do agin loop till there
                if(arr[j]> arr[j+1]){   //sorts in asc  if < then sorts in desc  ex 8>3
                    int temp=arr[j]; //temp=8;  (arr[j] is empty)
                    arr[j]=arr[j+1];// arr[j]=arr[j+1] (3) is transfer to arr[j]
                    arr[j+1]=temp;//arr[j+1] =8; 8 go to arr[j+1]

                }
            }
        }
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }

    }
}
