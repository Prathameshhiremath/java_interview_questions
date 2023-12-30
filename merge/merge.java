package merge;

public class merge {

    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void conquerer(int arr[],int l,int mid,int r){
        int n1=mid-l+1; //size of left
        int n2=r-mid; //size of right
        int []left=new int [n1];
        int []right =new int[n2];
        int i,j,k;
        for( i=0;i<n1;i++){ //fill the charcters
            left[i]=arr[l+i];

        }
        for(j=0;j<n2;j++){ //same for right
            right[j]=arr[mid+1+j];
        }
        i=0;j=0;k=l;
        while(i<n1&&j<n2){  //here check of untill n1 and n2 become smallewr
            if(left[i]<right[j]){  //if left of element is less then right
                arr[k++]=left[i++];  //then add and override element of left into arr[k]
                
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){   //if element of arr of left is remains then fill allin arr
            arr[k++]=left[i++];
        }
        while(j<n2){   //if eleemnr of right remail=ns then fill arr
            arr[k++]=right[j++];
        }
    }
    static void mergesort(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
        conquerer( arr,l,mid,r);
    }
    public static void main(String[] args) {
        int [] arr={9,6,2,3,5,4};
        int n=arr.length-1;
        
        System.out.println("before");
        display(arr);
        mergesort(arr, 0, n);
        System.out.println("after");
        display(arr);


    }
}
