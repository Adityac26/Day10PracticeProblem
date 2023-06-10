package D10Problem;

public class LargestNumber {
    public static void main(String[] args) {

        int [] array = { 22,44,99,65,87,11,23,98};

        int largest = array[0];

        for (int i=0;i<array.length;i++)
        {
            if (array[i]> largest)
                largest=array[i];
        }

        System.out.println("largest element of array is : "+largest);
    }
}
