import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GreatestOfThree {
    public static void main(String[] args) {
        System.out.print("Please enter three integer values separated by comma: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        List<Integer> inputdata =  Arrays.stream(s.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        int a = inputdata.get(0);
        int b = inputdata.get(1);
        int c = inputdata.get(2);
        
        if (a>b && a>c){
            System.out.println(a+" is the greatest");
        }
        else if (b>a && b>c){
            System.out.println(b+" is the greatest");
        }
        else
            System.out.println(c+" is the greatest");
        
        
        
        
        
        sc.close();
    }
}
