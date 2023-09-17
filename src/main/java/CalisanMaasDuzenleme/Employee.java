package CalisanMaasDuzenleme;

public class Employee {
    String name ;
    double salary;
    int workHours,hireYear;

    public Employee() {
    }

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax (){
         if (salary>=1000){
             return 1000*0.03;
         }
         return 0.0;
    }

    public double bonus (){
        int extraHours=workHours-40;
         return 30*workHours;
    }

    public double incrase (){
         int year=2020-hireYear;
         if (year<10) {
             return salary * 0.05;
         }else if (year>=10 && year<20){
             return salary*0.10;
         }else {
             return salary*0.15;
         }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
