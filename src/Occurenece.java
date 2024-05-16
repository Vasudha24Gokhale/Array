public class Occurenece {
    public static int deep(int[] arr,int x){

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }

        }
       return count;
    }

    public static void main (String args[]){
        int[] arr={4 ,5,6,8,2,5,4,3,5,6,8,3,2,2,2,6,3,2};
        int x=2;
        System.out.print(deep(arr,x));
    }
}
