package OgrenciBilgiSistemi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "111");

        Course tarih = new Course("Tarih", "101", "TRH", 0.50);
        Course fizik = new Course("Fizik", "102", "FZK", 0.20);
        Course biyo = new Course("Biyoloji", "101", "BIO", 0.30);

        fizik.addTeacher(t2);
        tarih.addTeacher(t1);
        biyo.addTeacher(t3);

       /* Student s1 = new Student("İnek Şaban", "123", "4",tarih, fizik, biyo);
        s1.addBulkExample(100, 8, 50);
        s1.isPass(); */

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo );
        s2.addBulkExample(50, 60, 70);
        s2.isPass();
        s2.ortAgirlik(20,90,40,0.50, 0.20,0.30);
    }
}

