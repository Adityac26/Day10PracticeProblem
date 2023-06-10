package D10Problem;

public class OddPosition {
    public static void main(String[] args) {

        int [] array = {11,13,15,14,32,41,26};

        for (int i = 0; i< array.length;i+=2)
        {
            System.out.println(array[i]);
        }
    }
}
