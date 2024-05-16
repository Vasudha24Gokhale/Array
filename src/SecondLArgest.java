import java.util.*;
public class SecondLArgest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        System.out.println("enter 3 element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Stop");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.print(arr[1]);

    }
}
