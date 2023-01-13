import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Hava kaç derece: ");
        int hava = oku.nextInt();

        if (hava<5){
            System.out.println("kayak yap");
        } else if (hava>5 && hava<10) {
            System.out.println("sinema git");
        } else if (hava>15 && hava <25) {
            System.out.println("piknik yap");
        } else if (hava>10 && hava <15) {
            System.out.println("piknik yap veya sinemaya git");
        }else {
            System.out.println("yüzmeye git");
        }

    }
}

