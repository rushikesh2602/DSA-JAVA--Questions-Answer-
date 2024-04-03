import java.util.Scanner;

public class solid_rhombus {

    public static void rhombus_pattern(int n){
        //outer loop
        for(int i=1; i<=n; i++){

            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.print("Enter no you want to enter:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        rhombus_pattern(a);
    }
    
}
