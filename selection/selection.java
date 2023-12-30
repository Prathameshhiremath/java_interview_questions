public class selection {


    public static void main(String[] args) {
        //time complexity O(n^2)
        int arr[]={2,4,5,1,1,8,2};
        for(int i=0;i<arr.length-1;i++){   //goes to n-1
            int small=i;// 1st index will be 0th
            for(int j=i+1;j<arr.length;j++){ // from i to last  it check
                if(arr[small]>arr[j]){  //smallest(0th)>jth element  2>1
                    small=j;  // then samlewst will be j  1 will be the smallest
                }
            }
            ///swap of i to j
            int temp=arr[small];    //temp=small[j] i.e 1
            arr[small]=arr[i];     //arr[small]=2
            arr[i]=temp;           // arr[i]=temp(1)

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
