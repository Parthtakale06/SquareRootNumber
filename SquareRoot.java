import java.util.*;
import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the ele of which you need to find the square root");
        int num = sc.nextInt();

        int arr[] = new int[num];
        // to create an array of the size of the no entered
        // we need to enter the value of the elements in the array equal to that of the
        // index

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        
        // now we need to find the mid
        int low = 0;
        int high = arr.length ;
       
        while (low < high) {
            int mid = (low + high) / 2;
            int temp = mid * mid;

            if (num == temp) {
                System.out.println("given sqrt of the no is\t" + arr[mid]);
            }

            if (num < temp) {

                high = mid;
                mid = (low + high) / 2;

            }

            else {
                low = mid + 1;
                mid = (low + high) / 2;

            }
        }
    }
}
