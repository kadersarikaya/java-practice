package Giris;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, resetPass, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("kaders") && password.equals("java123")) {
            System.out.print("Giriş Yaptınız: ");
        }else if(!password.equals("java123")) {
            System.out.println("Şifreniz Yanlış! ");
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (Y/N): ");
            resetPass = input.nextLine();
            if(resetPass.equals("y") || resetPass.equals("Y")) {
                System.out.print("Yeni şifrenizi girin: ");
                newPassword = input.nextLine();
                if(newPassword.equals(password)) {
                    System.out.print("Şifreniz oluşturulamadı! Lütfen başka şifre girin! ");
                }
                else {
                    System.out.print("Şifreniz başarıyla değiştirildi! ");
                }
            }
        }

        else {
            System.out.println("Bilgileriniz Yanlış! ");
        }
    }
}
