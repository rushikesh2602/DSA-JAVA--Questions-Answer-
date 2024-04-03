/**
 * reverse_number
 */
public class reverse_number {

    public static void printreverse(int n) {

        if (n==1) {
            System.out.println("1");
            return;
            
        }
        System.out.print(n + " ");

        printreverse(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printreverse(n);
    }
}