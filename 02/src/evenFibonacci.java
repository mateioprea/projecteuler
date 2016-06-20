/**
 * Created by matei on 20/06/16.
 */
public class evenFibonacci {

    public static void main (String [] args) {
        Integer i = 0, sum = 0;
        Integer maxLimit = 4000000;
        Integer fiboNumber;
        while((fiboNumber = getNthFibonacci(i)) < maxLimit) {
            if (fiboNumber % 2 == 0) {
                sum += fiboNumber;
            }
            i++;
        }

        System.out.println(sum);
    }

    private static int getNthFibonacci(int position) {

        if (position == 0) return 0;
        if (position == 1) return 1;


        return getNthFibonacci(position - 2) + getNthFibonacci(position - 1);
    }
}
