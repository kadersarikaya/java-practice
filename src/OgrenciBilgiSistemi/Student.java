package OgrenciBilgiSistemi;
public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stduNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stduNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stduNo = stduNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExample(int note1, int note2, int note3) {
        if(note1 >= 0 && note2 <= 100 ) {
            c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100 ) {
            c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100 ) {
            c3.note = note3;
        }
    }

    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if(this.avarage > 55) {
            System.out.println("Hababam uyanıyor:))");
            this.isPass = true;
        }else {
            System.out.println("Hababam sınıfta kaldı:(");
            this.isPass = false;
        }
        printNote();
    }
    void ortAgirlik(int sozluNote1, int sozluNote2, int sozluNote3,
                    double perSozlu1, double perSozlu2, double perSozlu3) {

        this.c1.sozluNote = sozluNote1;
        this.c2.sozluNote = sozluNote2;
        this.c3.sozluNote = sozluNote3;

        this.c1.perSozlu = perSozlu1;
        this.c2.perSozlu = perSozlu2;
        this.c3.perSozlu = perSozlu3;

        double tarihOrt = (this.c1.note * this.c1.perNote + sozluNote1 * perSozlu1);
        double fizikOrt = (this.c2.note * this.c2.perNote + sozluNote2 * perSozlu2);
        double bioOrt = (this.c3.note * this.c3.perNote + sozluNote3 * perSozlu3);

        this.avarage = (tarihOrt + fizikOrt + bioOrt) / 3.0;

        System.out.println("Tarih ort: " + tarihOrt);
        System.out.println("Fizik ort: " + fizikOrt);
        System.out.println("Bioloji ort: " + bioOrt);
    }

    void printNote() {
        System.out.println(this.c1.name + "Notu: " + this.c1.note);
        System.out.println(this.c2.name + "Notu: " + this.c2.note);
        System.out.println(this.c3.name + "Notu: " + this.c3.note);
        System.out.println("Ortalamanız:" + this.avarage);
    }
}


