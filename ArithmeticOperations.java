

class Utility{
    public static int addNumbers(int n1, int n2){
        int sum = 0;
        sum = n1 + n2;
        return sum;
    }
    public static int MultiplyNumbers(int n1, int n2){
        int mul = 0;
        mul = n1 * n2;
        return mul;
    }
    public static int SubtractNumbers(int n1, int n2){
        int sub = 0;
        sub = n1 - n2;
        return sub;
    }
    public static int DivideNumbers(int n1, int n2){
        int div = 0;
        div = n1 / n2;
        return div;
    }
}
public class ArithmeticOperations {
    public static void main(String[] args) {

        int sum = Utility.addNumbers(3,2);
        int sub = Utility.SubtractNumbers(3, 1);
        float mul = Utility.MultiplyNumbers(3, 2);
        float div = Utility.DivideNumbers(5, 3);

        System.out.println("addition: "+sum+"\nsubtraction: "+sub+"\nmultiply: "+mul+"\ndivide: "+div);


    }
}
