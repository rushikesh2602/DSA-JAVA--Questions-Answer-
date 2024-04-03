import java.util.Scanner;

public class inverted_half_pyramid {

    public static void pattern(int n) {
        
        //outer loop
       for (int i= 1; i<=n; i++) {
            
        //spaces
        for (int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
       }
    }
    
    public static void main(String[] args) {
         System.out.print("Enter any number:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pattern(a);

    }
}
