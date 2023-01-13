import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("First number: ");
        int fnum = read.nextInt();

        System.out.print("Second number: ");
        int snum = read.nextInt();

        System.out.print("Third number: ");
        int tnum = read.nextInt();

        /*
        if (fnum<snum && fnum<tnum){
            System.out.println(fnum+" Smaller number");
        } else if (fnum<snum && fnum>tnum || fnum>snum && fnum<tnum) {
            System.out.println(fnum+" Second number");
        } else if (fnum>snum && fnum>tnum) {
            System.out.println(fnum+" third numnber");
        }
        if (snum<fnum && snum<tnum){
            System.out.println(snum+" Smaller number");
        } else if (snum < fnum && snum > tnum || snum>fnum && snum<tnum) {
            System.out.println(snum+" Second number");
        } else if (snum>fnum && snum>tnum) {
            System.out.println(snum+" third number");
        }
        if (tnum<fnum && tnum<snum){
            System.out.println(tnum+" Smaller number");
        } else if (tnum < fnum && tnum > snum || tnum>fnum && tnum<snum) {
            System.out.println(tnum+" Second number");
        } else if (tnum>fnum && tnum>snum) {
            System.out.println(tnum+" third number");
        }*/

        if (fnum>snum && fnum>tnum){
            if (snum>tnum){
                System.out.println("first number > Second number > Third number");
            }else {
                System.out.println("first number > Third number > Second number");
            }
        }
        if (snum>fnum && snum>tnum){
            if (fnum>tnum){
                System.out.println("Second number > first number > Third number");
            }else {
                System.out.println("Second number > Third number > first number");
            }
        }
        if (tnum>fnum && tnum>snum){
            if (fnum>snum){
                System.out.println("Third number > first number > Second number");
            }else {
                System.out.println("Third number > Third number > first number");
            }
        }
    }
}
