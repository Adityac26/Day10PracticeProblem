package D10Problem;

public class SmallestNumber {
    public static void main(String[] args) {

        int [] arr = {13,44,56,11,26,34};

        int smallest = arr[0];

        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]<smallest)
                smallest= arr[i];
        }
        System.out.println(smallest);
    }
}
