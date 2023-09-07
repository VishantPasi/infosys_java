import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class GreatestOf3OptimalSolution {
    public static void main(String[] args) {
        int greatest_no = 0;

        System.out.print("Please enter three integer values separated by comma: ");
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Integer> inputdata = Arrays.stream(s.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        int a = inputdata.get(0);
        int b = inputdata.get(1);
        int c = inputdata.get(2);

        if (a>b && a>c)
            greatest_no = a;
        else if (b>c)
            greatest_no = b;
        else
            greatest_no = c;

        System.out.println(greatest_no+" is the Greatest");
        
        
        
        
        sc.close();

    }
}
