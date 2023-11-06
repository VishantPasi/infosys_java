import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class calu{
    public static String calulate(int n,int m){
        if(n%m!=0){
           return "The number is a multiple of m.";
        }
        else{
           return "The number is not a multiple of m.";
        }

    }

}

class isMultipleOrNot{
    


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        List<Integer> numbers = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        String cal = calu.calulate(numbers.get(0),numbers.get(1));
        System.out.println(cal);

    }

}

// class Utility {

// 	public static String isMultiple(int n, int m) {
// 		String result = "Not a multiple" ;
// 		if (n%m != 0)
// 		{
// 			result = "Is a multiple";
// 		}
// 		return result;
// 	}

// }

// class Tester {

// 	private static Scanner in;

// 	public static void main(String[] args) {
// 		in = new Scanner(System.in); 
// 		String inputString = in.nextLine();
//         List<Integer> numbers = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
// 		String result = Utility.isMultiple(numbers.get(0),numbers.get(1));
// 		System.out.println(result);
// 	}

// }