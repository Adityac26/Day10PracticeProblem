package D10Problem;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {

        int[] arr = {3,5,7,1,2,4,9,8};

        Arrays.sort(arr);

        for (int element : arr)
        {
            System.out.println(element);
        }
    }
}
