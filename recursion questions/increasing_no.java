import java.util.Scanner;

public class increasing_no {

    public static void increasingorder(int n) {
        if (n==1) {
            System.out.print("1" + " ");
            return;
        }
        increasingorder(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        System.out.print("enter number you want to print:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        increasingorder(n);
    }
}
