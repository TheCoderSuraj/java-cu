class Employee {
    float salary = 40000;
}

class Programmer extends Employee{
    int bonus = 10000; 
}
public class Inheritance {
    public static void main(String[] args){
        // System.out.println("Hi suraj");
        Programmer p = new Programmer();
        
        System.out.println("Salary: "+p.salary +"\nBonus: " + p.bonus);
    }

}
