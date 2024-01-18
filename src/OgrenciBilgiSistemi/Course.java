package OgrenciBilgiSistemi;
public class Course {
    Teacher teacher;
   String name;
   String code;
   String prefix;
   int note;
   int sozluNote;
   double perSozlu;
   double perNote=1-perSozlu;

    Course(String name, String code, String prefix, double perSozlu) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNote = 0;
        this.perSozlu = perSozlu;
        this.perNote = 1 - perSozlu;
    }


    void addTeacher(Teacher teacher) {
       if(teacher.branch.equals(this.prefix)) {
           this.teacher = teacher;
           printTeacher();
       } else {
           System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
       }
   }
   void printTeacher() {
       this.teacher.print();
   }

}
