import java.util.Scanner;

public class homework07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("please enter year: ");
        int year = read.nextInt();

        if (year%4==0 || year%400==0){
            System.out.print(year + " is a leap year!");
        }else {
            System.out.print(year + " is not a leap year!");
        }
    }
}
