public class employee{
    String name;
    int id;
    int age;
    double salary;
    employee(String name, int id, int age,double salary)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
    }
    void displayInfo(){
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String[] args)
    {
        employee emp1= new employee("Shreya", 100, 20, 500000.0);
        emp1.displayInfo();
    }
}
