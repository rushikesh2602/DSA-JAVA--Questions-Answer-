import java.util.Scanner;

public class Diamond_pattern {

    public static void Diamond_patterns(int n){
        //first half
        for(int i=1; i<=n; i++) {

            //spaces
            for (int j=1; j<=(n-i); j++ ){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
        //second half
        for(int i=n; i>=1; i--) {

            //spaces
            for (int j=1; j<=(n-i); j++ ){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        System.out.print("Enter no you want to enter:-");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        Diamond_patterns(a);
    }
    
}
