import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
class SalaryandTaxComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> numbers = Arrays.stream(s.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        
        
        int B = numbers.get(0);
        int T = numbers.get(1);
        int H = numbers.get(2);

        double G = B + T + H;
        double N = 0;
        if (G>55000){
            N = G - (0.082 * G) ;
        }
        
        System.out.println(N);
        
        
        
        sc.close();
    }
}
