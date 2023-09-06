import java.util.Scanner;

//First Method: 

class NoOfDigits {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int le = s.length();
        
        for (int i=1; i<=le; i++){
            count = count + 1;
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}

//Second Method:


// class NoOfDigits {

//   public static void main(String[] args) {

//     int count = 0;
//     Scanner sc = new Scanner(System.in);
//     String n = sc.next();
//     int num = Integer.parseInt(n);
//     for (; num != 0; num /= 10, ++count) {
//     }

//     System.out.println("Number of digits: " + count);
//     sc.close();
//   }
  
// }
