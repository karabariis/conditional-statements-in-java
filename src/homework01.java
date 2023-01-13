import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {

        int toplam=0, sayici=0;
        Scanner oku = new Scanner(System.in);
        System.out.print("mat notu: ");
        int mat = oku.nextInt();
        if (mat <= 100 && mat >=0){
            toplam+=mat;
            sayici++;
        }
        System.out.print("Fizik notu: ");
        int fizik = oku.nextInt();
        if (fizik <= 100 && fizik >=0){
            toplam+=fizik;
            sayici++;
        }
        System.out.print("Türkçe notu: ");
        int turkce = oku.nextInt();
        if (turkce <= 100 && turkce >=0){
            toplam+=turkce;
            sayici++;
        }
        System.out.print("kimya notu: ");
        int kimya = oku.nextInt();
        if (kimya <= 100 && kimya >=0){
            toplam+=kimya;
            sayici++;
        }
        System.out.print("müzik notu: ");
        int muzik = oku.nextInt();
        if (muzik <= 100 && muzik >=0){
            toplam+=muzik;
            sayici++;
        }

        double average = ((double) (toplam) / sayici);
        if (average <= 55) {
            System.out.println("kaldınız seneye görüşürüz.");
        } else {
            System.out.println("geçtiniz...");
        }System.out.println("Ortalamanız: "+average);



    }
}
