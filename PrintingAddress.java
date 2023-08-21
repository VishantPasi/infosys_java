// import java.util.Scanner;





// public class PrintingAddress {
//      class Utility {
//     public static void printMessage(String houseNumber, String streetName, String city){
//         //Multi-line Output
//         // System.out.println("House Number: "+houseNumber);
//         // System.out.println("Street Name: "+ streetName);
//         // System.out.println("City: "+city);
        
//         //Single line output
//          System.out.println("House Number: "+houseNumber+ " Street Name: "+ streetName+ " City: "+city);
//     }
// }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String n1 = in.nextLine();
//         String n2 = in.nextLine();
//         String n3 = in.nextLine();
//         Utility.printMessage(n1,n2,n3);
       
//     }
// }


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


class Tester {
    
    class Utility {
    public static void printMessage(String houseNumber, String streetName, String city){
        //Multi-line Output
        // System.out.println("House Number: "+houseNumber);
        // System.out.println("Street Name: "+ streetName);
        // System.out.println("City: "+city);
        
        //Single line output
         System.out.println("House Number: "+houseNumber+ " Street Name: "+ streetName+ " City: "+city);
    }
}
    
    public static void main(String[] arr){
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<String> numbers = Arrays.stream(inputString.split(","))
                .collect(Collectors.toList());
        String houseNumber = numbers.get(0);
        String streetName =  numbers.get(1);
        String city =  numbers.get(2);
       
        Utility.printMessage(houseNumber, streetName, city);
        in.close();
    }
}