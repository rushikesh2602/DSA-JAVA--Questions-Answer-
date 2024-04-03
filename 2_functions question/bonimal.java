

public class bonimal {


    public static int factorial (int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f*i;
            
        }
        return f;
    }

    public static int bonimals (int a, int r) {
       int fact_n = factorial(a);
      int fact_r = factorial(r);
      int fact_nr = factorial(a-r);

      int bonimals = fact_n / fact_r*fact_nr;

      return bonimals;
    }


    public static void main (String[] args) {
        System.out.println(factorial(10));
       System.out.println(bonimals(10, 05));
  
            
    }
}
