import java.util.Scanner;

public class inverted_half_pyramid2 {

    public static void pattern(int n) {
         
        for (int i = 1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter any number :-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pattern(a);
    }
    
}
