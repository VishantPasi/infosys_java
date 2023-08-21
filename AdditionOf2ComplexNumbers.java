import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdditionOf2ComplexNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		String inputString = in.nextLine(); 	
		List<Integer> inputData = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        int r1 = inputData.get(0);
        int i1 = inputData.get(1);
        int r2 = inputData.get(2);
        int i2 = inputData.get(3);

        System.out.println((r1+r2)+"+"+(i1+i2)+"i");
        in.close();
    }
}

// class Utility {
// 	public static String sumOfComplexNumbers(double r1,double i1,double r2,double i2){
//         String complexSum = "NA";
// 		double realSum = r1+ r2  ;
// 		double imgSum = i1+ i2  ;
// 		complexSum = realSum+" + "+ imgSum;
//         return complexSum;
//    }
	
// }


// class Tester {
// 	public static void main(String[] args) {
// 		  String complexSum =Utility.sumOfComplexNumbers(4.4,2,3,7.6);
// 	       System.out.println("Sum of 2 complex numbers: "+complexSum+"i");
// 	}
	
// }