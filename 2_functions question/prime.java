import java.util.Scanner;

public class prime {

    public static boolean isprime(int n) {
            
            if (n==2) {
                return true;
            }
            for(int i=2; i<=n-1; i++) {
                if (n%i==0){
                    return false;
                }
            }
            return true;  
    }

// these is the optimise way to find the prime number 
//above methos we can use but these is the best way
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
    public static void main (String[] args) {
        System.out.println("Enter number:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        // System.out.println(isprime(a));
        System.out.println(optimise_isprime(a));


    }
    
}
