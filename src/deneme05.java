import java.util.Scanner;

public class deneme05 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        String ad = oku.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String sifre = oku.nextLine();
        /*
        if (ad == "baris" && sifre == "123123"){
            System.out.print("kullanıcı adınız ve şifreniz doğru girilmiştir\nGiriş yapılıyor...");
        }else {
            System.out.print("kullanıcı adınız veya şifreniz yanlış girilmiştir.");
        }*/
        if (ad.equals("barış") && sifre.equals("123123")){  // String'lerde equals kullanılmalıdır.
            System.out.print("kullanıcı adınız ve şifreniz doğru girilmiştir\nGiriş yapılıyor...");
        }else {
            System.out.print("kullanıcı adınız veya şifreniz yanlış girilmiştir.");}


    }
}
