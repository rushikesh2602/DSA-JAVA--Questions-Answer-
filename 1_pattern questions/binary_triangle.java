import java.util.Scanner;

public class binary_triangle {

    public static void pattern(int n) {

        for (int i = 1; i<=n; i++) {
            for(int j= 1; j<=i; j++){
                if ((i+j)%2==0) {
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0"+ " ");
                }
              
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        System.out.print("Enter no of lines you want to print:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pattern(a);
    }
    
}
