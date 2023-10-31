public class rotation {
    public static int rotate(int[] arr,int n){
        boolean notok=false;
        int flag=-1;
        int target = 0;
        for (int i = 0; i < (arr.length-1); i++) {
            if(arr[i]<arr[i+1]){
                notok=false;

            }
            else {
                notok=true;
                target=arr[i+1];
                flag=i+1;
                break;
            }
        }
        if(notok && target==n){
            return flag;
        }
        else {
            return -1;
        }
    }

}
