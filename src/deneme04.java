import java.util.Scanner;

public class deneme04 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        int sayi1 = oku.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = oku.nextInt();

        System.out.print("Toplama işlemi için 1, Çıkarma işlemi için 2, Çarpma işlemi için 3, Bölme işlemi için 4'ü giriniz....Yapılıcak işlem: ");
        int islem = oku.nextInt();

        switch (islem){
            case 1:
                int a = (sayi1+sayi2);
                System.out.println("Toplam: "+a);
                break;
            case 2:
                int b = (sayi1-sayi2);
                System.out.println("Çıkarma: "+b);
                break;
            case 3:
                int c = (sayi1*sayi2);
                System.out.println("Çarpma: "+c);
                break;
            case 4:
                if (sayi1 !=0  && sayi2 != 0) {
                    Double d = ((double) sayi1 / sayi2);  //int gelen veriyi double çevirme.
                    System.out.print("Bölme: " + String.format("%.2f", d));
                    break;
                }else {
                    System.out.println("Sıfır girişi olmuştur.");
                }
            default:
                System.out.print("İslem Sonladırıldı");

        }

    }
}
