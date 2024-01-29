package BoxMatch;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

        // Başlangıçta hangi dövüşçünün hamle yapacağını belirle (%50 olasılıkla)
        Random random = new Random();
        boolean f1Starts = random.nextBoolean();

        if (f1Starts) {
            System.out.println(f1.name + " ilk hamleyi yapıyor.");
        } else {
            System.out.println(f2.name + " ilk hamleyi yapıyor.");
            // Eğer f2 başlıyorsa, dövüşçülerin yerini değiştir
            Fighter temp = this.f1;
            this.f1 = this.f2;
            this.f2 = temp;
        }
    }

    public void  run() {
        if (isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("===========YENİ ROUND==============");
                this.f2.health = this.f1.hit(f2);
                if(isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight<= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight<= maxWeight);
    }

    boolean isWin() {
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı");
            return true;
        }

        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı");
            return true;
        }
        return false;
    }
}
