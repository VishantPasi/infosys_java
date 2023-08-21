import java.util.Scanner;

public class MultiplyandDivideUsingBitwiseOperator {
    class Utility{
        public static int multiplyby2(int n1){
         int mul = n1<<1;
         return mul;
        }

        public static int Divideby2(int n1){
         int div = n1>>1;
         return div;

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int mul = Utility.multiplyby2(n1);
        int div = Utility.Divideby2(n1);

        System.out.println(mul + "," + div);


        in.close();
    }
    
}
