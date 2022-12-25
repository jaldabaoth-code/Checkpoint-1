public class Factorial {
   // TODO facto
   public static int facto(int n) {
       if (n == 0 || n == 1) {
           return 1;
       }
       return n * facto(n - 1);
   }
}
