package D10Problem;

public class SecondLargestNum {
    public static void main(String[] args) {

        int temp,size;

        int [] arr = { 4,7,1,5,9,6,2,3,8};

        size = arr.length;

        for (int i = 0; i<size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println(arr[size-2]);
        }
    }

