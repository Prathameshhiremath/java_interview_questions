public class insertion {
    public static void main(String[] args) {
        int arr[]={1,2,1,4,2,6};
        for(int i=1;i<arr.length;i++){
            int c=arr[i];
            int j=i-1;
            while(j>=0 && c<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
            }
            arr[j+1]=c;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
