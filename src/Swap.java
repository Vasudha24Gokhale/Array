import java.util.*;
public class Swap {
    static int number(int a,int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        return a ;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=8;
        int b=99;
        int c=number(a,b);
        System.out.println(c);

    }

}
