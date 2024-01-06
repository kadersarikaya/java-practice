package Giris;
import java.util.Scanner;

public class SinifGecmeDurum {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz matematik notu girişi. Lütfen 0-100 arasında bir değer girin.");
            return; // Programı sonlandır
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz Türkçe notu girişi. Lütfen 0-100 arasında bir değer girin.");
            return;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz fizik notu girişi. Lütfen 0-100 arasında bir değer girin.");
            return;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz kimya notu girişi. Lütfen 0-100 arasında bir değer girin.");
            return;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz müzik notu girişi. Lütfen 0-100 arasında bir değer girin.");
            return;
        }

        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        System.out.println("Ortalamanız : " + average);

        if (average <= 55) {
            System.out.println("Kaldınız:(");
        } else {
            System.out.println("Geçtiniz:)");
        }
    }
}
