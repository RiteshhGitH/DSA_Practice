public class SubArray {


    public static void print_SubArray(int [] arr, int n ){
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();

            }
        }
    }

}