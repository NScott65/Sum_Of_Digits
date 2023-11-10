import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum;
        int sum = 0;

        System.out.println("Enter all of your numbers: ");
        if(scan.hasNextInt()){
            userNum = scan.nextInt();
            for(int i = 0; i < userNum; i++){
                int s = userNum % 10;
                int p = s / 10;
                 sum = sum + p;
            }
            System.out.println("The sum is: " + sum);
        }
    }
}