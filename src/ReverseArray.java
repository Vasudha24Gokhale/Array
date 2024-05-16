import java.util.*;
public class ReverseArray {
    static void rav(int[] arr){
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        rav(arr);

    }
}
