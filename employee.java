public class employee{
    String name;
    int id;
    double salary;
    employee(String name, int id,double salary)
    {
        this.name=name;
        this.id=id;

        this.salary=salary;
    }
    void displayInfo(){
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String[] args)
    {
        employee emp1= new employee("Shreya", 100, 50000.0);
        emp1.displayInfo();
    }
}
