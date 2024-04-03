public class factorial{


    public static int factorials (int n) {
        int f = 1;
        for (int i=1; i<=n; i++) {
            f = f*i;
        }
        return f;
    }

    public static void sum (int a, int b) {
        a = a + b;
        System.out.println(a);
    }
public static void main(String[] args) {

   System.out.println(factorials(4)); 
   sum(5, 9);
    
    
}

}