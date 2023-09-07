import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GreatestOfTwo {
    public static void main(String[] args) {
         System.out.print("Please enter two integer values separated by comma: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        List<Integer> inputdata =  Arrays.stream(s.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        int a = inputdata.get(0);
        int b = inputdata.get(1);

        if (a>b)
            System.out.println(a+" is the greatest");
        else
            System.out.println(b+" is the greatest");

        sc.close();
    }
}
