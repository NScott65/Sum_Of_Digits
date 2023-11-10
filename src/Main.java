import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum = 0;
        int sum = 0;


        System.out.println("Enter all of your numbers: ");
        if(scan.hasNextInt()){
            userNum = scan.nextInt();
            for(; userNum != 0; userNum /= 10){
                sum += userNum % 10;
            }
            System.out.println("The sum is: " + sum);
        }
    }
}
