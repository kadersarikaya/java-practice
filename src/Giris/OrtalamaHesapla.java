package Giris;

import java.util.Scanner;

/* Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak... */
public class OrtalamaHesapla {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam /6.0;

        boolean isPassed = sonuc>=60;
        System.out.println("Ortalamanız : " + Math.floor(sonuc));
        System.out.println("Sınıf" + (isPassed ? "ı Geçtiniz" : "tan Kaldınız"));
    }
}
