import java.util.Scanner;

public class deneme03 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        int sayi1 = oku.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = oku.nextInt();

        System.out.print("Toplama işlemi için 1, Çıkarma işlemi için 2, Çarpma işlemi için 3, Bölme işlemi için 4'ü giriniz....");
        System.out.print("Yapılıcak işlem: ");
        int islem = oku.nextInt();

        if (islem == 1){
            int c = (sayi1+sayi2);
            System.out.println("Toplam: "+c);
        } else if (islem == 2) {
            int d = (sayi1-sayi2);
            System.out.println("Çıkarma işlemi:"+d);
        } else if (islem ==3) {
            int e = (sayi1*sayi2);
            System.out.println("Çarpma işlemi: "+e);
        }else {
            if (sayi1 != 0 && sayi2 != 0) {
                double f = ((double) sayi1 / sayi2);
                System.out.println("Bölme işlemi: " + String.format("%.2f",f));
            }else {
                System.out.println("Sıfır veya uygunsuz karekter kullanımı...\nİslem sonlandırıldı...");
            }
        }

    }
}
