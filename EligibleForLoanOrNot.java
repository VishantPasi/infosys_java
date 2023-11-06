import java.util.Scanner;

class Utility{
    public static String calulate(int l){
        if(l >= 40000){
            return "Eligible";
        }
        else{
            return "Not Eligible";
        }

    }

}

class EligibleForLoanOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();

        String statement = Utility.calulate(sal); 
        System.out.println(statement);
    }

}