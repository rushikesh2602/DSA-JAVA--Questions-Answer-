// - infinity => Integer.Min_value
// + infinity => Integer.Max_value

// Time-Complexity => O(N)

import java.util.Scanner;

public class Largest_number {

    public static int max_number(int number[]) {
        int Largest = Integer.MIN_VALUE;

        for (int i = 0; i<number.length; i++) {
            if (number[i] > Largest) {
                Largest = number[i];
                
            }
            
        }
       return Largest;
    }
    
    public static void main(String[] args) {
        int numbers[] = {22,33,42,45,52,98,2,90};
       System.out.print("Largest value in array is:"+  max_number(numbers));
    }
}
