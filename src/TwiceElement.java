public class TwiceElement {
    public static boolean printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }

            }

            if (counter >= 2) {
                return true;
            }
        }
        return false;

    }
    
}
