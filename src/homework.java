import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        String ad = oku.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String sifre = oku.nextLine();

        if (ad.equals("barış")){
            System.out.println("Kullanıcı adınız başarılı...");
        }else{
            System.out.println("Kullanıcı adınız hatalı!");
        }
        if(sifre.equals("123123")){
            System.out.println("Başarılı giriş yapıldı.");
        } else {
            System.out.print("Şifreniz hatalı\nŞifreniz sıfırlansın mı?");
            String sifre1 = oku.nextLine();
            System.out.print("Yeni şifreniz: ");
            String ysifre = oku.nextLine();

            if (ysifre.equals("123123")){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.\nYeni şifre: ");
            }else {
                System.out.println("Şifreniz güncellendi...");
            }

        }
    }
}
