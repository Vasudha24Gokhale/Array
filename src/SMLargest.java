import java.util.*;
public class SMLargest {
    static void lar(){
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        Arrays.sort(arr);
        int arr1[]=new int[2];
        for(int i=0;i<1;i++){
            arr1[i]=arr[0];
            arr1[i+1]=arr[arr.length-1];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");


        }
    }
    public static void main(String args[]){
    lar();

    }
}
