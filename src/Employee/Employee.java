package Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
         if(this.salary>1000) {
             double tax = this.salary*3/100;
             return tax;
        }
         return 0;
    }

    double bonus() {
        if(workHours>40) {
           return (workHours - 40)*30;
        }
        return 0;
    }

    double raiseSalary() {
        int currentYear = 2021;
        int experience = currentYear - this.hireYear;
        double raise = 0;
        if(experience <10) {
           raise = this.salary*5/100;
        }
        else if(experience>9 && experience<20) {
            raise = this.salary*10/100;
        }
        else if(experience>19) {
            raise = this.salary*15/100;
        }
        return raise;
    }

     void print() {
        System.out.println("Adı: " + this.name);
         System.out.println("Maaşı: " + this.salary);
         System.out.println("Çalışma saati: " + this.workHours);
         System.out.println("Başlangıç yılı: " + this.hireYear);
         System.out.println("Vergi: " + tax());
         System.out.println("Bonus: " + bonus());
         System.out.println("Maaş artışı: " + raiseSalary());
         System.out.println("Vergi ve Bonuslar ile birlikte maaş " + (this.salary - tax() + bonus()));
         System.out.println("Toplam maaş: " + (this.salary - tax() + bonus() + raiseSalary()));
    }
}

