import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements to be entered");
        int n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array");


        for(int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        System.out.println("Enter the target value");
        int target = s.nextInt();


        rotation S1 = new rotation();

        System.out.println(S1.rotate(arr,target));

    }
}