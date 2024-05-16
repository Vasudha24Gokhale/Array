public class TargetSum {
    public static void main(String args[]){
        int arr[] = {1, 4, 5, 6, 3};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int r = j + 1; r < arr.length; r++){
                    if (arr[i] + arr[j] + arr[r] == 12){
                        System.out.print(i + " " + j + " " + r);
                        System.out.println();

                       return;
                    }
                }
            }
        }
    }
}
