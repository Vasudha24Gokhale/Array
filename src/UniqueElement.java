import java.util.*;
public class UniqueElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v=0;
        int[] arr={1,2,3,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=0;
                    arr[j]=0;

                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[i+1]){
                   System.out.println(arr[i+1]);
                   return;


            }
        }

    }
}
