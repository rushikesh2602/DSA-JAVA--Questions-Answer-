import java.util.Scanner;

public class printall_prime_no {

    public static boolean optimise_isprime(int n) {
        if (n==2) {
            return true;
        }

        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
     }

    public static void primeinRange(int n) {


        for (int i=2; i<=n; i++){
            if (optimise_isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int n = 10;
        System.out.println("Enter number n you want to find prime no from 0-n:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeinRange(n);
        
    }
}
