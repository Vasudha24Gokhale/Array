public class Last_occurence {
    public static void main(String args[]){
        int lo=0;
        int x=1;
        int arr[]={7,1,2,1,4,1,1,2,1};
        for(int i=0;i<arr.length;i++){
            if (arr[i]>x){
                lo++;
            }
        }
        System.out.print(lo);

    }

}
