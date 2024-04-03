import java.util.Scanner;

public class Hollow_rhombus {

    public static void hollow(int n){

        //outer loop
        for(int i = 1; i<=n; i++) {

            // spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //hollow rectangel/rhombus stars
            for(int j=1; j<=n; j++){
                if (i==1 || i==n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
               
            }
            // next line 
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter no you want to print:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        hollow(a);
    }
    
}

