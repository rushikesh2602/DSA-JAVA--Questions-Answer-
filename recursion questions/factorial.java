import java.util.Scanner;

public class factorial {


    public static int fact(int n) {
        if (n==0) {
            return 1;
        }
        int factorials = fact(n-1);
        int fact1 = n * (n-1);

         return fact1;
        

    }
    public static void main(String[] args) {
        System.out.print("Enter a number you want to find a binomial:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));

        
    }
}
