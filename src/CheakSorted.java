class CheckSorted {

    public static void main(String args[]){
        boolean cheaked=true;
        int arr[]={2,4,5,6,8};
        int n = arr.length;
        for(int i=0;i< n - 1;i++){
            if(arr[i]>arr[i+1]){
//                int c=0;
//                c=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=c;
                cheaked=false;
            }
        }
        System.out.println(cheaked);
        System.out.println("Sorted array:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
