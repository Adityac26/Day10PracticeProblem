package D10Problem;

public class DuplicateNumber {
    public static void main(String[] args) {

        int [] arr = {11,33,33,5,46,7,89,4,11,5,7,4};

        for (int i = 0; i< arr.length; i++)
        {

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] == arr[i])

                {
                    System.out.print(arr[j]+ " ");
                }
            }
        }
    }
}
