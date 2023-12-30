package quick;

public class quic {
    static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quicksort(arr, low, pidx-1);
            quicksort(arr, pidx+1, high);
            
        }
    }

     static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot)j--;
            if(i<j){
                swap(arr,i,j);
            }
            
        }
        swap(arr,j,low);
            return j;
    }

    static void swap(int arr[],int low,int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    public static void main(String[] args) {
        int []arr={2,1,2,4,6,10};
        int n=arr.length-1;
        quicksort(arr,0,n);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
