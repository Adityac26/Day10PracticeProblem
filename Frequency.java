package D10Problem;

public class Frequency {
    public static void main(String[] args) {

        int [] a= { 1,2,3,4,5,1,1,3,2,7,8};

        for (int i = 0; i< a.length;i++){
            int x = a[i];
            int count =0;
            if (x == -1)continue;

            for (int j = 0; j< a.length; j++){
                if (a[j]==x){
                    count++;
                    a[j]= -1;
                }

            }
            System.out.println("Frequency of "+x+ " is "+ count);


        }


    }
}
