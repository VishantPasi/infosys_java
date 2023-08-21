import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Swap2NumbersWithoutTempVariable {
    class Utility{
        public static String swapNumbers(int n1,int n2){
            n1 = n1 ^ n2;
            n2 = n1 ^ n2;
            n1 = n1 ^ n2;
            String swap = n1 + "," + n2;
            return swap;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> inputData = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        int n1 = inputData.get(0);
        int n2 = inputData.get(1);
        String swap1 = Utility.swapNumbers(n1,n2);
        System.out.println(swap1);
        in.close();



    }
}
