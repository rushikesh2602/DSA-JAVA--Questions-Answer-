import java.util.Scanner;

public class hollow_rectangel {

    public static void hollow_rectangels(int totRows, int totCols) {
        //outer loop
        for (int i=1; i<=totRows; i++) {
            
            //inner - colums
            for(int j=1; j<=totCols; j++) {
                //cell -(i,j)
                if (i == 1 || i == totRows || j==1 || j==totCols) {
                    //boundary cells
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

               
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        System.out.print("enter n*n matrix 1st number that you want to print:-");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        System.out.print("Enter n*n matrix 2nd no you want to print:-");
        int b = sc.nextInt();
        hollow_rectangels(a,b);
    }
}
