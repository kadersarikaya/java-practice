package Giris;
import java.util.Scanner;
public class RecursiveUsAlma {

    static int usAl(int taban, int us) {
        if(us>0) {
            return taban*usAl(taban, us-1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban gir");
        int taban = inp.nextInt();
        System.out.println("Üs gir");
        int us = inp.nextInt();
        int sonuc = usAl(taban, us);
        System.out.println(sonuc);
    }
}
