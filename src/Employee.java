public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {
        double tax = 0;

        if (this.salary > 1000) {

            tax = this.salary * 0.03;
        }

        return tax;

    }

    public double bonus() {
        int bonus = 0;
        int perHour = 30;
        int minWorkHour = 40;

        if (this.workHours > minWorkHour) {
            bonus = (this.workHours - minWorkHour) * perHour;
        }

        return bonus;
    }

    public double raiseSalary() {
        double raiseAmount = 0;
        int hireYear = 2021 - this.hireYear;
        if (hireYear < 10) {

            raiseAmount = this.salary * 0.05;

        } else if (hireYear > 9 && hireYear < 20) {

            raiseAmount = this.salary * 0.1;

        } else {

            raiseAmount = this.salary * 0.15;
        }
        return raiseAmount;
    }

        void toStringInfo () {

            System.out.println("İsim\t\t\t:" + this.name);
            System.out.println("Maaşı\t\t\t;" + this.salary);
            System.out.println("Çalışma Saati\t:" + this.workHours);
            System.out.println("Başlangç Yılı\t:" + this.hireYear);
            System.out.println("Vergi\t\t\t:" + tax());
            System.out.println("Bonus\t\t\t:" + bonus());
            System.out.println("Maaş Artışı\t\t:" + raiseSalary());
            System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()));
            System.out.println("Toplam maaş: " + (this.salary + raiseSalary()));

        }

}