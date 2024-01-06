package Giris;
import java.util.Scanner;
public class ActivityOner {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık gir: ");
        heat = input.nextInt();

        if(heat < 5) {
            System.out.println("Kayak yapabilirsin. ");
        }
        else if(heat <= 25) {
            if(heat<= 15) {
                System.out.println("Sinemaya gideilirsin. ");
            }
            if (heat>=10) {
                System.out.println("Piknik yapabilirsin. ");
            }
        }else {
            System.out.println("Yüzmeye gideblrsin. ");
        }
    }
}
